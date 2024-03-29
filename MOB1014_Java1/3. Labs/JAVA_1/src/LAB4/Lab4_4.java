package LAB4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Lab4_4 {
   public static void main(String args[]) {
      System.out.println("Lab4_4");
      SanPham sp1 = new SanPham();
      
      sp1.setTenSP("Quat");
//      System.out.println("Ten SP :" + sp1.getTenSP());
      sp1.setDonGia(200000);
      //System.out.println("Ten SP :" + sp1.getTenSP());
      sp1.setGiamGia(0);
      
      sp1.xuat();
   }
}
