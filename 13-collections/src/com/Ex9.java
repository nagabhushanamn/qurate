package com;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex9 {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();
		stack.push("idly");
		stack.push("vada");
		stack.push("poori");

		for (String item : stack) {
			System.out.println(item);
		}

		System.out.println();

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

		Queue<String> queue = new LinkedList<>();
		queue.offer("idly");
		queue.offer("vada");
		queue.offer("poori");

		Deque<String> deque = new LinkedList<>();

		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}

}
