package week5;

public class Node0  <E extends Comparable<E>>{
	private E    item;
	private Node0 next;
	public Node0(E item, Node0<E> next) {
		this.item = item;
		this.next = next;
	}
	public E getItem() {
		return item;
	}
	public void setItem(E item) {
		this.item = item;
	}
	public Node0 getNext() {
		return next;
	}
	public void setNext(Node0 next) {
		this.next = next;
	}
	
	
}