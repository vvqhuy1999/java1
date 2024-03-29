package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5_Bai1 {

   public static void main(String args[]) {
      // TODO code application logic here
      ArrayList<Double> list = new ArrayList<Double>();
      
      Scanner scanner = new Scanner(System.in);
      Double x;
      while(true){
         System.out.print("Nhập số thực: ");
         x=scanner.nextDouble();
         list.add(x);
         
         System.out.print("Nhập thêm (Y/N)? ");
         scanner.nextLine();
         if(scanner.nextLine().equalsIgnoreCase("N")){
            break;
         }
      }
      double sum=0;
      for(double i:list){
         System.out.print(i + "\t");
         sum+=i;
      }
      System.out.println();
      System.out.printf("Tổng = %.1f",sum);
   }
}
