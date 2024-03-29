/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package LAB1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lab1_4 {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      // TODO code application logic here
      float a;
        float b;
        float c;
        float Delta, CanDelta;
        Scanner NhapLieu = new Scanner(System.in);
        System.out.print("Mời bạn nhập số a: ");
        a= NhapLieu.nextFloat();
        System.out.print("Mời bạn nhập số b: ");
        b= NhapLieu.nextFloat();
        System.out.print("Mời bạn nhập số c: ");
        c= NhapLieu.nextFloat();
        Delta= (float)(Math.pow(b,2)-4 * a * c);
        CanDelta = (float)(Math.sqrt(Delta));
        System.out.println("Delta: "+ Delta + " Căn Delta: " + CanDelta);
   }
}
