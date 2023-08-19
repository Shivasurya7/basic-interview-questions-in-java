//Prime or not:

import java.util.Scanner;

public class practice {
	public static void main(String args[]) {
		int s;
		Scanner cin = new Scanner(System.in);
		System.out.println("enter a number : ");
		s = cin.nextInt();
		boolean flag = true;
		for(int i = 2; i <= s/2; i++) {
			if(s%i == 0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("the given number is prime");
		}
		else {
			System.out.println("the given number is not prime");
		}
	}
}



