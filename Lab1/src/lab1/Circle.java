/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import lab1.Shape;
/**
 *
 * @author todgi
 */
public class Circle extends Shape{
    private double radius;
    
    public Circle(String name) {
        super(name);
    }
    
    public void setDimensions(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void printDimensions() {
        System.out.println("Radius: " + this.radius);
    }
    
    @Override
    public double getArea() {
        return this.radius * this.height;
    }
}
