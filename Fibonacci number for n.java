//Fibonacci number for n :

import java.util.Scanner;

public class practice {
	public static void main(String args[]) {
		int n,f1=0,f2=1,f3;
		Scanner cin = new Scanner(System.in);
		System.out.println("enter no of elements in the array : ");
		n = cin.nextInt();
		System.out.print("the "+n+" fibnocci number is : "+f1+" "+f2+" ");
		for(int i = 0; i < n-2; i++) {
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
			System.out.print(f3+" ");
		}
	}
}







