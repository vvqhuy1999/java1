
package Lab5;

import java.util.*;

public class Lab5_Bai3 {
   public static ArrayList<SanPham> dssp = new ArrayList<SanPham>();
   public static Scanner chuoi = new Scanner(System.in);
   public static Scanner so = new Scanner(System.in);
   //public static SanPham sp = new SanPham();
   public static void main(String args[]) {
      
      boolean check = true;
      // x dùng cho switch case
      // y dùng để lưu chỉ số arraylist trong tìm kiếm
      int x,y;
      do{
         Scanner soduong = new Scanner(System.in);
         Menu();
         System.out.print("Chọn chức năng: ");
         x =soduong.nextInt();
         switch(x)
         {
            case 1:
               Nhap(); break;
            case 2:
               SapXep(); 
               Collections.reverse(dssp);
               System.out.println("Sau Sap Xep");
               Xuat();
               break;
            case 3:
               y = TimKiem();
               if(y ==0 ){
                  System.out.println("Không tìm thấy Sản phẩm.");
               }else{
                  System.out.print("Tên SP\t");
                  System.out.println("Gia");
                  System.out.println(dssp.get(y).getTenSP()+ "\t" + dssp.get(y).getGiaSP());
                  System.out.println("Bạn có muốn xóa họ tên đã tìm kiếm không (Y/N)?");
                  if(chuoi.nextLine().equalsIgnoreCase("N")) break;
                  else {
                     remove(y);
                  }
                  System.out.println("Bạn đã xóa sản phẩm thành công");
               }
               break;
            case 4:
               TrungBinh();
               break;
            default:
               System.out.println("Nhập sai chức năng xin chào tàm biệt");
               check = false;
               break;
         }
      }while(check);
   }
   public static void Menu(){
      System.out.println("+--------------------------Menu-------------------------------+");
      System.out.println("+-1. Nhap Danh Sach Sản phẩm:---------------------------------+");
      System.out.println("+-2. Sắp xếp giảm dần theo giá--------------------------------+");
      System.out.println("+-3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím------------+");
      System.out.println("+-4. Xuất giá trung bình của các sản phẩm---------------------+");
      System.out.println("+-0. Chọn giá trị khác ngoài 4 chức năng sẽ thoát chương trình+");
      System.out.println("+-------------------------=-----------------------------------+");
   }
   public static void Nhap(){
      String nhaptiep;
      while(true){
         SanPham sp = new SanPham();
         System.out.print("Nhập tên SP: ");
         sp.setTenSP(chuoi.nextLine());
         System.out.print("Nhap giá SP: ");
         sp.setGiaSP(so.nextDouble());
         dssp.add(sp);
         System.out.print("Nhập thêm (Y/N)? ");
         nhaptiep = chuoi.nextLine();
         if(nhaptiep.equalsIgnoreCase("N")){
            break;
         }
      }
   }
   
   public static void Xuat(){
      System.out.print("Tên SP\t");
      System.out.println("Giá SP");
      for(int i =0; i<dssp.size();i++){
         dssp.get(i).xuat(); 
         System.out.println();
      }
   }
   
   public static void SapXep(){
//      Collections.sort(hoten);
      Comparator<SanPham> comp = new Comparator<SanPham>() {
         public int compare(SanPham o1, SanPham o2) {
            //return  o1.getGiaSP().compareTo(o2.getGiaSP());
            return Double.compare(o1.getGiaSP(), o2.getGiaSP());
         }
      };
      Collections.sort(dssp, comp);
   }
//   public static void NgauNhien(){
//      Collections.shuffle(hoten);
//   }
//   
   public static int TimKiem(){
      System.out.print("Nhập họ tên cần tìm: ");
      String x = chuoi.nextLine();
      for(int i =0; i<dssp.size(); i++){
         if(dssp.get(i).getTenSP().equalsIgnoreCase(x)){
            return i;
         }
      }
      return 0;
   }
   
   public static void remove(int x){
      dssp.remove(x);
   }
   
   public static void TrungBinh(){
      System.out.println("Giá trung bình của sản phẩm.");
      double sum = 0;
      int count = 0;
      for(int i =0; i<dssp.size();i++){
         count++;
         sum += dssp.get(i).getGiaSP();
      }
      
      System.out.printf("Giá trung bình sản phẩm %.1f / %d = %.1f",sum,count,sum/count);
      System.out.println();
   }
   
}
