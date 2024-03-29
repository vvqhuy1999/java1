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
public class Lab1_2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      // TODO code application logic here
      float ChieuDai;
        float ChieuRong;
        float Chuvi;
        float Dientich;
        float CanhMin;
        Scanner NhapLieu = new Scanner(System.in);
        System.out.print("Mời bạn nhập Chiều dài: ");
        ChieuDai= NhapLieu.nextFloat();
        System.out.print("Mời bạn nhập Chiều rộng: ");
        ChieuRong= NhapLieu.nextFloat();
        Chuvi= (ChieuDai + ChieuRong) *2;
        Dientich= ChieuDai * ChieuRong;
        CanhMin= Math.min(ChieuDai, ChieuRong);
        System.out.printf("Chu vi: %.0f   Dientich: %.0f\n   CanhMin: %.0f",Chuvi, Dientich,CanhMin);
   }
}
