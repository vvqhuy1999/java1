/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaoVe;

/**
 *
 * @author admin
 */
public abstract class CongNhan extends NhanVien{
   private int luongCB;
   private int hsLuong;
   private int phuCap;

   public CongNhan(int luongCB, int hsLuong, int phuCap) {
      this.luongCB = luongCB;
      this.hsLuong = hsLuong;
      this.phuCap = phuCap;
   }

   public CongNhan(int luongCB, int hsLuong, int phuCap, int id, String hoTen) {
      super(id, hoTen);
      this.luongCB = luongCB;
      this.hsLuong = hsLuong;
      this.phuCap = phuCap;
   }

   public int getLuongCB() {
      return luongCB;
   }

   public void setLuongCB(int luongCB) {
      this.luongCB = luongCB;
   }

   public int getHsLuong() {
      return hsLuong;
   }

   public void setHsLuong(int hsLuong) {
      this.hsLuong = hsLuong;
   }

   public int getPhuCap() {
      return phuCap;
   }

   public void setPhuCap(int phuCap) {
      this.phuCap = phuCap;
   }
   
   @Override
   public double getSalary(){
      return luongCB*hsLuong+phuCap ;
   }
   
   public String printNhanVien(){
      return "Cong Nhan{" + "ID=" + getId() + ", Ten=" + getHoTen() + 
      ", luongCB=" + this.luongCB + ", hsLuong=" + this.hsLuong +
        ", phuCap=" + this.phuCap + ", lương=" + getSalary()+"}";
   }
}
