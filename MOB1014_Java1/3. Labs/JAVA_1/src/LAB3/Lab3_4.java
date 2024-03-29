/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lab3_4 {
   public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in); 
//        System.out.print("Họ và tên: ");
//String hoTen = scanner.nextLine();
//System.out.println("Ho ten: " + hoTen );
      // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        // Khai báo mảng chứa họ tên và điểm của sinh viên
        String[] Tens = new String[n];
        double[] Diems = new double[n];
        
         // Nhập thông tin sinh viên
        for (int i = 0; i < n; i++) {
           
            System.out.printf("Nhập họ tên sinh viên thứ %d: ",i+1);
            scanner.nextLine();
            Tens[i] = scanner.nextLine();
            System.out.printf("Nhập điểm sinh viên thứ %d: ",i+1);
            Diems[i] = scanner.nextDouble() ;
        }
        
        System.out.println(Tens[1]);
        
        // Xuất thông tin sinh viên và học lực
        System.out.println("\nThông tin sinh viên và học lực:");
        for (int i = 0; i < n; i++) {
           
           
            System.out.println(Tens[i] + " - Điểm: " + Diems[i] + " - Học lực: " + HocLuc(Diems[i]));
        }
        
        // Sắp xếp danh sách sinh viên theo điểm tăng dần
        sortStudents(Tens, Diems);
        
        // Xuất danh sách sinh viên đã sắp xếp
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.println(Tens[i] + " - Điểm: " + Diems[i] + " - Học lực: " + HocLuc(Diems[i]));
        }
   }
   
   // Hàm xác định học lực dựa trên điểm
    public static String HocLuc(double diem) {
        if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else if (diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }
    
    // Hàm sắp xếp sinh viên theo điểm tăng dần
    public static void sortStudents(String[] names, double[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[i] > scores[j]) {
                    // Hoán đổi vị trí của sinh viên i và j
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;

                    double tempScore = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tempScore;
                }
            }
        }
    }
}
