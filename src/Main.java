import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Writing Hello World
        System.out.println("Hello World");

        // 2. Print even numbers
        int start = 1;
        int end = 100;

        System.out.println("Below is a list of even numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
       System.out.println(" "); // Add a new line after printing even numbers

        // 3. Calculating factorial
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        int result = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
        scanner.close();

        // 4. Compare two numbers
        int num1 = 1;
        int num2 = 100;

        if (num1 > num2) {
            System.out.println("Larger number: " + num1);
            System.out.println("Smaller number: " + num2);
        } else if (num1 < num2) {
            System.out.println("Larger number: " + num2);
            System.out.println("Smaller number: " + num1);
        } else {
            System.out.println("The numbers are equal.");
        }

        // 5. Checking for a leap year
        System.out.print("Checking for a Leap Year: ");
        int year = 2020;

        // Check if it's a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // 6. Fibonacci Series
        int numberOfTerms = 10;

        // Print Fibonacci series
        System.out.println("Fibonacci series up to " + numberOfTerms + " terms:");
        for (int i = 0; i < numberOfTerms; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // 7. Checking for Palindrome
        int numberPalindrome = 105;
        // Check if it's a palindrome using loop
        if (isPalindromeUsingLoop(numberPalindrome)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        // 8. Generating prime numbers between two numbers
        int upperLimit = 100;
        // Generate prime numbers using loop
        System.out.println("Prime numbers between 1 and " + upperLimit + " using a loop:");
        generatePrimesUsingLoop(upperLimit);
    }

    // 3. Calculating Factorial
    static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    // Function to check if a year is a leap year
    static boolean isLeapYear(int year) {
        // Leap year conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Function to calculate the Fibonacci
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Function to check if a number is a palindrome
    static boolean isPalindromeUsingLoop(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    // Function to generate prime numbers
    static void generatePrimesUsingLoop(int upperLimit) {
        for (int i = 2; i <= upperLimit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Move to the next line after printing prime numbers
    }

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}