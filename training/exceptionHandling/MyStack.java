package com.psl.training.exceptionHandling;

public class MyStack {
	   private int maxSize;
	   private Contact[] stackArray;
	   private static int top = -1;
	   
	   public MyStack(int s) {
	      this.maxSize = s;
	      stackArray = new Contact[maxSize];
	   }
	   public void push(Contact c) throws Exception {
		   if(top>=maxSize)
			   throw new Exception("Stack size is full");
		   stackArray[++top] = c;
	   }
	   public Contact pop() throws Exception{
		   if(top == -1 || stackArray == null)
			   throw new Exception("Stack size is empty or uninitialized");
	      return stackArray[top--];
	   }
	   
	   public void printStack() {
		   if(stackArray!=null && top>=0) {
			   for(int i =0;i<=top;i++) {
				   System.out.println("First Name:"+stackArray[i].getFirst_name());
			   }
		   }
		   else if(top == -1)
			   System.out.println("Empty Stack, Nothing to print");
	   }
	   
	   
	/*// store elements of stack
	   private int arr[];
	   // represent top of stack
	   private int top;
	   // total capacity of the stack
	   private int capacity;

	   // Creating a stack
	   Stack(int size) {
	     // initialize the array
	     // initialize the stack variables
	     arr = new int[size];
	     capacity = size;
	     top = -1;
	   }

	   // push elements to the top of stack
	   public void push(int x) {
	     if (isFull()) {
	       System.out.println("Stack OverFlow");

	       // terminates the program
	       System.exit(1);
	     }

	     // insert element on top of stack
	     System.out.println("Inserting " + x);
	     arr[++top] = x;
	   }

	   // pop elements from top of stack
	   public int pop() {

	     // if stack is empty
	     // no element to pop
	     if (isEmpty()) {
	       System.out.println("STACK EMPTY");
	       // terminates the program
	       System.exit(1);
	     }

	     // pop element from top of stack
	     return arr[top--];
	   }

	   // return size of the stack
	   public int getSize() {
	     return top + 1;
	   }

	   // check if the stack is empty
	   public Boolean isEmpty() {
	     return top == -1;
	   }

	   // check if the stack is full
	   public Boolean isFull() {
	     return top == capacity - 1;
	   }*/
}	   

