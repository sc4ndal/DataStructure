package week6;

public class ListStackDemo {

	public static void main(String[] args) {
		System.out.println("List Stack Demo!"); 
		ListStack<Integer> stack1 = new ListStack<>(); // �Ǵ� stack1 = new LinkedStack( );
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		System.out.print("printAll(): "); stack1.printAll();
		stack1.popAll();
		System.out.println(stack1.size);
		System.out.println("isEmpty?: " + stack1.isEmpty());
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		stack1.pop();
		stack1.push(40);
		System.out.print("printAll(): "); stack1.printAll(); 
		System.out.println("top: " + stack1.top());
		System.out.println("***************");
		System.out.println("stack1 size : " + stack1.size);
		System.out.println("stack1 for pop");
		System.out.println("***************");
		for(int i=stack1.size; i>=0; i--) {
			if(stack1.isEmpty()) {
				System.out.println("stack1 size : " + stack1.size);
				System.out.println("stack1 is empty");
			}
			else {
				System.out.println("stack1 size : " + stack1.size);
				System.out.println("stack1 is empty? : " + stack1.isEmpty());
				System.out.println("stack1 pop => " + stack1.pop());
				System.out.println("----");
				stack1.printAll();
			}
		}

//		System.out.println("pop() " + stack1.pop());
//		System.out.println("pop() " + stack1.pop());
//		System.out.println("pop() " + stack1.pop());
//		System.out.println("pop() " + stack1.pop()); // no effect
//		System.out.println("isEmpty?: " + stack1.isEmpty());
//		
	}
}
