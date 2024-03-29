package Lab7;

import java.util.Scanner;

public class Hinh_Chu_Nhat {
   double dai,rong;
    public Hinh_Chu_Nhat(double d, double r){
        dai=d;
        rong=r;
    }
    public double getChuVi(){
    return(dai + rong) *2;   
    }
    public double getDienTich(){
    return dai * rong;
    }
    public void nhap(){
    Scanner scan = new Scanner (System.in);
    System.out.print("Nhap chieu dai: ");
    dai = scan.nextDouble();
    System.out.print("Nhap chieu rong: ");
    rong = scan.nextDouble();
    }
    public void xuat(){
    System.out.println("Chieu dai: "+dai);
    System.out.println("Chieu rong: "+rong);
    System.out.println("Chu vi: "+getChuVi());
    System.out.println("Dien Tich: "+getDienTich());
    }
}
