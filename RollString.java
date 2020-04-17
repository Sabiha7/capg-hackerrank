package najeef.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RollString {
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scanner.next();
		System.out.println("Enter the number of time to be rolled");
		int n = scanner.nextInt();
		List<Integer> intList = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			System.out.println("Enter the rolling value");
			int roll = scanner.nextInt();
			intList.add(roll);
		}
		
		String rolledString = rollTheString(str, intList);
		System.out.println("RolledString= "+rolledString);
		scanner.close();
	}

	private static String rollTheString(String str, List<Integer> intList) {
		String newStr = "";
		for (Integer roll : intList) {
			for (int i = 0; i < roll; i++) {
				int ascii = str.charAt(i);
				if (str.charAt(i) == 'z') {
					newStr = newStr + Character.toString('a');
				} else {
					newStr = newStr + Character.toString((char) (ascii + 1));
				}
			}
			while (str.length() > roll) {
				newStr = newStr + str.charAt(roll);
				roll++;
			}
			str = newStr;

			newStr = "";
		}

		return str;
	}
}
