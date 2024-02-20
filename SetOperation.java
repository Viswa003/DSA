import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
class Person {
  private final String name;
  private final float income;
  private final int age;
  public Person(String name, float income, int age) {
    this.name = name;
    this.income = income;
    this.age = age;
  }
  public int getAge() {
    return age;
  }
  public float getIncome() {
    return income;
  }
  public String getName() {
    return name;
  }
}
public class SetOperation {
  public static void main(String[] args) {
    HashSet<Person> A = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no:of Person:");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.println("Enter Name: ");
      String name = sc.next();
      System.out.println("Enter Income: ");
      float income = sc.nextFloat();
      System.out.println("Enter age: ");
      int age = sc.nextInt();
      Person p = new Person(name, income, age);
      A.add(p);
    }
    for (Person item : A) {
      System.out.println(item.getName());
    }

    HashSet<Person> B = new HashSet<>();
    HashSet<Person> C = new HashSet<>();
    for (Person item : A) {
      // System.out.println(item.getName());
      if (item.getAge() > 60) {
        B.add(item);
      }
      if (item.getIncome() < 10000.0) {
        C.add(item);
      }
    }
    System.out.println("\nThe Persons Whose Age is greater Than 60: \n");
    System.out.print("\n\t NAME \t\t INCOME \t\t AGE \n");
    for (Person i : B) {
      System.out.printf("\t%5s\t\t%.2f\t\t%3d\n", i.getName(), i.getIncome(), i.getAge());
    }
    System.out.println("\nThe Persons Whose income is less Than 10000: \n");
    System.out.print("\n\t NAME \t\t INCOME \t\t AGE \n");
    for (Person i : C) {
      System.out.printf("\t%5s\t\t%.2f\t\t%3d\n", i.getName(), i.getIncome(), i.getAge());
    }
    HashSet<Person> intersection = new HashSet<>(B);
    intersection.retainAll(C);
    System.out.println("\nThe InterSection Of B and C is: \n");
    System.out.println("\n\tNAME\t\tINCOME\t\tAGE");
    for (Person i : intersection) {
      System.out.printf("\t%4s\t\t%4.2f\t\t%3d\n", i.getName(), i.getIncome(), i.getAge());
    }
  }
}