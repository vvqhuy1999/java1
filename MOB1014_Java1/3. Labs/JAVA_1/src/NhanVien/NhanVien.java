
package NhanVien;

import java.util.Scanner;

public class NhanVien {
   public String maNV;
   public String hoTen;
   double luong; 
   
   public NhanVien(String maNV, String hoTen, double luong) {
      this.maNV = maNV;
      this.hoTen = hoTen;
      this.luong = luong;
   }
   public NhanVien() {}
   public String getMaNV () {return maNV;}
   public String getHoTen () {return hoTen;}
   public double getLuong () {return luong;}
   public void setMaNV (String maNV) {
        this.maNV = maNV;
   }
   public void setHoTen (String hoTen) {
      this.hoTen = hoTen;
   }
   public void setLuong (double luong) {
      this.luong = luong;
   }
   
   public void nhap() {
      Scanner scanner=new Scanner  (System.in);
      System.out.print("Mời bạn nhập Mã NV: ");
      this.maNV=scanner.nextLine();
      System.out.print("Mời bạn nhập Họ tên: ");
      this.hoTen=scanner.nextLine();
      System.out.print("Mời bạn nhập lương: ");
      this.luong=scanner.nextDouble();
   }
   
   private double getThueTN () {
      if (this.luong<=9000000) return 0;
      else if (this.luong<=15000000)
         return (this. luong-9000000) *10/100;
      else
         return (this. luong-15000000) *12/100+600000;
   }
   public double getThuNhap () {
      return this.luong-getThueTN();
   }
   
   void xuat() {
      System.out.printf("%5s\t", maNV);
      System.out.printf("%9s\t", hoTen);
      System.out.printf ("%8.0f\t", luong);
      System.out.printf("%6.0f\t", getThueTN());
      System.out.printf ("%8.0f\n", getThuNhap ());
   }

   @Override
   public String toString() {
      return "NhanVien{" + "maNV=" + maNV + ", hoTen=" + hoTen + ", luong=" + luong +  ", Thuế=" + getThueTN() +", Thu nhập=" + getThuNhap() + '}';
   }
   
   
}
