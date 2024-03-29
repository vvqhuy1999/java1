/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author admin
 */
public class SinhVienIT extends Sinh_Vien_Poly{
   double diemJava, diemCSS, diemHTML;
    public SinhVienIT(String name, double diemJava, double diemCSS, double diemHTML){
        super (name,"IT");
        this.diemJava = diemJava;
        this.diemCSS = diemCSS;
        this.diemHTML = diemHTML;
    }
    @Override
    public double getDiem(){
    return ((2*diemJava)+ diemCSS + diemHTML)/4;
    }
   
}
