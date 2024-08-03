#Area and perimeter of rectangle

import java.util.*;

class Rectangle{
	public static void main(String args[]){
		System.out.println("Enter the length of the rectangle");
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		System.out.println("Enter the breath of the rectangle");
		int b = sc.nextInt();
		int perimeter = 2*(l+b);
		int area = l*b;
		System.out.println("The perimeter of the rectangle is:" + perimeter);
		System.out.println("The area of the rectangle is:" + area);


		
	}
}
