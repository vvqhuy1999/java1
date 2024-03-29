package Lab6;


import java.util.*;

public class Lab6_Bai2 {
    public static void main(String args[]) {
        ArrayList<SanPham> sanPham = new ArrayList<SanPham>();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap so lunog san pham muon nhap: ");
            int a= scanner.nextInt();
            for(int i=0; i<a ; i++){
                SanPham sp = new SanPham();
                sp.input();
                sanPham.add(sp);
            }

            for(SanPham sp: sanPham){
                if(sp.getHang().equalsIgnoreCase("nokia")){
                    sp.output();
                }
            }


    }
}
