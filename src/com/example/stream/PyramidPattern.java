package com.example.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PyramidPattern {

	public static void main(String[] args) {
		int levels = 5;
		List<String> pyramid = IntStream.rangeClosed(1, levels)
		    .mapToObj(i -> " ".repeat(levels - i) + IntStream.rangeClosed(1, i)
		    .mapToObj(String::valueOf)
		    .collect(Collectors.joining(" ")))
		    .collect(Collectors.toList());
		pyramid.forEach(System.out::println);
	}
}