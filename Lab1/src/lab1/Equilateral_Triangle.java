/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import lab1.Triangle;


/**
 *
 * @author todgi
 */
public class Equilateral_Triangle extends Triangle{
    private double side;
    
    public Equilateral_Triangle(String name) {
        super(name);
    }
    
    public void setDimensions(double side) {
        this.side = side;
    }
    
    @Override
    public void printDimensions() {
        System.out.println("Side 1 : " + this.side);
        System.out.println("Side 2: " + this.side);
        System.out.println("Side 3: " + this.side);
    }
    
    @Override
    public double getArea() {
        double perimeter, s;
        perimeter = this.side + this.side + this.side;
        s = perimeter / 2.0;
        return Math.sqrt(s * (s - this.side) * (s - this.side) * (s - this.side));
    }
}
