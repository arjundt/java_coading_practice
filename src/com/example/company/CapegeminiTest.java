package com.example.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//	Given an array of intervals where intervals[i] = [starti, endi], 
//	merge all overlapping intervals, and return an array of the non-overlapping intervals 
//	that cover all the intervals in the input.
//	Example 1:
//		Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//		Output: [[1,6],[8,10],[15,18]]
//		Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6]
public class CapegeminiTest {
	public static void main(String[] args) {
		int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
		int[][] mergedIntervals = mergeIntervals(intervals);
	}
	public static int[][] mergeIntervals(int[][] intervals){
		Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
		List<int[]> result = new ArrayList<>();
		
		int[] crr = intervals[0];
		result.add(crr);
		
		for(int i = 1; i< intervals.length; i++) {
			if(intervals[i][0] <= crr[1]) {
				crr[1] = Math.max(crr[1], intervals[i][1]);
			} else {
				
			}
		}
		
		
		
		return null;
	}
}
//[1, 3] [2, 6]
//		[1, 6]