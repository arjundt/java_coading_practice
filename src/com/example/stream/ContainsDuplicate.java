package com.example.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Given an integer array nums, return true if any value appears 
//at least twice in the array, and return false if every element is distinct.
public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 3, 2};
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Set<Integer> set = new HashSet<>(list);
		if (set.size() == list.size()) {
			System.out.println("false");
		}
		System.out.println("false");

		/* or can also try below way */
		Set<Integer> setData = new HashSet<>();
		boolean containsDuplicate = Arrays.stream(nums)
				.anyMatch(num -> !setData.add(num));
		System.out.println(containsDuplicate);
	}
}