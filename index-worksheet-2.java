// import java.util.*;

// Q17. Write a java program to check even or odd number
// class Test {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("please enter a number");
// int num = sc.nextInt();
// if (num % 2 == 0) {
// System.out.println("it is a even number");
// } else {
// System.out.println("it is a odd number");
// }

// }
// }

// Q18 Write a java program to find average of two numbers

// class Test {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int avg;
// System.out.println("please enter first number");
// int num1 = sc.nextInt();
// System.out.println("enter second number");
// int num2 = sc.nextInt();
// avg = (num1 + num2) / 2;
// System.out.println("The average of two number is " + "" + avg);

// }
// }

// Q19 Write a java program to swap two numbers
// class Test {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int num1, num2;
// System.out.println("please enter first number");
// num1 = sc.nextInt();
// System.out.println("enter second number");
// num2 = sc.nextInt();
// int temp;
// temp = num1;
// num1 = num2;
// num2 = temp;
// System.out.println("after swap num1 is: " + " " + num1);
// System.out.println("after swap num2 is: " + " " + num2);

// }
// }

// Q20 Write a java program to check whether a number is prime or not

// class Test {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int num;
// System.out.println("please enter number");
// num = sc.nextInt();
// if (isPrime(num)) {
// System.out.println("number is prime number");
// } else {
// System.out.println("number is not a prime number");
// }
// }

// public static boolean isPrime(int num) { // checking some special cases for
// (0,1,2)
// if (num <= 1) {
// return false;
// }
// if (num == 2) {
// return true;
// }
// if (num % 2 == 0) {
// return false;
// }
// int sqrt = (int) Math.sqrt(num) + 1; // checking add number up to the square
// root of the input number
// for (int i = 3; i <= sqrt; i++) {
// if (num % i == 0) {
// return false;
// }
// }
// return true;
// }
// }

// Q21. Write a java program to find table of n

// class Test {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// System.out.println("print table of " + " " + num);
// printTable(num);

// }

// public static void printTable(int n) {
// for (int i = 1; i <= 10; i++) {
// System.out.println(n + "X" + i + " = " + (n * i));
// }
// }
// }

// Q22. Write a java program to find the largest of three numbers.
// class Test {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter first number num1");
// int num = sc.nextInt();
// System.out.println("enter Second number num2");
// int num2 = sc.nextInt();
// System.out.println("enter Third number num3");
// int num3 = sc.nextInt();
// int largest = largestNum(num, num2, num3);
// System.out.println("the largest number is : " + "" + largest);

// }

// public static int largestNum(int num, int num2, int num3) {
// int largest = num;
// if (num2 > largest) {
// largest = num2;
// }
// if (num3 > largest) {
// largest = num3;
// }
// return largest;
// }
// }

// Q23. Write a java program to calculate Simple Interest

// class Test {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter principle amount");
// int Principle = sc.nextInt();
// System.out.println("enter interest ratio");
// int InterestRate = sc.nextInt();
// System.out.println("enter Time");
// int time = sc.nextInt();
// int interestSimple = (Principle * InterestRate * time) / 100;
// System.out.println("the simple interest is : " + "" + interestSimple);

// }
// }

// Q24. Write a java program to calculate Area and perimeter of Rectangle

// class Test {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter base");
// int base = sc.nextInt();
// System.out.println("enter length");
// int length = sc.nextInt();
// areaOfRect(length, base);
// perimeterofRect(length, base);

// }

// public static void areaOfRect(int len, int base) {
// int area = len * base;
// System.out.println(" area of rectangel is :" + " " + area);
// }

// public static void perimeterofRect(int len, int base) {
// int rect = 2 * (len + base);
// System.out.println(" Perimeter of rectangel is :" + " " + rect);
// }
// }

// // Q25. Write a java program to check whether character is vowel or consonant

// class Test {

// public static void main(String[] arg) {
// int i = 0;
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a character : ");
// char ch = sc.next().charAt(0);
// if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch ==
// 'A' || ch == 'E' || ch == 'I'
// || ch == 'O' || ch == 'U') {
// System.out.println("Entered character " + ch + " is Vowel");
// } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
// System.out.println("Entered character " + ch + " is Consonant");
// else
// System.out.println("Not an alphabet");
// }
// }