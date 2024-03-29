/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaoVe2;

/**
 *
 * @author admin
 */
public abstract  class StudentBiz extends Student {
   private double markShop;
   private double markSale;

   public StudentBiz(double markShop, double markSale, int id, String fullName) {
      super(id, fullName);
      this.markShop = markShop;
      this.markSale = markSale;
   }

   public StudentBiz(double markShop, double markSale) {
      this.markShop = markShop;
      this.markSale = markSale;
   }

   public double getMarkShop() {
      return markShop;
   }

   public void setMarkShop(double markShop) {
      this.markShop = markShop;
   }

   public double getMarkSale() {
      return markSale;
   }

   public void setMarkSale(double markSale) {
      this.markSale = markSale;
   }

   public double getAverageMark(){
      return (this.markShop+this.markSale)/2 ;
   }
   
   @Override
   public String printStudent (){
      return "Biz{" + "ID=" + getId() + ", Ten=" + getFullName() + ", Mark Shop=" 
              + this.markShop + ", Mark Sale=" + this.markSale+
              ", Get AverageMark Biz="+getAverageMark()+"}";
   }
}

