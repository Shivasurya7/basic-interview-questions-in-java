//Highest among ten numbers.:

import java.util.Scanner;

public class practice {
	public static void main(String args[]) {
		int n;
		Scanner cin = new Scanner(System.in);
		System.out.println("enter no of elements in the array : ");
		n = cin.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements in the array : ");
		for(int i = 0; i < n; i++) {
			arr[i] = cin.nextInt();
		}
		int max = arr[0];
		for(int i = 0; i < n; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("the max elements in the array is : "+ max);
	}
}






