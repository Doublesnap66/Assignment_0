/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import lab1.Square;
/**
 *
 * @author todgi
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Square square = new Square("square");
        square.setDimensions(2.0, 2.0);
        square.printDimensions();
        System.out.println("Square Area: " + square.getArea());
        
        Circle circle = new Circle("circle");
        circle.setDimensions(2.0);
        circle.printDimensions();
        System.out.println("Circle Area: " + circle.getArea());
        
        Triangle triangle = new Triangle("triangle");
        triangle.setDimensions(2.0, 2.0, 3.0);
        triangle.printDimensions();
        System.out.println("Triangle Area: " + triangle.getArea());
        
        Equilateral_Triangle equilateral = new Equilateral_Triangle("equilateral");
        equilateral.setDimensions(3.0);
        equilateral.printDimensions();
        System.out.println("Equilateral Triangle Area: " + equilateral.getArea());
    }
    
}
