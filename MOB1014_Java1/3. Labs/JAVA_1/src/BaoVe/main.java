/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package BaoVe;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

   public static ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
   
   public static void main(String args[]) {
      //System.out.println(nv.printNhanVien());
      
      int option;
        do {
            Scanner scanner=new Scanner(System.in);
            System.out.println("|-----------------------------MENU------------------------------|"); 
            System.out.println("|1. Nhập danh sách nhân viên từ bàn phím -----------------------|"); 
            System.out.println("|2. Xuất danh sách nhân viên ra màn hình -----------------------|"); 
            System.out.println("|0. Thoat ------------------------------------------------------|"); 
            //System.out.println("|3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím ---------|"); 
            //System.out.print("Nhập bài tập muốn làm: "); 
            System.out.print("Chon menu: ");
            option = scanner.nextInt(); 
        
            switch(option){ 
                case 1: Nhap(); break;
                case 2: Xuat(); break;
                case 0: 
                    System.out.println("Thoát rồi bạn ơi"); 
                    System.exit(0);
                
                default: System.out.print("Xin hãy nhập lại !!!\n");
            }
          
        }while(option!=0);
      
   }
   
   public static void Nhap(){
      Scanner scanner = new Scanner(System.in); 
        while(true){
            System.out.print("\nNhập ID: "); 
            int x = scanner.nextInt(); 
            System.out.print("\nNhập họ tên: "); 
            scanner.nextLine();
            String y = scanner.nextLine(); 
            System.out.println("Loai HD:\n\t1. Thoi vu \n\t2. Cong nhan ");
            int cv = scanner.nextInt();
            if(cv==1){
                    scanner.nextLine();
                    System.out.print("Ngay Cong: ");
                    int nc = scanner.nextInt();
                    System.out.print("Don Gia: ");
                    int dg = scanner.nextInt();
                NhanVien nv = new ThoiVu(nc,dg,x,y){};
                dsnv.add(nv);
            }else if(cv==2){
            
                    scanner.nextLine();
                    System.out.print("Luong CB: ");
                    int cb = scanner.nextInt();
                    System.out.print("HS Luong : ");
                    int hs = scanner.nextInt();
                    System.out.print("Phu Cap :");
                    int pc = scanner.nextInt();
                NhanVien nv = new CongNhan(cb,hs,pc,x,y){};
                dsnv.add(nv);
            }
             scanner.nextLine();
            System.out.println("Nhập thêm (Y/N)? "); 
            String nhap= scanner.nextLine();
            if(nhap.equalsIgnoreCase("n")){
                break; 
            }
        }
   }
   
   public static void Xuat(){
      for(NhanVien x: dsnv){
        System.out.println(x.printNhanVien());
      }
   }
}
