//Binary to decimal:

import java.util.Scanner;

public class practice {
	static int pow(int num, int expo) {
		int n = 1;
		for(int i = 0; i < expo; i++) {
			n *= num;
		}
		return n;
	}
	public static void main(String args[]) {
		long n;
		int i = 0,f=0;
		Scanner cin = new Scanner(System.in);
        System.out.println("enter a binary number : ");
        n = cin.nextLong();
        while(n != 0){
            f += (n%10)*pow(2,i);
            i++;
            n = n/10;
        }
        System.out.println("the decimal form of given number is : "+f);   
	}
}





















