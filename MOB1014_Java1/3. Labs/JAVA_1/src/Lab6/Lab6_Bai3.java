package Lab6;
import java.util.*;
public class Lab6_Bai3 {
    public static void main(String args[]) {
        ArrayList<SinhVien> sinhVien = new ArrayList<SinhVien>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien muon nhap: ");
        int a= scanner.nextInt();
        for(int i=0; i<a ; i++){
            SinhVien sv = new SinhVien();
            sv.input();
            sinhVien.add(sv);
        }

        for(SinhVien sv: sinhVien){
            sv.output();
        }


    }
}
