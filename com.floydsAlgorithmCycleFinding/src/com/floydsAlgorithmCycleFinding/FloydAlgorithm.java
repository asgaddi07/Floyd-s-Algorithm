package com.floydsAlgorithmCycleFinding;
//
//class LinkedList{
//	
//}

public class FloydAlgorithm {
	
	  class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	static Node head=null;
	
	void insertLinkedList(int data) {
		Node newNode=new Node(data);
		if(head==null)head=newNode;
		else {
			Node current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newNode;
		}
	}
	
//	void madeCycle() {
//		Node temp = head;
//	    while (temp.next != null)
//	      temp = temp.next; 
//	    temp.next = head;
//	    }
	
	//Floyd's Cycle Finding Algorithm.
	void findCycle() { 
		Node p1,p2;
		p1=head;
		p2=head;
		if(head==null)System.out.println(0);
		while(p1!=null && p2!=null && p2.next!=null) {
			 p1=p1.next;
			 p2=p2.next.next;
			 if(p1==p2) {
				 p1=head;
				 while(p1!=p2) {
					 p1=p1.next;
					 p2=p2.next;
				 }
				 System.out.println(p1.data);
			 }
		}
		 System.out.println(0);
	}
	
	void print() {
		if(head==null)System.out.println("Empty");
		else {
			Node current=head;
			while(current!=null) {
				System.out.println(current.data);
				current=current.next;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FloydAlgorithm ll=new FloydAlgorithm();
		ll.insertLinkedList(1);
		ll.insertLinkedList(2);
		ll.insertLinkedList(3);
		ll.insertLinkedList(4);
		ll.insertLinkedList(5);   
		
//		Node temp = head;
//	    while (temp.next != null)
//	      temp = temp.next; 
//	    temp.next = head;
		 
		
		ll.print();
//		ll.madeCycle();
		ll.findCycle(); 
	}

}
