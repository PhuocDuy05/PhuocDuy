/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package OOP.BT01;

/**
 *
 * @author ADMIN
 */
public class RecTangle {

    private double length;
    private double width;

    public RecTangle() {
        length = 1.0;
        width = 1.0;
    }

    public RecTangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //phuong thuc su ly tinh toan 
    public double findArea() {
        double area = length*width;
        return area;
    }
    public double findPerimeter(){
        double result = (length+ width)*2;
        return result;
    }
}
