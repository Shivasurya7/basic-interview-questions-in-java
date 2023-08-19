//Prime number till n number:

import java.util.Scanner;

public class practice {
	public static void main(String args[]) {
		int s;
		Scanner cin = new Scanner(System.in);
		System.out.println("enter a number : ");
		s = cin.nextInt();
		System.out.print("the list of prime number till "+s+" : ");
		for(int k = 2; k <= s; k++) {
			boolean flag = true;
			for(int i = 2; i <= k/2; i++) {
				if(k%i == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.print(k+" ");
			}
		}
	}
}




