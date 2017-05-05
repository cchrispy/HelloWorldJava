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
public class OverloadedCounter {
  
  private int initial;
  private boolean check;
  
  private int value;
  
  public OverloadedCounter(int initial, boolean check) {
    this.initial = initial;
    this.check = check;
    this.value = initial;
  }
  
  public OverloadedCounter(int initial) {
    this(initial, false);
  }
  
  public OverloadedCounter(boolean check) {
    this(0, check);
  }
  
  public OverloadedCounter() {
    this(0, false);
  }
  
  public int getValue() {
    return this.value;
  }
  
  public void increase(int amount) {
    this.value += amount;
  }
  public void increase() {
    this.increase(1);
  }
  
  public void decrease(int amount) {
    if (check && this.value == 0) {
      return;
    }
    this.value -= amount;
  }
  public void decrease() {
    this.decrease(1);
  }
  
  public void reset() {
    this.value = this.initial;
  }
}
