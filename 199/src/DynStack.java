
public class DynStack implements IntStack {
	
	private int stack[];
	private int top;
	
	public DynStack(int size) {
		stack = new int[size];
		top = -1;
	}
	
	public void push(int item) {
		if (top == stack.length - 1) {
			int temp[] = new int[stack.length * 2];
			for (int i = 0; i < stack.length; i++)
				temp[i] = stack[i];
			stack = temp;
			stack[++top] = item;
		}
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
