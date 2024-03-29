/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaoVe;

/**
 *
 * @author admin
 */
public abstract class ThoiVu extends NhanVien{
   private int ngayCong;
   private double donGia;

   public int getNgayCong() {
      return ngayCong;
   }

   public void setNgayCong(int ngayCong) {
      this.ngayCong = ngayCong;
   }

   public double getDonGia() {
      return donGia;
   }

   public void setDonGia(double donGia) {
      this.donGia = donGia;
   }

   public ThoiVu(int ngayCong, double donGia) {
      this.ngayCong = ngayCong;
      this.donGia = donGia;
   }

   public ThoiVu(int ngayCong, double donGia, int id, String hoTen) {
      super(id, hoTen);
      this.ngayCong = ngayCong;
      this.donGia = donGia;
   }
   
   @Override
   public double getSalary(){
    return this.ngayCong * this.donGia;
   }
   
   public String printNhanVien(){
      return "ThoiVu{" + "ID=" + getId() + ", Ten=" + getHoTen() + ", Ngay Cong=" + this.ngayCong + ", donGia=" + this.donGia + ", lương=" + getSalary()+"}";
   }
}
