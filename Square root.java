//Square root:

import java.util.Scanner;

public class practice {
	static float sqrt(int num) {
		float sqr = 0;
		while(sqr*sqr < num) {
			sqr += 0.001;
		}
		return sqr;	
	}
	public static void main(String args[]) {
		int n;
		Scanner cin = new Scanner(System.in);
        System.out.println("enter a number : ");
        n = cin.nextInt();
        System.out.println("the square root of a given number is : "+sqrt(n));     
	}
}























