import java.util.*;
// Q1: program to add two number
// public class index {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum;
//         sum = a + b;
//         System.out.println(sum);
//     }
// }

// Q2: Write a java program Check Whether a Number is Even or Odd,

// public class index {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);  //using scanner liberary to take input from the user
//         int a = sc.nextInt(); //taking integer a to store value getting from user
//         if (a % 2 == 0) {     // using if condition wheather a's remender is 0 when deveided by 2 
//             System.out.println("number is even"); // if a's remender is 0 when deviding by 2, getting true, then print number is even
//         } else {
//             System.out.println("number is odd"); //if conditin false then print number is odd NOTE: System.out.printnl use for print 
//         }
//     }
// }

//Q3: Write a java program Check if a given number is palindrome or not.(A number that is same after reverse is called palindrome number)

// public class index {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt(); // It is the number variable to be checked for palindrome
//         int r, sum = 0, temp; // taking integer r for storing remainder, sum for storing sum plus remender and
//                               // temp to store number taking from user for later comparison//

//         temp = a; // storing user input number in temp for later comparison weather both number is
//                   // same or not
//         while (a > 0) { // looping for breaking user input number and perform sum of saparete remeinder
//                         // getting from a after devining by 10
//             r = a % 10; // getting remainder
//             sum = (sum * 10) + r;
//             a = a / 10; // now devide user input number by 10 and store in a integer itself looping this process untill a > 0
//         }
//          //here below we are comparing temp and sum if it is same or not 
//         if (temp == sum)                          
//             System.out.println("palindrome number "); //if true print palindrome 
//         else
//             System.out.println("not a palindrome number"); //if false print not a palindrome

//     }
// }

//Q4: Write a java program to find the sum of n natural numbers,

// public class index {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int i, sum = 0;
//         // executes until the condition returns true
//         for (i = 1; i <= a; ++i) {
//             // adding the value of i into sum variable
//             sum = sum + i;
//         }
//         // prints the sum
//         System.out.println("Sum of First " + a + "  Natural Numbers is = " + sum);
//     }
// }

//Q5: Write a java program to Check Prime Number or not,

public class index {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int a = sc.nextInt();
        int i, m = 0, flag = 0;
        m = a / 2;
        if (a == 0 || a == 1) { // checking if number is equal to 0 or 1
            System.out.println(a + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (a % i == 0) {
                    System.out.println(a + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(a + " is prime number");
            }
        } // end of else

    }
}