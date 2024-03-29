
package Lab6;

import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private double donGia;
    private String hang;
    public SanPham(String tenSP, double donGia, String hang) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.hang = hang;
    }

    public SanPham() {

    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String tenSp = scanner.nextLine();
        this.tenSP = tenSp;
        System.out.print("Nhap don gia: ");
        double donGia = scanner.nextDouble();
        this.donGia = donGia;
        scanner.nextLine();
        System.out.print("Nhap hang: ");
        String hang = scanner.nextLine();
        this.hang = hang;
    }

    public void output(){
        System.out.printf("\n Ten: %s",this.tenSP);
        System.out.printf("\n Don gia: %.1f",this.donGia);
        System.out.printf("\n Hang: %s",this.hang);
    }
}
