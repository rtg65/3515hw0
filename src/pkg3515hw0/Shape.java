package pkg3515hw0;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuc73313
 */
public class Shape {
    private  String name;
    public Shape(String name) { 
        this.name = name; 
    }
    
    /** returns the name of the shape
     * @return shape's name */ 
    public String getName() { 
        return name; 
    }
    
    /** returns the area of the shape
     * @return shape's area */ 
    public double getArea() { 
        return 0.0; 
    }
    
    public void printDimensions(){ 
        System.out.println("No Dimensions"); 
    }
}
