
package Lab7;

import java.util.*; 
public class Lab7_Bai4 {

   static List<Sinh_Vien_Poly> listSV = new ArrayList<Sinh_Vien_Poly>();
   public static void main(String args[]) {
      Scanner scan = new Scanner (System.in);
        while(true){
            System.out.println("-------------Menu Chuong Trinh------------");
            System.out.println("1.Nhap danh sach sinh vien----------------");
            System.out.println("2.Xuat danh sach sinh vien----------------");
            System.out.println("3.Xuat danh sach sinh vien gioi-----------");
            System.out.println("4.Sap xep danh sach sinh vien theo diem---");
            System.out.println("5.Ket thuc--------------------------------");
            System.out.println("------------------------------------------");
            System.out.printf("Moi ban chon chuc nang: ");
            int chon = scan.nextInt();
            switch(chon){
                case 1:
                    nhap();
                    break;
                case 2:
                   xuat();
                    break;
                case 3:
                    xuatDSSVgioi();
                    break;
                case 4:
                    sapXepTheoDiem();
                    break;
                case 5:
                    System.exit(0);
                    default:
                    break;
            }
        }
   }
   
   static void nhap(){
    String HoTen, Nganh;
    double diem1, diem2, diem3;
    Scanner scan = new Scanner (System.in);
        System.out.println("Nhap danh sach sinh vien: ");
        while(true){
            System.out.println("Nhap thong tin sinh vien: ");
            System.out.print("Nhap ten: ");
            HoTen = scan.nextLine();
            if(HoTen.equals("0")){
                break;
        }
        System.out.print("Nganh: ");
        Nganh=scan.nextLine();
        if(Nganh.equalsIgnoreCase("IT")){
            System.out.print("Nhap diem Java: ");
            diem1=Double.parseDouble(scan.nextLine());
            System.out.print("Nhap diem CSS: ");
            diem2=Double.parseDouble(scan.nextLine());
            System.out.print("Nhap diem HTLM: ");
            diem3=Double.parseDouble(scan.nextLine());
            
            SinhVienIT newSV = new SinhVienIT(HoTen, diem1, diem2, diem3);
            listSV.add(newSV);
    }else if(Nganh.equalsIgnoreCase("Biz")){
            System.out.println("Nhap diem Marketing: ");
            diem1=Double.parseDouble(scan.nextLine());
            System.out.println("Nhap diem Sales: ");
            diem2=Double.parseDouble(scan.nextLine());
            
            SinhVienBiz newSV = new SinhVienBiz(HoTen, diem1, diem2);
            listSV.add(newSV);
    }else{
            System.out.println("Khong co Nganh nay");
            break;
        }
            System.out.println("Ban muon nhap tiep");
            System.out.println("y/n?");
        if(scan.nextLine().equalsIgnoreCase("y")){
            System.out.println("Nhap sinh vien ke tiep");
        }else break;
    }
   }
   
   static void xuat(){
        System.out.println("Xuat danh sach sinh vien: ");
        for (int i=0; i < listSV.size(); i++){
            System.out.println("Ho va Ten: "+listSV.get(i).HoTen);
            System.out.println("Nganh: "+listSV.get(i).Nganh);
            System.out.println("Hoc Luc: "+listSV.get(i).getHocLuc());
            System.out.println("--------------------------------------");
        }
        System.out.println("");
    }

   
   static void xuatDSSVgioi(){
        System.out.println("Xuat danh sach sinh vien gioi: ");
        for (int i=0; i < listSV.size(); i++){
            if((listSV.get(i).getHocLuc().equals("Gioi"))){
                System.out.println("Ho va Ten: "+listSV.get(i).HoTen);
                System.out.println("Nganh: "+listSV.get(i).Nganh);
                System.out.println("-------------------------------------");
            }
        System.out.println("");
        }
    }
   
   
   static void sapXepTheoDiem(){
    Collections.sort(listSV,new sapXep());
    System.out.println("Xuat danh sach sinh vien theo diem: ");
    for (int i=0; i < listSV.size(); i++){
        System.out.println("Ho va Ten: "+listSV.get(i).HoTen);
                System.out.println("Nganh: "+listSV.get(i).Nganh);
                System.out.println("-------------------------------------");
        }
    }

   static class sapXep implements Comparator<Sinh_Vien_Poly>{
    public int compare(Sinh_Vien_Poly a, Sinh_Vien_Poly b){
        if(a.getDiem() < b.getDiem()) return -1;
            if(a.getDiem() < b.getDiem()) return 1;
            return 0;
    }
}
}


