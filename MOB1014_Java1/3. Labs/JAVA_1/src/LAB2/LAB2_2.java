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
public class LAB2_2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      // TODO code application logic here
      double a , b, c;
        double Delta,x, x1,x2;
        Scanner NhapLieu = new Scanner(System.in);
        System.out.print("Mời bạn nhập số a: ");
        a= NhapLieu.nextDouble();
        System.out.print("Mời bạn nhập số b: ");
        b= NhapLieu.nextDouble();
        System.out.print("Mời bạn nhập số c:");
        c= NhapLieu.nextDouble();
        if(a==0){
            if(b==0){
                System.out.print("Phương trình vô số nghiệm\n");
            }else{
                System.out.print("Phương trình vô nghiệm\n");
            }
        }else{
            Delta=(Math.pow(b,2)-(4 * a * c));
            if(Delta<0){
                System.out.print("Phương trình vô nghiệm\n");
            }else if(Delta==0){
                x= -b/(2*a);
                System.out.printf("PT có nghiệm kép x: %.1f\n6",x);
            }else{
                x1=(-b+Math.sqrt(Delta))/(2*a);
                x2=(-b-Math.sqrt(Delta))/(2*a);
                System.out.printf("x1: %f\nx2: %f\n",x1,x2);
            }
        }
   }
}
