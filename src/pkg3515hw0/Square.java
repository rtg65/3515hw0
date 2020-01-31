/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3515hw0;


/**
 *
 * @author tuc73313
 */
public class Square extends Shape {
    
    private double length;
    private double height;
    
    public Square(String name) { 
        super(name);
        length = 0.0;
        height = 0.0;
    }
    
    /**
     * @return square's area */ 
    @Override
    public double getArea() { 
        return length * height; 
    }
    
    /**
     * Set the square's length and height */ 
    public void setDimensions(double l, double h){
        length = l;
        height = h;
    }
    
    /**
     *prints square's Dimensions
     */
    @Override
    public void printDimensions(){ 
        System.out.println("Length: " + length + "\nHeight: " + height); 
    }
}
