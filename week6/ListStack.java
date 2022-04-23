package week6;

public class ListStack<E> implements StackInterface<E> {
	private ListInterface<E> list;
	public int size;
	
	public ListStack() {
		size = 0;
		list = new LinkedList<E>();
	}

	public void push(E newItem) {
		list.add(0, newItem);
		size++;
	}
	
	public E pop() {
		size--;
		return list.remove(0);
	}
 
	public E top() {
		return list.get(0);
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public void popAll() {
		list.clear();
		size=0;
	}

	////////////////////////////////
	public void printAll() {
		list.printAll();
	}
} // 코드 6-7
