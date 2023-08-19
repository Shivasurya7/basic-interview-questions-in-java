//Binary to octal:

import java.util.Scanner;

public class practice {
	public static void main(String args[]) {
		int n,i,size=0;
		Scanner cin = new Scanner(System.in);
        System.out.println("enter a number : ");
        n = cin.nextInt();
        i = n;
        while(i != 0) {
        	i = i/8;
        	size++;
        }
        int bi[] = new int[size];
        i = size-1;
        while(n != 0){
            bi[i] = n%8;
            i--;
            n = n/8;
        }
        System.out.println("the octal form of given number is : ");
        for(int j = 0;j < size;j++){
    		System.out.print(bi[j]);    
        }    
	}
}






















