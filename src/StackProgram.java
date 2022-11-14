
public class StackProgram {
	int arr[];
	int top;
	int capacity;
	StackProgram(int size){
		arr = new int[size];
		capacity = size;
		top = -1;
	}
	public void push(int num) {
		if(isFull()) {
			System.out.println("Overflow the Stack/Stack is full");
			System.exit(1);
		}
		System.out.println("Inserting"+" "+ num);
		arr[++top] = num;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			System.exit(1);
		}
		return arr[top--];
	}
	
	public int size() {
		return top +1;
	}
	
	private boolean isEmpty() {
		
		return top == -1;
	}
	
	private boolean isFull() {
		
		return top == capacity -1;
	}
	public void printStack() {
		for(int i = 0; i <= top; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		StackProgram obj= new StackProgram(5);
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		
		obj.pop();
		System.out.println("After Pooping out");
		
		obj.printStack();
	}
}
