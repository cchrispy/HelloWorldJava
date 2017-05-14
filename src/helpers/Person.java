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
  private int weight;
  
  public Person(String firstName, int firstAge, int weight) {
    this.name = firstName;
    this.age = firstAge;
    this.weight = weight;
  }
  
  public void printPerson() {
    System.out.println(this.name + " is " + this.age + " years old.");
  }
  
  public void getOlder() {
    this.age++;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
  
  public int getWeight() {
    return this.weight;
  }
  
  public void setWeight(int weight) {
    this.weight = weight;
  }
  
  public void addWeight(int weight) {
    this.weight += weight;
  }
  
  @Override
  public String toString() {
    return this.name + ": " + this.age;
  }
  
  public static void main(String[] args) {

  }
}
