package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
//		String str = "record";
//		Set<Character> set = new HashSet<Character>();
//		for(int i=0; i<str.length(); i++) {
//			Character c = str.charAt(i);
//			boolean isAdded = set.add(c);
//			if(!isAdded) {
//				System.out.println("The first repetitive character is " + c);
//				break;
//			}
//		}
	Integer[] arr = {4,7,1,3,5,7,8,4,7};
	List<Integer> li = Arrays.asList(arr);
	li.stream().filter(number -> number > 2).distinct().sorted(Collections.reverseOrder()).forEach(System.out::println);

	}

}
