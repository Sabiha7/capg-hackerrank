package najeef.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Median {

	public static void main(String[] args) {
		int[] array1 = {2,3,6,7,9};
		int[] array2 = {-1,4,8,10};
		int mid = 5;
		System.out.println(median(array1,array2,mid));
	}

	private static int median(int[] array1, int[] array2, int mid) {
		List<Integer> list1 = Arrays.stream(array1).boxed().collect(Collectors.toList());
		List<Integer> list2 = Arrays.stream(array2).boxed().collect(Collectors.toList());
		List<Integer> merged = new ArrayList<Integer>(list1);
		merged.addAll(list2);
		Collections.sort(merged);
		return merged.get(mid-1);
	}

}
