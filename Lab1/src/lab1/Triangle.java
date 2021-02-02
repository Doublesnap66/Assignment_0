/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import lab1.Shape;
import java.lang.Math;
/**
 *
 * @author todgi
 */
public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(String name) {
        super(name);
    }
    
    public void setDimensions(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    public void printDimensions() {
        System.out.println("Side 1 : " + this.side1);
        System.out.println("Side 2: " + this.side2);
        System.out.println("Side 3: " + this.side3);
    }
    
    @Override
    public double getArea() {
        double perimeter, s;
        perimeter = this.side1 + this.side2 + this.side3;
        s = perimeter / 2.0;
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }
}
