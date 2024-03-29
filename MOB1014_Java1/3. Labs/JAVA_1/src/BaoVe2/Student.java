/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaoVe2;

/**
 *
 * @author admin
 */
public abstract class Student {
   private int id;
   private String fullName;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getFullName() {
      return fullName;
   }

   public void setFullName(String fullName) {
      this.fullName = fullName;
   }

   public Student(int id, String fullName) {
      this.id = id;
      this.fullName = fullName;
   }
   
   public Student(){}
   
   abstract double getAverageMark();
   abstract String printStudent();
   
   //abstract void printStudent();
   
}
