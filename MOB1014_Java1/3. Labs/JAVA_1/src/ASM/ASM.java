/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ASM;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ASM {

   public static void chucNang1() {}
   public static void chucNang2() {}
   public static void chucNang3() {}
   public static void chucNang4() {}
   public static void chucNang5() {}
   public static void chucNang6() {}
   public static void chucNang7() {}
   public static void chucNang8() {}
   public static void chucNang9() {}
   
   public static void main(String args[]) {
      // TODO code application logic here
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
