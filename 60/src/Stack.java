
public class Stack {
	int stack[] = new int[100];
	int top;
	
	Stack() {
		top = -1;
	}
	
	void push(int item) {
		if (top == 99)
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
