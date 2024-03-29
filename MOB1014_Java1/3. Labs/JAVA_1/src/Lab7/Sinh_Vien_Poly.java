/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author admin
 */
public abstract class Sinh_Vien_Poly {
   String HoTen, Nganh;
    public Sinh_Vien_Poly(String name, String major){
    HoTen = name;
    Nganh = major;
    }
    public abstract double getDiem();
    public String getHocLuc(){
    String HocLuc;
    double diem = getDiem();
    if(diem<5) HocLuc = "Yeu";
    else if(diem >= 5 && diem <6.5) HocLuc = "Trung binh";
    else if(diem >= 6.5 && diem <7.5) HocLuc = "Kha";
    else if(diem >= 7.5 && diem <9) HocLuc = "Gioi";
    else HocLuc = "Xuat sac";
    return HocLuc;
    }
    public void xuat(){
    System.out.println("Ho va ten: "+HoTen);
    System.out.println("Nganh: "+Nganh);
    System.out.println("Diem: "+getDiem());
    System.out.println("Hoc luc: "+getHocLuc());
    System.out.println("------------------: ");
    }

}
