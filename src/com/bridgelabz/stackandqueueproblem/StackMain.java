package com.bridgelabz.stackandqueueproblem;


public class StackMain 
{

	public static void main(String[] args) 
	{
		Node<Integer> myfirstNode = new Node<>(70);
		Node<Integer> mysecondNode = new Node<>(30);
		Node<Integer> mythirdNode = new Node<>(56);
		
		
		Stack<Integer> myStack = new Stack<Integer>();
		Queue<Integer> myQueue = new Queue<Integer>();
		myQueue.enQueue(myfirstNode);
		myQueue.enQueue(mysecondNode);
		myQueue.enQueue(mythirdNode);
		myQueue.printMyNodes();
		myQueue.dequeue();
		myQueue.dequeue();
		
	}

	
	
	

}