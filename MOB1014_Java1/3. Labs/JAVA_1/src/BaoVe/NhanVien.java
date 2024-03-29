/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaoVe;

/**
 *
 * @author admin
 */
public abstract class NhanVien {
   private int id;
   private String hoTen;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getHoTen() {
      return hoTen;
   }

   public void setHoTen(String hoTen) {
      this.hoTen = hoTen;
   }

   public NhanVien() {
   }

   public NhanVien(int id, String hoTen) {
      this.id = id;
      this.hoTen = hoTen;
   }
   
   abstract double getSalary();
   abstract String printNhanVien();
   
}
