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
public class LAB2_3 {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      // TODO code application logic here
      float Sodien;
        double Tien;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập số điện: ");
        Sodien= scanner.nextFloat();
        if(Sodien<50){
            Tien=Sodien*1000;
            System.out.printf("Số tiền: %.0f\n", Tien);
        }else{
            Tien=50*1000+(Sodien-50)*1200;
            System.out.printf("Số tiền: %.0f\n", Tien);
        }
   }
}
