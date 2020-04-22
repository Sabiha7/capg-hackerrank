package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class LotteryCoupons {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num");
		int num = scanner.nextInt();
		int count = lotteryCoupons(num);
		System.out.println(count);
		scanner.close();
	}

	private static int lotteryCoupons(int n) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			int num = i;
			int sum = 0;
			while (num > 0) {
				int temp = num % 10;
				sum += temp;
				num = num / 10;
			}
			numbers.add(sum);
		}
		List<Integer> countList = new ArrayList<Integer>();
		for (int j = 0; j < numbers.size(); j++) {
			int count = 1;
			for (int k = j + 1; k < numbers.size(); k++) {
				if (numbers.get(j).equals(numbers.get(k))) {
					count++;
					numbers.remove(k);
				}
			}
			countList.add(j, count);
		}
		Optional<Integer> max = countList.stream().max(Integer::compareTo);
		int c = 0;
		for(int i=0; i<countList.size(); i++) {
			if(countList.get(i) == max.get()) {
				c++;
			}
		}
		return c;
	}

}
