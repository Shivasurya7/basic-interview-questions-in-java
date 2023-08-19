//Sum of digit of a number:

import java.util.Scanner;

public class practice {
	static int sumOfDigit(int a) {
		int f=0;
		while(a != 0) {
			f += a%10;
			a = a/10;
		}
		return f;
	}
	public static void main(String args[]) {
		int a;
		Scanner cin = new Scanner(System.in);
		System.out.println("enter a number: ");
		a = cin.nextInt();
		System.out.println("the sum of the digit of the number is : "+sumOfDigit(a));
	}
}















