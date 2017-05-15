/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import helpers.SampleClass;
import helpers.Person;
import helpers.Account;
import helpers.Counter;
import helpers.ClockCounter;
import helpers.LotteryNumbers;
import helpers.OverloadedCounter;
import helpers.Reformatory;

import helpers.Student;

/**
 *
 * @author ChrisMac
 */
public class HelloWorld {

  private static void spruceTree() {
    for (int i = 1; i <= 9; i += 2) {
      String tree = "";
      for (int j = 0; j < (9 - i) / 2; j++) {
        tree += " ";
      }
      for (int j = 0; j < i; j++) {
        tree += "*";
      }
      System.out.println(tree);
    }
    System.out.println("    *");
  }

  private static void userInfo() {
    Scanner reader = new Scanner(System.in);
    System.out.println("Name?");
    String name = reader.nextLine();
    System.out.println("How old are you?");
    int age = Integer.parseInt(reader.nextLine());
    System.out.println("Your name is " + name);
    System.out.println("Your age is " + age);
  }

  private static void addNums() {
    Scanner reader = new Scanner(System.in);
    System.out.println("Numer 1: ");
    int num1 = Integer.parseInt(reader.nextLine());
    System.out.println("Number 2: ");
    int num2 = Integer.parseInt(reader.nextLine());
    System.out.println("" + num1 + "+" + num2 + "=" + (num1 + num2));
  }

  private static void range() {
    Scanner reader = new Scanner(System.in);
    System.out.println("Start: ");
    int start = Integer.parseInt(reader.nextLine());
    System.out.println("End: ");
    int end = Integer.parseInt(reader.nextLine());
    String result = "";
    for (int i = start; i <= end; i++) {
      result += i + " ";
    }
    System.out.println(result);
  }

  private static int factorial(int n) {
    if (n <= 1) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

  private static int powerSum(int n) {
    int result = 0;
    for (int i = 0; i <= n; i++) {
      result += Math.pow(2, i);
    }
    return result;
  }

  private static double average(double[] args) {
    double sum = 0;
    for (int i = 0; i < args.length; i++) {
      sum += args[i];
    }
    return sum / args.length;
  }

  private static void stringReverse(String string) {
    String result = "";
    for (int i = string.length() - 1; i >= 0; i--) {
      result += string.charAt(i);
    }
    System.out.println(result);
  }

  private static void arrayListTest() {
    ArrayList<String> list = new ArrayList<String>();
    list.add("chris");
    list.add("thomas");
    list.add("bobby");

    list.remove("thomas");

    list.add("jacob");
    list.add("ricky");
    list.add("jesus");

    Collections.sort(list);

    for (String name : list) {
      System.out.println(name);
    }
  }

  public static void average_2(ArrayList<Double> list) {
    double sum = 0;
    for (double num : list) {
      sum += num;
    }
    System.out.println(sum / list.size());
  }

  public static void arrayListBuckets() { // CANNOT ADD ARRAYS TO ARRAYLISTS???
    ArrayList<String> list = new ArrayList<String>();
    for (int i = 0; i < 4; i++) {
      int[] bucket = new int[5];
      bucket[0] = i;
      bucket[1] = i * 100;
//      list.add(bucket);
//      list.addAll(Arrays.asList(bucket));
//      list.add({i, i*100});
    }

  }

  public static ArrayList<Integer> combineLists(ArrayList<Integer> first, ArrayList<Integer> second) {
    first.addAll(second);
    return first;
  }

  public static ArrayList<Integer> smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
    for (int num : second) {
      if (!first.contains(Integer.valueOf(num))) {
        first.add(num);
      }
    }
    return first;
  }

  public static void transfer(Account from, Account to, double amount) {
    from.withdraw(amount);
    to.deposit(amount);
  }
  
  public static void overloadedCounter() {
    OverloadedCounter counter1 = new OverloadedCounter(3, true);
    for (int i = 0; i < 4; i++) {
      counter1.decrease();
      System.out.println(counter1.getValue());
    }
  }
  
