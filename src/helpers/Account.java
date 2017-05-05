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
public class Account {
  
  private String accountName;
  private double balance;
  
  public Account(String name, double amount) {
    this.accountName = name;
    this.balance = amount;
  }
  
  public String getAccountName() {
    return this.accountName;
  }
  
  public double getAccountBalance() {
    return this.balance;
  }
  
  public void withdraw(double amount) {
    this.balance -= amount;
  }
  
  public void deposit(double amount) {
    this.balance += amount;
  }
  
  public String toString() {
    return "Account name: " + this.getAccountName() + ". Balance: " + this.getAccountBalance();
  }
  
  public static void main(String[] args) {
    
  }
}
