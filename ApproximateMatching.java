package com.hackerrank;

import java.util.Scanner;

public class ApproximateMatching {

	public static void main(String[] args) {
		
		//String substring = calculateScore("engine", "raven", "ginkgo");
		String substring = calculateScore("nothing", "bruno", "ingenious");
		System.out.println(substring);
	}

	private static String calculateScore(String text, String prefix, String suffix) {
		String tempPrefix = "";
		String pre = "";
		for(int i=0; i<text.length(); i++) {
			tempPrefix = tempPrefix +Character.toString(text.charAt(i));
			if(prefix.endsWith(tempPrefix)) {
				pre = tempPrefix;
				break;
			}
		}
		String tempSuffix = "";
		String suff = "";
		int j=0;
		while(j < text.length()) {
			tempSuffix =  Character.toString(text.charAt(j));
			if(suffix.startsWith(tempSuffix)) {
				for(int k=j+1; k<text.length(); k++) {
					tempSuffix = tempSuffix + Character.toString(text.charAt(k));
					if(suffix.startsWith(tempSuffix)) {
						suff = tempSuffix;
					}
				}
				break;
			}
			j++;
		}
		int suffIndex = text.indexOf(Character.toString(suff.charAt(0)));
		int preIndex = text.indexOf(Character.toString(pre.charAt(pre.length()-1)));
		String s = text.substring(preIndex+1,suffIndex);
		String newstring = "";
		String subString = newstring.concat(pre).concat(s).concat(suff);
		return subString;
	}

}
