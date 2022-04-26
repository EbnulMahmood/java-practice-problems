
public class Stack {
	
	private int stack[] = new int[10];
	private int top;
	
	Stack() {
		
		top = -1;
	}
	
	void push(int item) {
		if (top == 9)
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
