/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author admin
 */
public class SinhVienBiz extends Sinh_Vien_Poly{
   double diemMarketing, diemSales;
    public SinhVienBiz (String name, double diemMarketing, double diemSales){
        super (name,"Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    @Override
        public double getDiem(){
            return ((2* diemMarketing)+diemSales)/3;
        }
}
