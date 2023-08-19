//Reversae a string: 

import java.util.Scanner;

public class practice {
	public static void main(String args[]) {
		String s,rev="";
		Scanner cin = new Scanner(System.in);
		System.out.println("enter a string : ");
		s = cin.nextLine();
		int n = s.length();
		for(int i = 0; i < n; i++) {
			char c = s.charAt(i);
			rev = c+rev;
		}
		System.out.println("the reverse string is : " + rev);
	}
}
