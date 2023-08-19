//Odd or even:

import java.util.Scanner;

public class practice {
	public static void main(String args[]) {
		int a;
		Scanner cin = new Scanner(System.in);
		System.out.println("enter a number: ");
		a = cin.nextInt();
		if(a%2 == 0) {
			System.out.println("the given number is even");
		}
		else {
			System.out.println("the given number is odd");
		}
	}
}
















