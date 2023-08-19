//Reverse a number:

import java.util.Scanner;

public class practice {
	public static void main(String args[]) {
		int s;
		Scanner cin = new Scanner(System.in);
		System.out.println("enter a number : ");
		s = cin.nextInt();
		int temp,rev = 0;
		while(s != 0) {
			temp = s%10;
			rev = (rev*10)+temp;
			s = s/10;
		}
		System.out.println("the reverse number is : " + rev);
	}
}

