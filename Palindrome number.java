//Palindrome number:

import java.util.Scanner;

public class practice {
	public static void main(String args[]) {
		int s;
		Scanner cin = new Scanner(System.in);
		System.out.println("enter a number : ");
		s = cin.nextInt();
		int temp,rev = 0,t = s;
		while(t != 0) {
			temp = t%10;
			rev = (rev*10)+temp;
			t = t/10;
		}
		if(rev == s) {
			System.out.println("given number is palindrome");
		}
		else {
			System.out.println("given number is not a palindrome");
		}
	}
}



















