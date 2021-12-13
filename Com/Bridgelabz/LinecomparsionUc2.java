package Com.Bridgelabz;

import java.util.Scanner;

public class LinecomparsionUc2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values:");
		double x1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double a1 = scan.nextDouble();
		double a2 = scan.nextDouble();
		double b1 = scan.nextDouble();
		double b2 = scan.nextDouble();
		double len1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double len2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
		System.out.println("length is:" + len1);
		System.out.println("length is:" + len2);
		if (len1 == len2) {
			System.out.println("len1s are equal");
		} else {
			System.out.println("both lines are not equal");
		}


	}
}






//  *************************** OUT PUT *******************************


/*enter the values:
	10
	20
	30
	40
	5
	6
	98
	65
	length is:14.142135623730951
	length is:33.015148038438355
	both lines are not equal */