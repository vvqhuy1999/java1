
package Lab7;

public class Lab7_Bai3 {
    class SinhVienIT  extends Sinh_Vien_Poly{
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
    class SinhVienBiz extends Sinh_Vien_Poly{          
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

}
