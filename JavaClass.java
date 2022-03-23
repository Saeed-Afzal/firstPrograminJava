package firstPrograminJava;

import javax.swing.JOptionPane; // use for GUI

import java.util.ArrayList;
import java.util.Random; // use for random number
import java.util.Scanner; // use for input

public class JavaClass {
   public static void main(String[] args) {
      // System.out.print("Hello Java\n");
      // System.out.print("Hello Java\n");

      // int x, y;
      // x= 20;
      // y= 15;
      // System.out.print(x+y);

      // Scanner scanner = new Scanner(System.in);
      // System.out.println("What is your name");
      // String name = scanner.nextLine();

      // System.out.println("What is your age");
      // int age = scanner.nextInt();
      // scanner.nextLine(); // use to stay for next input

      // System.out.println("What is your favourite food");
      // String food = scanner.nextLine();

      // System.out.println("Hello " + name);
      // System.out.println("Hello " + age);
      // System.out.println("Hello " + food);

      // GUI starts
      // String name = JOptionPane.showInputDialog("Enter Your Name");
      // JOptionPane.showMessageDialog(null, name);

      // int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
      // JOptionPane.showMessageDialog(null, "You are " + age + "Years Old");

      // double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your
      // Height"));
      // JOptionPane.showMessageDialog(null, "You are " + height + "cm tall");
      // GUI ends

      // Hypotenuse start
      // double x,y,z;
      // Scanner scanner = new Scanner(System.in);

      // System.out.println("Enter side x ");
      // x = scanner.nextDouble();
      // System.out.println("Enter side y ");
      // y = scanner.nextDouble();
      // z = Math.sqrt((x*x)+(y*y)); // hypotenuse formula
      // System.out.println("The Hypotenuse is " + z);
      // scanner.close();
      // Hypotenuse end

      // Generate Random Values start
      // Random random = new Random();
      // // int x = random.nextInt(6); // number b/w 0 to 5
      // int x = random.nextInt(6)+1; // number b/w 1 to 6

      // System.out.println(x);
      // Generate Random Values end

      // if statement start
      // int age = 12;
      // if(age>=18){
      // System.out.println("Yor are adult");
      // }
      // else if(age<=18 && age >= 12){
      // System.out.println("Yor are boy");
      // }
      // else{
      // System.out.println("Yor are kid");
      // }
      // if statement end

      // while start
      // Scanner scanner = new Scanner(System.in);
      // String name = "";
      // while (name.isEmpty()) {
      // System.out.println("Enter your name");
      // name = scanner.nextLine();
      // }
      // System.out.println("Hello " + name);
      // while end

      // do start
      // Scanner scanner = new Scanner(System.in);
      // String name = "";
      // do {
      // System.out.println("Enter your name");
      // name = scanner.nextLine();
      // }while (name.isEmpty())
      // System.out.println("Hello " + name);
      // do end

      // for start
      // for( int i = 0; i<= 10; i++){
      // System.out.println(i);
      // }
      // for end

      // nested start
      // Scanner scanner = new Scanner(System.in);
      // int rows;
      // int columns;
      // String symbol = "";

      // System.out.println("Enter no of rows ");
      // rows = scanner.nextInt();

      // System.out.println("Enter no of columns ");
      // columns = scanner.nextInt();

      // System.out.println("Enter symbol ");
      // symbol = scanner.next();

      // for(int i =1; i<=rows; i++){
      // System.out.println();
      // for(int j = 1; j<=columns; j++){
      // System.out.print(symbol);
      // }

      // }
      // nested end

      // array start
      // 1st method
      // String[] cars = {
      // "BMW", "Honda","Civic"
      // };
      // System.out.println(cars[0]);

      // 2nd method
      // String[] cars = new String[3];
      // cars[0] = "BMW";
      // cars[1] = "Ferari";
      // cars[1] = "Civic";

      // for(int i = 0; i<=cars.length; i++){
      // System.out.println(cars[i]);
      // }
      // array end

      // 2D array start
      // String[][] cars = new String[3][3];
      // String[][] cars = {
      // { "Camaro", "Corvete", "Silverada" },
      // { "Mustang", "Ranger", "Ferari" },
      // { "Civic", "BMW", "Honda" }
      // };
      // for (int i = 0; i < cars.length; i++) {
      // System.out.println();
      // for (int j = 0; j < cars[i].length; j++) {
      // System.out.print(cars[i][j] + " ");
      // }

      // }
      // 2D array end

      // ArrayList start
      // ArrayList<String> food = new ArrayList<String>();
      // food.add("Pizza");
      // food.add("Hamburger");
      // food.add("hotdog");

      // food.set(0, "sushi");
      // // food.remove(2);
      // // food.clear();

      // for(int i = 0; i<food.size();i++){
      // System.out.println(food.get(i));
      // }
      // ArrayList end

      // 2d ArrayList start
      // ArrayList<ArrayList<String>> grocery = new ArrayList();

      // ArrayList<String> bakeryList = new ArrayList<String>();
      // bakeryList.add("pasta");
      // bakeryList.add("bread");
      // bakeryList.add("donuts");

      // ArrayList<String> productList = new ArrayList<String>();
      // productList.add("tomatoes");
      // productList.add("zucchini");
      // productList.add("peppers");

      // grocery.add(bakeryList);
      // grocery.add(productList);

      // System.out.println(grocery);

      // 2d ArrayList end

      // for each start
      // String[] animals = {"cats","dogs","lions"};

      // for (String i : animals){
      // System.out.println(i);
      // }
      // for each end

      // overloaded method start
      // create same name of method but different parameters is called overloaded
      int sum = add(1, 2, 3);
      System.out.println(sum);
      // overloaded method end

   }
   // overloaded method start
   // static int add( int x, int y){
   // return x+y;
   // }
   // static int add( int x, int y, int z){
   // return x+y+z;
   // }
   // overloaded method end

}