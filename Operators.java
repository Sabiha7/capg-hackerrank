package najeef.com;

import java.util.Scanner;

public class Operators {
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter meal cost");
		double mealCost = scanner.nextDouble();
		System.out.println("enter tip percent");
		int tipPerc = scanner.nextInt();
		System.out.println("enter tax percent");
		int taxPerc = scanner.nextInt();
		
		int total = calculateTotalCost(mealCost,tipPerc,taxPerc);
		System.out.println(total);
	}

	private static int calculateTotalCost(double mealCost, int tipPerc, int taxPerc) {
		double tip = mealCost * tipPerc/100;
		double tax = mealCost * taxPerc/100;
		int sum = (int) (mealCost +tip+tax);
		return sum;
	}

}
