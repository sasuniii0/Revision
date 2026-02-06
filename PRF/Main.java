import java.util.Scanner;

public class Main {
 private static Scanner sc = new Scanner(System.in);

 public static void main(String[] args) {
  // Uncomment the method you want to test:

  // sayHello();
  // addTwoNumbers();
  // arithmeticOperations();
  // rectangleCalculations();
  // celsiusToFahrenheit();
  // checkEvenOdd();
  // checkNumberSign();
  // findMaxOfThree();
  // calculateGrade();
  // multiplicationTable();
  // factorial();
  // reverseNumber();
  // printStarPattern();
  // arraySumAndAverage();
  // reverseString();
 }

 // 1. Hello World
 public static void sayHello() {
  System.out.println("Hello, World!");
  System.out.println("Welcome to Java programming.");
 }

 // 2. Add Two Numbers
 public static void addTwoNumbers() {
  System.out.print("Enter two integers: ");
  int a = sc.nextInt();
  int b = sc.nextInt();
  System.out.println("Sum: " + (a + b));
 }

 // 3. Basic Arithmetic
 public static void arithmeticOperations() {
  System.out.print("Enter two integers: ");
  int a = sc.nextInt();
  int b = sc.nextInt();
  System.out.println("Sum: " + (a + b));
  System.out.println("Difference: " + (a - b));
  System.out.println("Product: " + (a * b));
  System.out.println("Quotient: " + (a / b));
 }

 // 4. Rectangle Area and Perimeter
 public static void rectangleCalculations() {
  System.out.print("Enter length and width: ");
  int l = sc.nextInt();
  int w = sc.nextInt();
  System.out.println("The area of the Rectangle is " + (l * w));
  System.out.println("The perimeter of the Rectangle is " + (2 * (l + w)));
 }

 // 5. Temperature Converter
 public static void celsiusToFahrenheit() {
  System.out.print("Enter Celsius: ");
  double c = sc.nextDouble();
  double f = (c * 9 / 5) + 32;
  System.out.println("Fahrenheit: " + f);
 }

 // 6. Even or Odd
 public static void checkEvenOdd() {
  System.out.print("Enter a number: ");
  int n = sc.nextInt();
  if (n == 0) System.out.println("0");
  else if (n % 2 == 0) System.out.println("even");
  else System.out.println("odd");
 }

 // 7. Positive, Negative, or Zero
 public static void checkNumberSign() {
  System.out.print("Enter a number: ");
  int n = sc.nextInt();
  if (n < 0) System.out.println("Negative Number");
  else if (n == 0) System.out.println("Zero");
  else System.out.println("Positive Number");
 }

 // 8. Max of Three Numbers
 public static void findMaxOfThree() {
  System.out.println("Enter 3 numbers: ");
  int n1 = sc.nextInt();
  int n2 = sc.nextInt();
  int n3 = sc.nextInt();
  int max = n1;
  if (n2 > max) max = n2;
  if (n3 > max) max = n3;
  System.out.println("Max: " + max);
 }

 // 9. Grade Calculator
 public static void calculateGrade() {
  System.out.print("Enter marks: ");
  int m = sc.nextInt();
  if (m >= 75) System.out.println("Grade A");
  else if (m >= 65) System.out.println("Grade B");
  else if (m >= 45) System.out.println("Grade C");
  else if (m >= 35) System.out.println("Grade D");
  else System.out.println("F");
 }

 // 10. Multiplication Table
 public static void multiplicationTable() {
  System.out.print("Enter number: ");
  int n = sc.nextInt();
  for (int i = 1; i <= 10; i++) {
   System.out.println(n + " x " + i + " = " + (n * i));
  }
 }

 // 11. Factorial
 public static void factorial() {
  System.out.print("Enter number: ");
  int n = sc.nextInt();
  int fact = 1;
  for (int i = 1; i <= n; i++) fact *= i;
  System.out.println("Factorial: " + fact);
 }

 // 12. Reverse an Integer
 public static void reverseNumber() {
  System.out.print("Enter number to reverse: ");
  int n = sc.nextInt();
  int rev = 0;
  while (n != 0) {
   rev = rev * 10 + n % 10;
   n = n / 10;
  }
  System.out.println("Reversed: " + rev);
 }

 // 13. Star Pattern
 public static void printStarPattern() {
  for (int i = 1; i <= 4; i++) {
   for (int j = 1; j <= i; j++) System.out.print("*");
   System.out.println();
  }
 }

 // 14. Array Sum and Average
 public static void arraySumAndAverage() {
  System.out.print("Enter array size: ");
  int n = sc.nextInt();
  int[] arr = new int[n];
  int sum = 0;
  System.out.println("Enter " + n + " elements:");
  for (int i = 0; i < n; i++) {
   arr[i] = sc.nextInt();
   sum += arr[i];
  }
  System.out.println("Sum: " + sum);
  System.out.println("Average: " + (double) sum / n);
 }

 // 15. Reverse a String
 public static void reverseString() {
  System.out.print("Enter a string: ");
  sc.nextLine(); // Clear buffer
  String s = sc.nextLine();
  System.out.print("Reversed string: ");
  for (int i = s.length() - 1; i >= 0; i--) {
   System.out.print(s.charAt(i));
  }
  System.out.println();
 }
}