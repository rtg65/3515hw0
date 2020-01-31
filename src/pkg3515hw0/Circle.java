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
public class Circle extends Shape{
    private double radius;
    
    public Circle(String name) { 
        super(name);
        radius = 0.0;
    }
    
    /**
     * @return Circle's area */ 
    @Override
    public double getArea() { 
        return 2*Math.PI*radius; 
    }
    
    /**
     * Set the circle's radius */ 
    public void setDimensions(double r){
        radius = r;
    }
    
    /**
     *prints circle's Dimensions
     */
    @Override
    public void printDimensions(){ 
        System.out.println("Radius: " + radius); 
    }
}
