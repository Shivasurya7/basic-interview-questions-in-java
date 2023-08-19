//Armstrong number:

import java.util.Scanner;

public class practice {
	static boolean checkAmstrong(int a) {
		int c = a,f=0,temp;
		while(c != 0) {
			temp = c%10;
			f += temp*temp*temp;
			c = c/10;
		}
		if(f == a) {
			return true;
		}
		return false;
	}
	public static void main(String args[]) {
		int a;
		Scanner cin = new Scanner(System.in);
		System.out.println("enter a number: ");
		a = cin.nextInt();
		if(checkAmstrong(a)) {
			System.out.println("THE GIVEN NUMBER IS AMSTRONG NUMBER");
		}
		else {
			System.out.println("THE GIVEN NUMBER IS NOT A AMSTRONG NUMBER");
		}
	}
}











