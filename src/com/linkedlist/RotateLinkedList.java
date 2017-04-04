package com.linkedlist;


public class RotateLinkedList {

	
	/*Given linked list
	10  20  30  40  50  60
	Rotated Linked list
	50  60  10  20  30  40
	*/
	
	
	 static Node head;
	 
		static class Node{
			
			int data;
			Node next;
			Node(int d){
				data = d;
				next = null;
			}
		}

		public void printList(Node head12) {
			// TODO Auto-generated method stub
			 while (head12 != null) {
		            System.out.print(head12.data + " ");
		            head12 = head12.next;
		        }
		        System.out.println("");	
		}
		
	public static void main(String[] arg){
		RotateLinkedList rotateList = new RotateLinkedList();
		
		rotateList.head = new Node(10);
		rotateList.head.next = new Node(20);
		rotateList.head.next.next = new Node(30);
		rotateList.head.next.next.next = new Node(40);
		rotateList.head.next.next.next.next = new Node(50);
		rotateList.head.next.next.next.next.next = new Node(60);
		rotateList.printList(head);
		
		
		rotateList.rotate( 4);
		rotateList.printList(head);
		
	}

	 void rotate(int k)
	    {
	        if (k == 0) return;
	 
	        // Let us understand the below code for example k = 4
	        // and list = 10->20->30->40->50->60.
	        Node current  = head;
	 
	        // current will either point to kth or NULL after this
	        // loop. current will point to node 40 in the above example
	        int count = 1;
	        while (count < k && current !=  null)
	        {
	            current = current.next;
	            count++;
	        }
	 
	        // If current is NULL, k is greater than or equal to count
	        // of nodes in linked list. Don't change the list in this case
	        if (current == null)
	            return;
	 
	        // current points to kth node. Store it in a variable.
	        // kthNode points to node 40 in the above example
	        Node kthNode = current;
	 
	        // current will point to last node after this loop
	        // current will point to node 60 in the above example
	        while (current.next != null)
	            current = current.next;
	 
	        // Change next of last node to previous head
	        // Next of 60 is now changed to node 10
	 
	        current.next = head;
	 
	        // Change head to (k+1)th node
	        // head is now changed to node 50
	        head = kthNode.next;
	 
	        // change next of kth node to null
	        kthNode.next = null;
	 
	    }
	

	private int getSize(Node head22) {
		// TODO Auto-generated method stub
		int size  =0;
		while(head22!=null){
			head22 = head22.next;
			size++;
		}
		return size;
	}

	
}
