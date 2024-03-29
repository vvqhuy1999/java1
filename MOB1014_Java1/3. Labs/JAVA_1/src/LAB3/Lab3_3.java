/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lab3_3 {
   public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        // Sắp xếp và xuất mảng ra màn hình
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
        
        // Xuất phần tử có giá trị nhỏ nhất ra màn hình
        int min = arr[0];
        for(int i =0; i<arr.length;i++){
           if(min>arr[i])min =arr[i];
        }
        System.out.println("Xuat gia tri nho nhat : "+ min);
        
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
                count++;
            }
        }
        double TB =  (double) sum / count;
        System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + TB);   
   }
}
