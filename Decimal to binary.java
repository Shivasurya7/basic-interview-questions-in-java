//Decimal to binary:

import java.util.Scanner;

public class practice {
	public static void main(String args[]) {
		int n,i,size=0;
		Scanner cin = new Scanner(System.in);
        System.out.println("enter a number : ");
        n = cin.nextInt();
        i = n;
        while(i != 0) {
        	i = i/2;
        	size++;
        }
        int bi[] = new int[size];
        i = 0;
        while(n != 0){
            bi[i] = n%2;
            i++;
            n = n/2;
        }
        System.out.println("the binary form of given number is : ");
        for(int j = i-1;j >= 0;j--){
    		System.out.print(bi[j]);    
        }    
	}
}




















