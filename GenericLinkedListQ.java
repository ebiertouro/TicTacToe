package ticTacToe;

public class GenericLinkedListQ<T>{
	
	private Node<T> head;
	private Node<T> tail;
	private int size;

	public GenericLinkedListQ () {
		head = null;
		tail = null;
		size = 0;	
	}
	
	@SuppressWarnings("hiding")
	public class Node<T>{
		T data;
		Node<T> next;
	
		Node(T data) {
			this.data = data;
			this.next = null;
	}}
	
	public void enqueue(T data) {
		Node<T> newNode = new Node<T>(data);
		
		
		if (isEmpty()) {
			head = newNode;
		}
		else {
			tail.next = newNode;
		}
		tail = newNode;
		size++;
		
	}
	
	public T dequeue() {
		T data = null;
		if (!isEmpty()) {
			data = head.data;
			head = head.next;
			size--;
		}
		if (isEmpty()) {
			tail = null;
		}
		return data;
	}
	
	public T peek() {
		T data = null;
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		if (!isEmpty()) {
			return head.data;
		}
		return data;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}
}