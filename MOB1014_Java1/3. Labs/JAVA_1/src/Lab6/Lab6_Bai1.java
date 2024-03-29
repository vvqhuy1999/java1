package Lab6;

import java.util.Scanner;

public class Lab6_Bai1 {

   public static void main(String args[]) {
      // TODO code application logic here
      Scanner scanner = new Scanner(System.in);
      String hoten;
      System.out.print("Nhap ho va ten: ");
      hoten = scanner.nextLine();
      String ho = hoten.substring(0, hoten.indexOf(" "));
      String tendem = hoten.substring(hoten.indexOf(" "), hoten.lastIndexOf(" "));
      String ten = hoten.substring(hoten.lastIndexOf(" "));
      System.out.println("\n Ho ten viet hoa:" + ho.toUpperCase() + tendem + ten.toUpperCase());
   }
}
