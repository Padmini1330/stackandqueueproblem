package com.bridgelabz.stackandqueueproblem;


public class StackMain 
{

	public static void main(String[] args) 
	{
		Node<Integer> myfirstNode = new Node<>(70);
		Node<Integer> mysecondNode = new Node<>(30);
		Node<Integer> mythirdNode = new Node<>(56);
		Stack<Integer> myStack = new Stack<Integer>();
		
		myStack.push(myfirstNode);
		myStack.push(mysecondNode);
		myStack.push(mythirdNode);
		myStack.printMyNodes();
	}

}