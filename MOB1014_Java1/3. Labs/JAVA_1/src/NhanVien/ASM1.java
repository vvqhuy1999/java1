
package NhanVien;

import java.util.*;

public class ASM1 {

   public static ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
   
   public static void chucNang1() {
      Scanner scanner=new Scanner(System.in);
        while(true){
            //scanner.nextLine();
            NhanVien nvTemp=new NhanVien();//Khai báo 1 NV tạm thời trước khi add vào dsnv
            System.out.print("Nhập Mã NV: ");
            nvTemp.setMaNV(scanner.nextLine());
            System.out.print("Nhập họ tên: ");
            nvTemp.setHoTen(scanner.nextLine());
            System.out.print("Nhập lương: ");
            nvTemp.setLuong(scanner.nextFloat());//Nhập thành công 1 NV tạm thời
            dsnv.add(nvTemp);//Thêm NV vừa nhập vào danh sách
            System.out.print("Tiếp tục nhập ? y/n: ");
            scanner.nextLine();
            if(scanner.nextLine().equalsIgnoreCase("n")) 
                break;
        }
   }
   public static void chucNang2() {
      System.out.printf("Mã NV\t");
        System.out.printf("Họ tên NV\t");
        System.out.printf("Lương NV\t");
        System.out.printf("Thuế NV\t"); 
        System.out.printf("Thu nhập\n");//Viết ra tiêu đề ds dưới dạng Table
        for(NhanVien x:dsnv)//Duyệt các phần tử trong ds
            x.xuat(); //Mỗi phần tử đều được in ra
   }
   public static void chucNang3() {
      Scanner scanner= new Scanner(System.in);
        String maNVTim;
        int i;
        System.out.print("Nhập mã NV cần tìm: ");
        maNVTim=scanner.nextLine();
        for(i=0; i<dsnv.size();i++){
        if(dsnv.get(i).getMaNV().equalsIgnoreCase(maNVTim)){
                System.out.println(dsnv.get(i));
        }
    }        
   }
   public static void chucNang4() {
       Scanner scanner=new Scanner(System.in);
        String maNVTim, xacNhan;
        int i;
        System.out.print("Nhập mã NV cần tìm: ");
        maNVTim=scanner.nextLine();//maNVTim=nv1
        for(i=0; i<dsnv.size();i++){
            if(dsnv.get(i).getMaNV().equalsIgnoreCase(maNVTim)){
                System.out.println(dsnv.get(i));
                System.out.print("Bạn có muốn xóa NV này? y/n: ");
                xacNhan=scanner.nextLine();
            }else{
                dsnv.remove(i);
                chucNang2();
                break;
            }
        }
        if(i==dsnv.size()){
            System.out.println("Không tìm thấy "+maNVTim);
            System.out.print("Bạn có muốn thêm NV này? y/n: ");
            xacNhan=scanner.nextLine();
            if(xacNhan.equalsIgnoreCase("y")){
                NhanVien nvTemp=new NhanVien();//Khai báo 1 NV tạm thời trước khi add
                nvTemp.setMaNV(maNVTim);
                System.out.print("Nhập họ tên: ");
                nvTemp.setHoTen(scanner.nextLine());
                System.out.print("Nhập lương: ");
                nvTemp.setLuong(scanner.nextFloat());
                dsnv.add(nvTemp);
                chucNang2();                
            }
        }
   }
   public static void chucNang5() {
      Scanner scanner = new Scanner(System.in);
        String maNVTim, xacNhan = null;
        int i;
        System.out.print("Nhập mã NV cần tìm: ");
        maNVTim=scanner.nextLine();
         for(i=0; i<dsnv.size();i++){
               System.out.println("H: Cập nhật họ tên");
               System.out.println("L: Cập nhật lương");
               System.out.println("N: Không cập nhật");
               xacNhan=scanner.nextLine();
               if(xacNhan.equalsIgnoreCase("n")) 
                   break;
                else if(xacNhan.equalsIgnoreCase("h")){
                    System.out.print("Họ tên mới: ");
                    dsnv.get(i).setHoTen(scanner.nextLine());
                    chucNang2();
                }else{ 
                    System.out.print("Nhập lương mới: ");
                    dsnv.get(i).setLuong(scanner.nextFloat());
                    chucNang2();
                }
        }
   }
   public static void chucNang6() {
      Scanner scanner=new Scanner(System.in);
        float minLuong, maxLuong;
        System.out.print("Nhập min lương: ");
        minLuong=Float.valueOf(scanner.nextFloat());
        System.out.print("Nhập max lương: ");
        maxLuong=Float.valueOf(scanner.nextFloat());
        for(NhanVien x: dsnv){
            if((x.getLuong()>minLuong) && (x.getLuong()<maxLuong))
                System.out.println(x);
        }
   }
   public static void chucNang7() {
      Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override 
            public int compare(NhanVien o1, NhanVien o2) {
                return Double.compare(o1.getThuNhap(),o2.getThuNhap());
            }
        };
        Collections.sort(dsnv, comp);
        for (NhanVien x : dsnv) { //Xuất dsnv
            System.out.println(x);
        }
   }
   public static void chucNang8() {
        int i, j;
        String hoTeni, hoTenj;
        for(i=0; i<dsnv.size()-1;i++)
            for(j=i+1;j<dsnv.size();j++){
                hoTeni=dsnv.get(i).getHoTen();//Lấy họ tên NV thứ i
                hoTenj=dsnv.get(j).getHoTen();//Lấy họ tên NV thứ j
                if(hoTeni.compareToIgnoreCase(hoTenj)>0){
                    Collections.swap(dsnv,i,j);
                }
            }
        for (NhanVien x : dsnv) { //Xuất dsnv
            System.out.println(x);
        }
   }
   public static void chucNang9() {
      Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override 
            public int compare(NhanVien o1, NhanVien o2) {
                return Double.compare(o2.getThuNhap(),o1.getThuNhap());
            }
        };
        Collections.sort(dsnv, comp);
        List<NhanVien> top5 = dsnv.subList(0,5);
            for (NhanVien x : top5) { 
                System.out.println(x);
        }     
   }
   
   public static void main(String args[]) {
//     NhanVien nv = new NhanVien();
//     nv.nhap();
      Scanner scanner = new Scanner (System.in);
      int option;
      do {
         System.out.println("|------------------DS---------------------------|");  
         System.out.println("| 1.Nhập danh sách nhân viên từ bàn phím--------|");
         System.out.println("| 2.Xuất danh sách nhân viên ra màn hình--------|");
         System.out.println("| 3.Tìm và hiển thị NV theo mã nhập từ bàn phím-|");
         System.out.println("| 4.Xóa nhân viên theo mã nhập từ bàn phím------|");
         System.out.println("| 5.Cập nhật TT NV theo mã nhập từ bàn phím-----|");
         System.out.println("| 6.Tìm TT NV theo khoảng lương nhập từ bàn phím|");
         System.out.println("| 7.Sắp xếp nhân viên theo họ và tên------------|");
         System.out.println("| 8.Sắp xếp nhân viên theo thu nhập-------------|");
         System.out.println("| 9.Xuất 5 nhân viên có thu nhập cao nhất-------|");
         System.out.println("| 0.Thoát chương trình--------------------------|");
         System.out.println("|----Mời bạn lựa chọn chương trình:-------------|"); 
         
         System.out.println("Chon chuc nang : ");
         option = scanner.nextInt();
         System.out.println("Chuc nang :" + option);
         switch(option){
            case 0:
               System.out.println("Thoát chương trình.");
               System.exit(0);
            case 1:
               System.out.println("Tính năng nhập nhân viên: ");
               chucNang1();break;
            case 2:
               System.out.println("Tính xuất ds nhân viên: ");
               chucNang2();break;
            case 3:
               System.out.println("Tính tìm kiếm và hiển thị nhân viên: ");
               chucNang3();break;
            case 4:
               System.out.println("Tính xóa nhân viên theo mã: ");
               chucNang4();break;
            case 5:
               System.out.println("Tính cập nhật TT nhân viên: ");
               chucNang5();break;
            case 6:
               System.out.println("Tính TT nhân viên theo khoảng lượng: ");
               chucNang6();break;
            case 7:
               System.out.println("Tính sắp xếp nhân viên theo họ tên: ");
               chucNang8();break;
            case 8:
               System.out.println("Tính sắp xếp nhân viên theo thu nhập: ");
               chucNang8();break;
            case 9:
               System.out.println("Tính xuất 5 nhân viên có thu nhập cao nhất: ");
               chucNang9();break;
            default:
               System.out.println("Bạn đã nhập sai vui lòng chọn lại.");
               break;
         }
      }
      while(option>0);
      
   }
}
