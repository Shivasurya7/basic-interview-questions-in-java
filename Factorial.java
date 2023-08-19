//Factorial:

import java.util.Scanner;

public class practice {
	static int factorial(int a) {
		if(a == 1) {
			return 1;
		}
		return a*factorial(a-1);
	}
	public static void main(String args[]) {
		int a;
		Scanner cin = new Scanner(System.in);
		System.out.println("enter a number: ");
		a = cin.nextInt();
		System.out.println("the Factorial of the given number is : "+ factorial(a));
	}
}










