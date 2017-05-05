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
public class ClockCounter {
  private int amount;
  private int limit;
  
  public ClockCounter(int limit) {
    this.amount = 0;
    this.limit = limit;
  }
  
  public void next() {
    if (this.amount == this.limit - 1) {
      this.amount = 0;
    } else {
      this.amount++;
    }
  }
  
  public int getValue() {
    return this.amount;
  }
  
  public String toString() {
    if (this.amount < 10) {
      return "0" + this.amount;
    }
    return "" + this.amount;
  }
}
