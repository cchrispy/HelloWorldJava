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
public class Counter {
  private int initial;
  private int amount;
  
  public Counter(int startingAmount) {
    this.initial = startingAmount;
    this.amount = startingAmount;
  }
  
  public void print() {
    System.out.println("Amount: " + this.amount);
  }
  
  public void decrease() {
    if (this.amount > 0) {
      this.amount--;
    }
  }
  
  public void increase() {
    this.amount++;
  }
  
  public void reset() {
    this.amount = this.initial;
  }
  
//  public static void main(String[] args) {
//    
//  }
}
