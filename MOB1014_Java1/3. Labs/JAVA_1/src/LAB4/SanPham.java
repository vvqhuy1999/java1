/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SanPham {
   public static Scanner scanner = new Scanner(System.in);
   
   private String tenSP;
   private double donGia;
   private double giamGia;
   
   public SanPham(){}
   
   public SanPham(String tenSP, double dongia, double giamgia){
      this.tenSP = tenSP;
      this.donGia= dongia;
      this.giamGia=giamgia;
   }
   
   public SanPham(String tenSP, double dongia){
      this(tenSP,dongia,0);
   }
   
   private double getThueNhapKhau(){
      return this.donGia * 0.1;
   }

   public void setTenSP(String tenSP) {
      this.tenSP = tenSP;
   }

   public void setDonGia(double donGia) {
      this.donGia = donGia;
   }

   public void setGiamGia(double giamGia) {
      this.giamGia = giamGia;
   }
   
   public String getTenSP(){
      return tenSP;
   }

   public double getDonGia() {
      return donGia;
   }

   public double getGiamGia() {
      return giamGia;
   }

   public void xuat(){
      System.out.println("Tên sản phẩm: " + this.tenSP);
      System.out.printf("Đơn giá : %.0f",this.donGia );
      System.out.println();
      System.out.println("Giảm giá : " + this.giamGia);
      System.out.println("Thuế nhập khẩu : " + getThueNhapKhau());
   }
   public void nhap(){
      System.out.print("Nhap Ten SP: ");
      this.tenSP = scanner.nextLine();
      scanner.nextLine();
      System.out.print("Nhap Don gia: ");
      this.donGia = scanner.nextDouble();
      System.out.print("Nhap Giam gia: ");
      this.giamGia = scanner.nextDouble();
   }
}
