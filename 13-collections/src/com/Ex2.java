package com;

class LinkedList<E> {

	private Node head;

	public void add(E data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node last = head;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(newNode);
		}
	}

	public void add(int idx, E data) {
		// ..
	}

	public void get(int idx) {
		// ..
	}

	public void remove(int idx) {
		// ..
	}

	private class Node {

		private E data;
		private Node next;

		public Node(E data) {
			this.data = data;
		}

		public Node(E data, Node next) {
			this.data = data;
			this.next = next;
		}

		public E getData() {
			return data;
		}

		public void setData(E data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}

public class Ex2 {

	public static void main(String[] args) {

		LinkedList<Object> linkedList = new LinkedList<>(); // DS
		linkedList.add("idly");
		linkedList.add("vada");
		linkedList.add("poori");
		linkedList.add(123);

		LinkedList<Integer> linkedList2 = new LinkedList<>();
		linkedList2.add(123);

	}

}
