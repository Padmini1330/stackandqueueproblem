package com.bridgelabz.stackandqueueproblem;

public class Queue<K> 
{
	private K key;
	private INode head;
	private INode tail;

	public Queue() 
	{
		this.head = null;
		this.tail = null;
	}

	public void enQueue(INode newNode) 
	{

		if (tail == null)
			this.tail = newNode;
		if (head == null)
			this.head = newNode;
		else
			tail.setNext(newNode);
		tail = newNode;

	}
	
	public void dequeue() 
	{
		INode previousNode = null, currentNode = head;
		while (currentNode.getNext() != null) 
		{
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		previousNode.setNext(null);
		tail = previousNode;
		System.out.println("deleted " + currentNode.getKey());
		currentNode = null;
	}


	public void printMyNodes() 
	{
		INode tempNode = head;
		while (tempNode != null) 
		{
			System.out.print(tempNode.getKey() + "->");
			tempNode = tempNode.getNext();
		}
	}
}
