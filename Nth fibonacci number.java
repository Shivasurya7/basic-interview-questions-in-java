//Nth fibonacci number:

import java.util.Scanner;

public class practice {
	public static void main(String args[]) {
		int n,f1=0,f2=1,f3 = 0;
		Scanner cin = new Scanner(System.in);
		System.out.println("enter no of elements in the array : ");
		n = cin.nextInt();
		for(int i = 0; i < n-1; i++) {
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
		}
		System.out.print("the "+n+"th fibnocci number is : "+f3);
	}
}








