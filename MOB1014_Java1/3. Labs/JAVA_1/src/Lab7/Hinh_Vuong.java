
package Lab7;

import java.util.Scanner;

public class Hinh_Vuong extends Hinh_Chu_Nhat{
   public Hinh_Vuong(double canh){
    super(canh,canh);
    rong = dai = canh;
    }
   
   public void nhap(){
    Scanner scan = new Scanner (System.in);
    System.out.print("Nhap canh: ");
    double canh = scan.nextDouble();
    rong = dai = canh;
    }
    public void xuat(){
    System.out.println("-----------------");
    System.out.println("Canh: "+rong);
    System.out.println("Chu vi hinh vuong: "+getChuVi());
    System.out.println("Dien Tich hinh vuong: "+getDienTich());
    }
}
