/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3515hw0;
import java.util.HashSet;
import java.util.Scanner; 
/**
 *
 * @author tuc73313
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initilize Scanner
        Scanner scan = new Scanner(System.in);
        
        //Initilize basic Shape
        System.out.println("Hello!\n\nPlease enter the name of the Shape:");
        String s = scan.next();
        Shape shape = new Shape(s);
        
        //Initilize Square
        System.out.println("Please enter the name of the Square:");
        s = scan.next();
        Square square = new Square(s);
        System.out.println("Please enter the length of the Square:");
        int length = scan.nextInt();
        System.out.println("Please enter the height of the Square:");
        int Height = scan.nextInt();
        square.setDimensions(length, Height);

        
        //Initilize Circle
        System.out.println("Please enter the name of the Circle:");
        s = scan.next();
        Circle circle = new Circle(s);
        System.out.println("Please enter the radius of the Circle:");
        int radius = scan.nextInt();
        circle.setDimensions(radius);
        
         //Initilize Triangle
        System.out.println("Please enter the name of the triangle:");
        s = scan.next();
        Triangle triangle = new Triangle(s);
        System.out.println("Please enter the first side of the Triangle:");
        int s1 = scan.nextInt();
        System.out.println("Please enter the second side of the Triangle:");
        int s2 = scan.nextInt();
        System.out.println("Please enter the third side of the Triangle:");
        int s3 = scan.nextInt();
        triangle.setDimensions(s1, s2, s3);
        
        //Initilize Equilateral Triangle
        System.out.println("Please enter the name of the Equilateral Triangle:");
        s = scan.next();
        EquilateralTriangle etriangle = new EquilateralTriangle(s);
        System.out.println("Please enter length of the sides of the Equilateral Triangle:");
        int side = scan.nextInt();
        etriangle.setDimensions(side);
        
        //Print Data
        System.out.println("Here are our contestants!");
        System.out.println("First we have Shape " + shape.getName() + "!\nWith Dimensions:");
        shape.printDimensions();
        System.out.println("And Area " + shape.getArea()+ "!");
        System.out.println("Secondly we have Square " + square.getName() + "!\nWith Dimensions:");
        square.printDimensions();
        System.out.println("And Area " + square.getArea()+ "!");
        System.out.println("Third we have Circle " + circle.getName() + "!\nWith Dimensions:");
        circle.printDimensions();
        System.out.println("And Area " + circle.getArea()+ "!");
        System.out.println("Next we have Triangle " + triangle.getName() + "!\nWith Dimensions:");
        triangle.printDimensions();
        System.out.println("And Area " + triangle.getArea()+ "!");
        System.out.println("And last, but certainly not least, we have Equilateral Triangle " + etriangle.getName() + "!\nWith Dimensions:");
        etriangle.printDimensions();
        System.out.println("And Area " + etriangle.getArea()+ "!");
        System.out.println("And they are off! Who do you think will win?");
    }
    
}
