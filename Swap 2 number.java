//Swap 2 number:

import java.util.Scanner;

public class practice {
	public static void main(String args[]) {
		int a,b;
		Scanner cin = new Scanner(System.in);
		System.out.println("enter the A value : ");
		a = cin.nextInt();
		System.out.println("enter the B value : ");
		b = cin.nextInt();
		System.out.println("before swap");
		System.out.println("value of A ="+a);
		System.out.println("value of B ="+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("after swap");
		System.out.println("value of A ="+a);
		System.out.println("value of B ="+b);
	}
}












