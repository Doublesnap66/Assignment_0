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
        System.out.println(square.getArea());
    }
    
}
