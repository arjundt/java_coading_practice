package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class DetectCyclesInGraph {
	record Node(int id, int parentId) {
	}

	public static void main(String[] args) {
		List<Node> nodes = Arrays.asList(
				new Node(1, 0), 
				new Node(2, 1), 
				new Node(3, 2), 
				new Node(4, 3), 
				new Node(5, 4),
				new Node(2, 5));

		boolean hasCycle = nodes.stream()
			    .anyMatch(node -> nodes.stream()
			    		.filter(n -> n.id == node.parentId)
			    		.anyMatch(n -> n.id == node.id));
		System.out.println(hasCycle);
	}
}