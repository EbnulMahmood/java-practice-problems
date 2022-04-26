
public class Stack {
	
	private int stack[];
	private int top;
	
	Stack(int size) {
		stack = new int[size];
		top = -1;
	}
	
	void push(int item) {
		if (top == stack.length - 1)
			System.out.println("Stack is full.");
		else
			stack[++top] = item;
	}
	
	int pop() {
		if (top < 0) {
			System.out.println("Stack underflow.");
			return 0;
		}
		else
			return stack[top--];
	}
}
