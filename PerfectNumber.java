package najeef.com;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {

	public static void main(String[] args) {
		List<Long> perfectNumList = new ArrayList<Long>();
		for(int i=1; i<=(100/2); i++) {
			int prime = primeNumber(i);
		    Long perfectNum = perfectNumbers(prime);
		    if(perfectNum > 0l && perfectNum < 100) {
		    	perfectNumList.add(perfectNum);
		    }
		}
		System.out.println(perfectNumList);
	}

	private static Long perfectNumbers(int p) {
		Long finalNum = 0l;
		if(p != 0) {
			Long mersennePrime = (long) (Math.pow(2, p) - 1);
			Long perfectNum = (long) Math.pow(2, (p-1));
			finalNum = mersennePrime * perfectNum;
		}
		return finalNum;
	}

	private static int primeNumber(int i) {
		if(i == 2 || i == 3) {
			return i;
		}
		
		int sqrt = (int) (Math.sqrt(i)+1);
		for(int j=2; j<sqrt; j++) {
			if(i%j != 0) {
				return i;
			}
		}
		return 0;
	}

}
