/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ChrisMac
 */
public class LotteryNumbers {
  private ArrayList<Integer> numbers;
  
  public LotteryNumbers() {
    this.numbers = new ArrayList<Integer>();
    this.drawNumbers();
  }
  
  public ArrayList<Integer> getNumbers() {
    return this.numbers;
  }
  
  public void drawNumbers() {
    Random rando = new Random();
    for (int i = 0; i < 7; i++) {
      int num = rando.nextInt(39) + 1;
      while (this.containsNumber(num)) {
        num = rando.nextInt(39) + 1;
      }
      this.numbers.add(num);
    }
  }
  
  public boolean containsNumber(int number) {
    return this.numbers.contains(number);
  }
}
