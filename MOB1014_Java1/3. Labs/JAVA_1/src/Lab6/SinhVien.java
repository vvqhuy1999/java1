package Lab6;

import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private String email;
    private String sdt;
    private String cmnd;

    public SinhVien(String hoTen, String email, String sdt, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;
    }

    public SinhVien() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public void input(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhap ho va ten: ");
        String hoTen = scanner.nextLine();

        System.out.print("\nNhap email: ");
        String email = scanner.nextLine();

        System.out.print("\nNhap so dien thoai: ");
        String sdt = scanner.nextLine();

        System.out.print("\nNhap CMND: ");
        String cmnd = scanner.nextLine();

        String reHoTen ="[a-zA-Z  ]+";
        if(!hoTen.matches(reHoTen)){
            System.out.println("Ho và ten khong hop le");
        }else{
            this.hoTen = hoTen;
        }

        String reEmail = "\\w+@\\w+\\.\\w+";
        if(!email.matches(reEmail)){
            System.out.println("Email khong hop le");
        }else{
            this.email = email;
        }

        String reSDT= "0\\d{9,10}";
        if(!sdt.matches(reSDT)){
            System.out.println("So dien thoai khong hop le");
        }else{
            this.sdt = sdt;
        }

        String reCMND="\\d{10}";
        if(!cmnd.matches(reCMND)){
            System.out.println("CMND khong hop le");
        }else{
            this.cmnd = cmnd;
        }
    }

    public void output(){
        System.out.printf("\n Tên: %s",this.hoTen);
        System.out.printf("\n Email: %s",this.email);
        System.out.printf("\n SDT: %s",this.sdt);
        System.out.printf("\n CMND: %s",this.cmnd);
    }
}
