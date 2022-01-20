package Assignment;

import java.util.*;

public class CheckEqualityLinesUC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Give Co-ordinate values of x1, y1, x2, y2: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		double length1 = Math.sqrt((x2 - x1)^2 + (y2-y1)^2);
		
		System.out.println("Please Give Co-ordinate values of a1, b1, a2, b2: ");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		
		double length2 = Math.sqrt((a2 - a1)^2 + (b2 - b1)^2);
		
		System.out.println("Length1 of given Co-ordinates is: " +length1);
		System.out.println("Length2 of given Co-ordinates is: " +length2);
		
		if (length1 == length2)
			System.out.println("Given lines are equal");
		else
			System.out.println("Given lines are not equal");
	}

}
