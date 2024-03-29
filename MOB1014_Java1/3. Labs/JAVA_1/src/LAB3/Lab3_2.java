/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package LAB3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lab3_2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      // TODO code application logic here
      Scanner scanner = new Scanner(System.in);
      System.out.print("Nhập bang cuu chuong: ");
      int N = scanner.nextInt();
      for(int i=1;i<=10;i++){
         System.out.printf("%d x %d = %d", N,i,N*i);
         System.out.println();
      }
      System.out.print("9 Bang cuu chuong: ");
      System.out.println();
      for(int i=1;i<10;i++){
         System.out.printf("Bang cuu chuong %d: ",i);
         System.out.println();
         for(int j = 1; j<=10;j++){
            System.out.printf("%d x %d = %d", i,j,j*i);
            System.out.println();
         }
      }
   }
}
