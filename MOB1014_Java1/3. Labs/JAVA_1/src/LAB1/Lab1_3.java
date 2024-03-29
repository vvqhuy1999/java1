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
public class Lab1_3 {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      // TODO code application logic here
      float Canh;
        float Thetich;
        Scanner NhapLieu = new Scanner(System.in);
        System.out.print("Mời bạn nhập Cạnh: ");
        Canh= NhapLieu.nextFloat();
        Thetich= Canh * Canh * Canh;
        System.out.printf("Thể tích:  %.0f",Thetich);
   }
}
