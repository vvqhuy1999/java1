
package Lab5;

public class SanPham {
   private String TenSP;
   private double GiaSP;
   
   public SanPham(){
   }
   
   public SanPham(String ten,double gia){
      this.TenSP = ten;
      this.GiaSP = gia;
   }
   
   public String getTenSP() {
      return TenSP;
   }

   public void setTenSP(String TenSP) {
      this.TenSP = TenSP;
   }

   public double getGiaSP() {
      return GiaSP;
   }

   public void setGiaSP(double GiaSP) {
      this.GiaSP = GiaSP;
   }

   @Override
   public String toString() {
      return "SanPham{" + "TenSP=" + TenSP + ", GiaSP=" + GiaSP + '}';
   }
   
   public void xuat(){
      System.out.printf("%s\t", TenSP);
      System.out.printf("%s\t", GiaSP);
   }
   
}
