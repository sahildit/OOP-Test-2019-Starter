/*Sahil sahil D17124269*/

package ie.tudublin;

import java.util.ArrayList;

import javax.swing.table.TableColumn;

//import com.sun.rowset.internal.Row;

//import com.sun.rowset.internal.Row;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{
	private ArrayList<Colour> colours = new ArrayList<Colour>();
	private ArrayList<Resistor> resistors = new ArrayList<Resistor>();

	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		loadColours();
		//loadResistors();
	}

	public void loadColours()
	{
		Table table = loadTable("colours.csv", "header");
        for(TableRow row : table.rows())
        {
            Colour c = new Colour(row);
            colours.add(c);
        }

	}

	public void loadResistors()
	{
		Table table = loadTable("resistors.csv", "header");
        for(TableRow row : table.rows())
        {
            Resistor c = new Resistor(row);
            resistors.add(c);
        }

	}
	

	public void printColours()
	{
		for(int i = 0; i < colours.size(); i++)
		{
            System.out.println(colours.get(i));
		}
	}
	
	public Colour findColor(int value)
	{
		return null;
		
	}
	public void draw()
	{		
		printColours();	
	}
}
