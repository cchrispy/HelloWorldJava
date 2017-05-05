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
public class Person {
  
  private String name;
  private int age;
  
  public Person(String firstName, int firstAge) {
    this.name = firstName;
    this.age = firstAge;
  }
  
  public void printPerson() {
    System.out.println(this.name + " is " + this.age + " years old.");
  }
  
  public void getOlder() {
    this.age++;
  }
  
  public String toString() {
    return this.name + ": " + this.age;
  }
  
  public static void main(String[] args) {

  }
}
