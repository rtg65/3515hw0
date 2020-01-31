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
public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(String name) { 
        super(name);
        side1 = 0.0;
        side2 = 0.0;
        side3 = 0.0;
    }
    
    /**
     * @return trangle's area */ 
    @Override
    public double getArea() { 
        double s = (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)); 
    }
    
    /**
     * Set the length of the triangle's sides */ 
    public void setDimensions(double s1, double s2, double s3){
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    
    /**
     *prints trangle's Dimensions
     */
    @Override
    public void printDimensions(){ 
        System.out.println("First Side: " + side1 + "\nSecond Side: " + side2 + "\nThird Side: " + side3); 
    }
}
