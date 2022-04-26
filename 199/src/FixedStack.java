
public class FixedStack implements IntStack {
	
	private int stack[];
	private int top;
	
	FixedStack(int size) {
		stack = new int[size];
		top = -1;
	}
	
	public void push(int item) {
		if (top == stack.length - 1)
			System.out.println("Stack is full.");
		else
			stack[++top] = item;
	}
	
	public int pop() {
		if (top < 0) {
			System.out.println("Stack Underflow.");
			return 0;
		}
		else
			return stack[top--];
	}
}
