package Assignment;

import java.util.*;

public class CartesianSystemUC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Give Co-ordinate value of x1: ");
		int x1 = sc.nextInt();
		System.out.println("Please Give Co-ordinate value of y1: ");
		int y1 = sc.nextInt();
		
		System.out.println("Please Give Co-ordinate value of x2: ");
		int x2 = sc.nextInt();
		System.out.println("Please Give Co-ordinate value of y2: ");
		int y2 = sc.nextInt();
		
		length = Math.sqrt((x2 - x1)^2 + (y2-y1)^2);
		System.out.println("Length of given Co-ordinates is: " +length);
	}

}
