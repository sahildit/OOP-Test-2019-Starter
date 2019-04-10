package ie.tudublin;

import javax.swing.table.TableColumn;

import processing.data.*;
public class Colour
{
    public float r;
    public float g;
    public float b;
    private String colour;

    public Colour(float r,float g, float b,String colour)
    {
        this.r = r;
        this.g  =g;
        this.b = b;
        this.colour = colour;
    }

    // public Colour(TableColumn column)
    // {
    //     this((column.getFloat("r"),column.getFloat("g"),column.getFloat("b"),column.getString(colour)); 
    // }

    /**
     * @return the r
     */
    public float getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(float r) {
        this.r = r;
    }

    /**
     * @return the g
     */
    public float getG() {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(float g) {
        this.g = g;
    }

    /**
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString()
    {
        return r + "\t" + g + "\t" + b + "\t" + colour;
    }
   
}