  public static void reformatoryPerson() {
    Person chris = new Person("chris", 25, 145);
    Reformatory reform = new Reformatory();
    System.out.println(reform.weight(chris));
    System.out.println(reform.weight(chris));
    reform.feed(chris);
    System.out.println(reform.weight(chris));
    System.out.println(reform.totalWeightMeasured());
    
  }
  
  public static void studentList() {
    ArrayList<Student> list = new ArrayList<>();
    
    Student chris = new Student("Chris", 420);
    Student bob = new Student("Bobert the ham slayer", 101);
    Student bo = new Student("Bo Burnham", 99);
    
    list.add(chris);
    list.add(bob);
    list.add(bo);
    
    for (Student student : list) {
      System.out.println(student);
    }
    
    for (Student student : list) {
      if (student.getName().indexOf("i") > -1) {
        System.out.println(student);
      }
    }
    
    for (Student student : list) {
      if (student.getName().indexOf("ham") > -1) {
        System.out.println(student);
      }
    }
  }
  
  public static void printElegantly(int[] numbers) {
    String results = "";
    for (int num : numbers) {
      results += num + ", ";
    }
    System.out.println(results.substring(0, results.length() - 2));
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    System.out.println("Hello World!");

    /* PRACTICE */
//    spruceTree();
//    userInfo();
//    addNums();
//    range();
//    System.out.println(factorial(5));
//    System.out.println(powerSum(3));
//    double[] arr = new double[4];
//    arr[0] = 4.0;
//    arr[1] = 2.0;
//    arr[2] = 2.0;
//    arr[3] = 4.0;
//    System.out.println(average(arr));
//    stringReverse("hello");
//    arrayListTest();
//    ArrayList<Double> list = new ArrayList<Double>();
//    list.add(2.0);
//    list.add(3.0);
//    list.add(4.0);
//    average_2(list);
//      ArrayList<Integer> first = new ArrayList<Integer>();
//      first.add(1);
//      first.add(2);
//      ArrayList<Integer> second = new ArrayList<Integer>();
//      second.add(3);
//      second.add(4);
//      second.add(1);
//      second.add(2);
//      System.out.println(combineLists(first, second));
//      System.out.println(smartCombine(first, second));
//    SampleClass.print();
//    
//    Person Bob = new Person("Bob", 24);
//    Person Dodo = new Person("Dodo", 25);
//
//    Bob.printPerson();
//    Dodo.printPerson();
//    Dodo.getOlder();
//    Dodo.printPerson();
//    System.out.println(Bob);
//      Account A = new Account("Chris's Gainz", 100.00);
//      Account B = new Account("Bobert's Toes", 420.00);
//      transfer(A, B, 50.00);
//      System.out.println(A);
//      System.out.println(B);
//    Counter counter = new Counter(10);
//    counter.print();
//    for (int i = 0; i < 12; i++) {
//      counter.decrease();
//      counter.print();
//    }
//    counter.increase();
//    counter.print();
      
    /* CLOCKS CLOCKS CLOCKS */
//    ClockCounter minutes = new ClockCounter(60);
//    ClockCounter hours = new ClockCounter(24);
//    
//    int i = 0;
//    while (i <= 121) {
//      System.out.println(hours + ":" + minutes);
//      if(minutes.getValue() == 59) {
//        hours.next();
//      }
//      minutes.next();
//      i++;
//    }
    
//    LotteryNumbers lottery = new LotteryNumbers();
//    ArrayList<Integer> numbers = lottery.getNumbers();
//    String results = "";
//    for (int number : numbers) {
//      results += number + " ";
//    }
//    System.out.println(results);

//    overloadedCounter();
//    reformatoryPerson();
//    studentList();

//    int[] numbers = { 1, 4, 3, 2 };
//    int sum = 0;
//    for (int i = 0; i < numbers.length; i++) {
//      sum += numbers[i];
//    }
//    System.out.println(sum);

//      int[] numbers = { 1, 4, 3, 2 };
//      printElegantly(numbers);
  }
}
