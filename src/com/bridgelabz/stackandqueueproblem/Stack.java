package com.bridgelabz.stackandqueueproblem;

public class Stack<K> 
{
	private K key;
	private INode head;
	private INode tail;

	public Stack() 
	{
		this.head = null;
		this.tail = null;
	}
	public void push(INode newNode) 
	{
		if (tail == null)
			this.tail = newNode;
		if (head == null)
			this.head = newNode;
		else
			newNode.setNext(head);
		head = newNode;
	}
	
	public void printMyNodes() 
	{
		INode tempNode = head;
		while (tempNode != null) 
		{
			System.out.print(tempNode.getKey() + "->");
			tempNode = tempNode.getNext();
		}
		System.out.print("null");
	}
}