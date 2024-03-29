/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package LAB4;

/**
 *
 * @author admin
 */
public class Lab4_2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      // TODO code application logic here
      
      SanPham sp1 = new SanPham();
      sp1.nhap();
      System.out.println();
      SanPham sp2 = new SanPham();
      sp2.nhap();
      System.out.println("Thong tin San Pham 1");
      sp1.xuat();
      System.out.println("Thong tin San Pham 2");
      sp2.xuat();
      System.out.println();
      
      
   }
}
