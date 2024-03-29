/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package LAB2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class LAB2_4 {

   /**
    * @param args the command line arguments
    */
   
   public static void main(String args[]) {
      // TODO code application logic here
      Menu(); 
       Scanner scan = new Scanner(System.in);
       
       int chucnang = scan.nextInt();
       switch(chucnang){
          case 1: Giaiphuongtrinhbac1();
            break;
          case 2: Giaiphuongtrinhbac2();
            break;
          case 3: Tinhtiendien();
            break;
          case 4: System.exit(0);
            break;
          default: Menu();
             break;
       }
//       if(chucnang == 1){
//           Giaiphuongtrinhbac1();
//       }else if(chucnang == 2){
//           Giaiphuongtrinhbac2();
//           
//       }else if(chucnang == 3){
//           Tinhtiendien();
//       }else{
//           System.exit(0);
//       }
   }
   
    public static void  Menu(){
        System.out.println("++----------Menu----------++");
        System.out.println("+--------------------------+");
        System.out.println("+1. Giải phương trình bậc 1+");
        System.out.println("+2. Giải phương trình bậc 2+");
        System.out.println("+3. Tính tiền điện         +");
        System.out.println("+4. Kết thúc               +");
        System.out.println("+--------------------------+");
        System.out.println(">>Chọn chức năng: <<");
    }
    public static void Giaiphuongtrinhbac1(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("PT Bật nhất:");
       System.out.println("Nhap a:");
      int a = scanner.nextInt();
      System.out.println("Nhap b:");
      int b = scanner.nextInt();
//      int max = a>b?a:b;
//      System.out.println("MAX: "+ max);
      float x;
      if(a==0){
         if(b==0){
            System.out.println("PT vô số nghiệm.");
         }
         else{
         System.out.println("PT vô nghiệm");
         }
      }
      else{
      x = (float) -b/a;
      System.out.println("PT có nghiem: " + x);
      }
    }
    
    public static void Giaiphuongtrinhbac2(){
       double a , b, c;
        double Delta,x, x1,x2;
        Scanner NhapLieu = new Scanner(System.in);
        System.out.print("Mời bạn nhập số a: ");
        a= NhapLieu.nextDouble();
        System.out.print("Mời bạn nhập số b: ");
        b= NhapLieu.nextDouble();
        System.out.print("Mời bạn nhập số c:");
        c= NhapLieu.nextDouble();
        if(a==0){
            if(b==0){
                System.out.print("Phương trình vô số nghiệm\n");
            }else{
                System.out.print("Phương trình vô nghiệm\n");
            }
        }else{
            Delta=(Math.pow(b,2)-(4 * a * c));
            if(Delta<0){
                System.out.print("Phương trình vô nghiệm\n");
            }else if(Delta==0){
                x= -b/(2*a);
                System.out.printf("PT có nghiệm kép x: %.1f\n6",x);
            }else{
                x1=(-b+Math.sqrt(Delta))/(2*a);
                x2=(-b-Math.sqrt(Delta))/(2*a);
                System.out.printf("x1: %f\nx2: %f\n",x1,x2);
            }
        }
    }
    
    public static void Tinhtiendien(){
       double Tien,Sodien;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập số điện: ");
        Sodien= scanner.nextFloat();
        if(Sodien<50){
            Tien=Sodien*1000;
            System.out.printf("Số tiền: %.0f\n", Tien);
        }else{
            Tien=50*1000+(Sodien-50)*1200;
            System.out.printf("Số tiền: %.0f\n", Tien);
        }
    }
    
}
