/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.BT01;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinh {

    public static void main(String[] args) {
        RecTangle r1;
        RecTangle r2;

        //tao doi tuong r1
        r1 = new RecTangle();

        //tao doi tuong r2
        Scanner sc = new Scanner(System.in);
        System.out.println("cho biet chieu dai:");
        double dai = sc.nextDouble();
        System.out.println("cho biet chieu rong:");
        double rong = sc.nextDouble();
        
        r2= new RecTangle(dai, rong);
        
        //Xuat thong tin co ban
        System.out.println("Thong tin HCN thu 1.");
        System.out.println("Dai:" +r1.getLength() + "Rong:" +r1.getWidth() +"Dien tich:" + r1.findArea()+ "Chu Vi:" + r1.findPerimeter());
        System.out.println("Dai:" +r2.getLength() + "Rong:" +r2.getWidth() +"Dien tich:" + r2.findArea()+ "Chu Vi:" + r2.findPerimeter());

    }
}
