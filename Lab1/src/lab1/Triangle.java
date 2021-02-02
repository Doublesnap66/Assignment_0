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
public class Triangle extends Shape{
    private double length;
    private double height;
    
    public Triangle(String name) {
        super(name);
    }
    
    public void setDimensions(double length, double height) {
        this.length = length;
        this.height = height;
    public void printDimensions() {
        System.out.println("Length: " + this.length);
        System.out.println("Height: " + this.height);
    }
    
    @Override
    public double getArea() {
        return this.length * this.height;
    }
}
