/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package BaoVe2;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

   public static ArrayList<Student> dss = new ArrayList<Student>();
   public static void main(String args[]) {
      int option;
        do {
            Scanner scanner=new Scanner(System.in);
            System.out.println("|-----------------------------MENU------------------------------|"); 
            System.out.println("|1. Nhập danh sách student từ bàn phím -----------------------|"); 
            System.out.println("|2. Xuất danh sách student ra màn hình -----------------------|"); 
            System.out.println("|0. Thoat ------------------------------------------------------|"); 
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
            System.out.println("Loai HD:\n\t1. StudentIT \n\t2. StudentBiz ");
            int cv = scanner.nextInt();
            if(cv==1){
                    scanner.nextLine();
                    System.out.print("Mark Java : ");
                    double java = scanner.nextDouble();
                    System.out.print("Mark MySQL: ");
                    double mysql = scanner.nextDouble();
                Student student = new StudentIT(java,mysql,x,y){};
                dss.add(student);
            }else if(cv==2){
            
                    scanner.nextLine();
                    System.out.print("Mark Shop: ");
                    double shop = scanner.nextDouble();
                    System.out.print("Mark Sale : ");
                    double sale = scanner.nextDouble();
                    
                Student student = new StudentBiz(shop,sale,x,y){};
                dss.add(student);
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
      for(Student x: dss){
        System.out.println(x.printStudent());
      }
   }
}
