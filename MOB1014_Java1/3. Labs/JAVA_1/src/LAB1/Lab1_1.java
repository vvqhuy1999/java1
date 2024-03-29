/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package LAB1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lab1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Họ và tên: ");
String hoTen = scanner.nextLine(); 
System.out.print("Điểm TB: ");
double diemTB = scanner.nextDouble();
       System.out.println("Ho ten: " + hoTen + " Diem: " + diemTB);
    }
}
