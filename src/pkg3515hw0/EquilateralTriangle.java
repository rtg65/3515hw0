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
public class EquilateralTriangle extends Triangle{
    private double sides;
    
    public EquilateralTriangle(String name) { 
        super(name);
        sides = 0.0;
    }
    
    /**
     * @return triangle's area */ 
    @Override
    public double getArea() { 
        double s = (sides+sides+sides)/2;
        return Math.sqrt(s*(s-sides)*(s-sides)*(s-sides)); 
    }
    
    /**
     * Set the length of the triangle's sides */ 
    public void setDimensions(double s){
        sides = s;
    }
    
    /**
     *prints trangle's Dimensions
     */
    @Override
    public void printDimensions(){ 
        System.out.println("Sides: " + sides); 
    }
}
