/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author ChrisMac
 */
public class Student {
  private String name;
  private int studentNumber;
  
  public Student(String name, int number) {
    this.name = name;
    this.studentNumber = number;
  }
  
  public String getName() {
    return this.name;
  }
  
  public int getStudentNumber() {
    return this.studentNumber;
  }
  
  public String toString() {
    return this.name + "(" + studentNumber + ")";
  }
}
