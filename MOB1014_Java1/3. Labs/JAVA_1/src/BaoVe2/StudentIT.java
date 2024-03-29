/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaoVe2;

/**
 *
 * @author admin
 */
public abstract class StudentIT extends Student{
   private double markJava;
   private double markMySQL;

   public StudentIT(double markJava, double markMySQL, int id, String fullName) {
      super(id, fullName);
      this.markJava = markJava;
      this.markMySQL = markMySQL;
   }

   public StudentIT(double markJava, double markMySQL) {
      this.markJava = markJava;
      this.markMySQL = markMySQL;
   }

   public double getMarkJava() {
      return markJava;
   }

   public void setMarkJava(double markJava) {
      this.markJava = markJava;
   }

   public double getMarkMySQL() {
      return markMySQL;
   }

   public void setMarkMySQL(double markMySQL) {
      this.markMySQL = markMySQL;
   }
   
   @Override
   public double getAverageMark(){
      return (markJava*2+markMySQL)/3 ;
   }
   
   @Override
   public String printStudent (){
      return "Java{" + "ID=" + getId() + ", Ten=" + getFullName() +
              ", Mark Java=" + this.markJava + ", Mark MySQL=" +
              this.markMySQL+ ", Get AverageMark IT="+ getAverageMark() +"}";
   }
    
}
