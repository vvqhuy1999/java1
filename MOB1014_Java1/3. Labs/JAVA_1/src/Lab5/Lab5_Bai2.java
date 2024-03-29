package Lab5;

import java.util.*;

public class Lab5_Bai2 {
   public static ArrayList<String> hoten = new ArrayList<String>();
   public static Scanner scanner = new Scanner(System.in);
   public static void main(String args[]){
      boolean check = true;
      // x dùng cho switch case
      // y dùng để lưu chỉ số arraylist trong tìm kiếm
      int x,y;
      do{
         Scanner soduong = new Scanner(System.in);
         Menu();
         System.out.print("Chọn chức năng: ");
         x =soduong.nextInt();
         switch(x)
         {
            case 1:
               Nhap(); break;
            case 2:
               Xuat(); break;
            case 3:
               NgauNhien();
               Xuat(); break;
            case 4:
               SapXep();
               Collections.reverse(hoten);
               Xuat(); break;
            case 5:
               y = TimKiem();
               if(y ==0 ){
                  System.out.println("Không tìm thấy họ tên.");
               }else{
                  System.out.println("Họ Tên: " + hoten.get(y));
                  System.out.println("Bạn có muốn xóa họ tên đã tìm kiếm không (Y/N)?");
                  if(scanner.nextLine().equalsIgnoreCase("N")) break;
                  else {
                     remove(y);
                  }
                  System.out.println("Bạn đã họ tên xóa thành công");
               }
               break;
            default:
               System.out.println("Nhập sai chức năng xin chào tàm biệt");
               check = false;
               break;
         }
      }while(check);
      
   }
   public static void Menu(){
      System.out.println("+-----------------Menu-----------------+");
      System.out.println("+-1. Nhap Danh Sach Họ Tên:------------+");
      System.out.println("+-2. Xuất danh sách vừa nhập-----------+");
      System.out.println("+-3. Xuất danh sách ngẫu nghiên--------+");
      System.out.println("+-4. Sắp xếp giảm dần và xuất danh sách+");
      System.out.println("+-5. Tìm và xóa họ tên nhập từ bàn phím+");
      System.out.println("+--------------------=-----------------+");
   }
   public static void Nhap(){
      
      String x;
      while(true){
         System.out.print("Nhập Họ tên: ");
         x=scanner.nextLine();
         hoten.add(x);
         
         System.out.print("Nhập thêm (Y/N)? ");
         if(scanner.nextLine().equalsIgnoreCase("N")){
            break;
         }
      }
   }
   
   public static void Xuat(){
      for(String list: hoten){
         System.out.print(list + "\t");
      }
      System.out.println();
   }
   
   public static void SapXep(){
      Collections.sort(hoten);
   }
   public static void NgauNhien(){
      Collections.shuffle(hoten);
   }
   
   public static int TimKiem(){
      System.out.print("Nhập họ tên cần tìm: ");
      String x = scanner.nextLine();
      for(int i =0; i<hoten.size(); i++){
         if(hoten.get(i).equalsIgnoreCase(x)){
            return i;
         }
      }
      return 0;
   }
   
   public static void remove(int x){
      hoten.remove(x);
   }
 
}
