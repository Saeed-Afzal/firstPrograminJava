package firstPrograminJava;

import java.util.Scanner;

public class JavaClass {
   public static void main(String[] args) {
      // System.out.print("Hello Java\n");
      // System.out.print("Hello Java\n");

      // int x, y;
      // x= 20;
      // y= 15;
      // System.out.print(x+y);

      Scanner scanner = new Scanner(System.in);
      System.out.println("What is your name");
      String name = scanner.nextLine();

      System.out.println("What is your age");
      int age = scanner.nextInt();
      scanner.nextLine(); // use to stay for next input 

      System.out.println("What is your favourite food");
      String food = scanner.nextLine();


      System.out.println("Hello " + name);
      System.out.println("Hello " + age);
      System.out.println("Hello " + food);

   }
}