/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lab3_1 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Nhập một số nguyên: ");
      int N = scanner.nextInt();
      boolean ok = true;
      if(N==1){
         System.out.println(N + " không là số nguyên tố.");
      }
      else{
         for(int i=2; i < N-1; i++){ // N là số nhập từ bàn phím
            if(N % i == 0){
               ok = false;
               break;
            }
            i++;
         }
         if(ok == true){
            System.out.println(N + " là số nguyên tố.");
         }
         else System.out.println(N + " không là số nguyên tố.");
      }
   }
   
}
