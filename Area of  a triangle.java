//Area of  a triangle:

import java.util.Scanner;

public class practice {
	static float areaOfTriangle(float b,float h) {
		return (float)(0.5*b*h);
	}
	public static void main(String args[]) {
		float b,h; 
		Scanner cin = new Scanner(System.in);
		System.out.println("enter the breath of a triangle : ");
		b = cin.nextFloat();
		System.out.println("enter the hight of a triangle : ");
		h = cin.nextFloat();
		System.out.println("the area of a triangle is : "+areaOfTriangle(b,h));
	}
}


















