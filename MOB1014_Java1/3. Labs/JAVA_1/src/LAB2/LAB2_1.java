/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package LAB2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class LAB2_1 {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      // TODO code application logic here
      System.out.println("PT Bật nhất:");
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Nhap a:");
      int a = scanner.nextInt();
      System.out.println("Nhap b:");
      int b = scanner.nextInt();
//      int max = a>b?a:b;
//      System.out.println("MAX: "+ max);
      float x;
      if(a==0){
         if(b==0){
            System.out.println("PT vô số nghiệm.");
         }
         else{
         System.out.println("PT vô nghiệm");
         }
      }
      else{
      x = (float) -b/a;
      System.out.println("PT có nghiem: " + x);
      }
      
   }
}
