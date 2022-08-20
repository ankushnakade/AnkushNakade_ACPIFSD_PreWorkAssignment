package preWorkAssignment;

import java.util.Scanner;

public class Main {

	int choice;
	Scanner sc;

	// function to checkPalindrome
	public void checkPalindrome(long num) {
		long number = num;
		long reverse = 0;
		while (number > 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
		}
		if (num == reverse) {
			System.out.println("Entered number is a palindrome number!!!");
		} else {
			System.out.println("Entered number is not a palindrome number!!!");
		}
	}

	// function to printPattern
	public void printPattern(int num) {
		for (int i = num; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// function to check number is prime or not
	public void checkPrimeNumber(long num) {
		boolean isPrime = false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			} else {
				isPrime = true;
			}
		}
		if (isPrime == true) {
			System.out.println("Entered number is a prime number");
		} else {
			System.out.println("Entered number is not a prime number");
		}
	}

	// function to print FibonacciSeries
	public void printFibonacciSeries(int num) {
		long first = 0;
		long second = 1;
		long result = 0;
		System.out.print(first + ", " + second);
		for (int i = (num - 2); i > 0; i--) {
			result = first + second;
			System.out.print(", " + result);
			first = second;
			second = result;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice from the below list:\n" + "1. Check for palindrome number\n"
					+ "2. Print the pattern of stars in decreasing order\n"
					+ "3. Check whether the input number is a prime number\n" + "4. Print Fibonacci series\n"
					+ "-->Enter 0 to Exit");

			main.choice = main.sc.nextInt();

			switch (main.choice) {
			case 0: {
				main.choice = 0;
				break;
			}
			case 1: {
				System.out.println("Enter your number:");
				main.checkPalindrome(main.sc.nextLong());
				System.out.println();
				break;
			}
			case 2: {
				System.out.println("Enter number of rows:");
				main.printPattern(main.sc.nextInt());
				System.out.println();
				break;
			}
			case 3: {
				System.out.println("Enter your number:");
				main.checkPrimeNumber(main.sc.nextLong());
				System.out.println();
				break;
			}
			case 4: {
				System.out.println("Enter length of Fibonacci Series:");
				main.printFibonacciSeries(main.sc.nextInt());
				System.out.println();
				break;
			}
			default: {
				System.out.println("Invalid choice. Select a correct option.");
				System.out.println();
			}
			}
		} while (main.choice != 0);
		System.out.println("Exited successfully.");
		main.sc.close();
	}

}
