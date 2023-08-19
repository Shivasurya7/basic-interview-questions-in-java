//Palindrome:

import java.util.Scanner;

public class practice {
	public static void main(String args[]) {
		String s,rev="";
		Scanner cin = new Scanner(System.in);
		System.out.println("enter a string : ");
		s = cin.nextLine();
		int n = s.length();
		boolean flag = true;
		for(int i = 0; i < n/2; i++) {
			if(s.charAt(i) != s.charAt(n - i - 1)) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("the given string is palindrome");
		}
		else {
			System.out.println("the given string is not a palindrome");
		}
	}
}


