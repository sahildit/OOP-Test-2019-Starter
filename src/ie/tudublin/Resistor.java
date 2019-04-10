package ie.tudublin;

import javax.swing.table.TableColumn;

import processing.data.*;
public class Resistor
{
    public float value;
    public float ones;
    public float tens;
    private String hundreds;

    public Resistor(float vale,float ones, float tens,String hundreds)
    {
        this.value = value;
        this.ones = ones;
        this.tens = tens;
        this.hundreds = hundreds;
    }

    public Resistor(TableRow tr)
        {
        this(tr.getFloat("value"),tr.getFloat("ones"),tr.getFloat("tens"),tr.getString("hundreds")); 
        }

    /**
     * @return the value
     */
    public float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * @return the ones
     */
    public float getOnes() {
        return ones;
    }

    /**
     * @param ones the ones to set
     */
    public void setOnes(float ones) {
        this.ones = ones;
    }

    /**
     * @return the tens
     */
    public float getTens() {
        return tens;
    }

    /**
     * @param tens the tens to set
     */
    public void setTens(float tens) {
        this.tens = tens;
    }

    /**
     * @return the hundreds
     */
    public String getHundreds() {
        return hundreds;
    }

    /**
     * @param hundreds the hundreds to set
     */
    public void setHundreds(String hundreds) {
        this.hundreds = hundreds;
    }

    public String toString()
    {
        return value +  "\t" + ones + "\t" + tens + "\t" + hundreds;
    }
   
}