/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;


import helpers.Person;

/**
 *
 * @author ChrisMac
 */
public class Reformatory {
  
  private int count;
  
  public Reformatory() {
    this.count = 0;
  }
  
  public int weight(Person person) {
    return person.getWeight();
  }
  
  public void feed(Person person) {
    person.addWeight(1);
    this.count++;
  }
  
  public int totalWeightMeasured() {
    return this.count;
  }
  
}
