//Leap year or not:

import java.util.Scanner;

public class practice {
	public static void main(String args[]) {
		int s;
		Scanner cin = new Scanner(System.in);
		System.out.println("enter a year : ");
		s = cin.nextInt();
		if(s%4 == 0) {
			if(s%100 == 0) {
				if(s%400 == 0) {
					System.out.println("the given year is a leap year");
				}
				else {
					System.out.println("the given year is a leap year");
				}
			}
			else {
				System.out.println("the given year is a leap year");
			}
		}
		else {
			System.out.println("the given year is not a leap year");
		}
		
	}
}





