/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

/**
 *
 * @author admin
 */
public class TruongPhong extends NhanVien{
   public double trachNhiem;

    public TruongPhong(double trachNhiem, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }  

    public TruongPhong(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
      
    public void xuat(){
        super.xuat();
        System.out.println(trachNhiem);
    }
}
