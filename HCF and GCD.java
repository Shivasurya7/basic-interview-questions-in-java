//HCF and GCD:

import java.util.Scanner;

public class practice {
	static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
		if(a > b) {
			return gcd(b,a%b);
		}
		else {
			return gcd(a,b%a);
		}
	}
	public static void main(String args[]) {
		int a,b;
		Scanner cin = new Scanner(System.in);
		System.out.println("enter the value of A : ");
		a = cin.nextInt();
		System.out.println("enter the value of B : ");
		b = cin.nextInt();
		System.out.println("the GCD of the given two number is : "+ gcd(a,b));
	}
}









