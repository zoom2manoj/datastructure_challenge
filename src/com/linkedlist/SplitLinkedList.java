package com.linkedlist;


public class SplitLinkedList {

	
    static Node head, head1, head2;
	 
		static class Node{
			
			int data;
			Node next;
			Node(int d){
				data = d;
				next = null;
			}
		}

		public void printList(Node node) {
			// TODO Auto-generated method stub
			 Node temp = node;
		        if (node != null) {
		            do {
		                System.out.print(temp.data + " ");
		                temp = temp.next;
		            } while (temp != node);
		        }
		        
		        System.out.println("");
		}
		
		
		public static void main(String[] arg){
			SplitLinkedList splitList = new SplitLinkedList();
			
			splitList.head = new Node(12);
			splitList.head.next = new Node(56);
			splitList.head.next.next = new Node(2);
			splitList.head.next.next.next = new Node(11);
			splitList.head.next.next.next.next = splitList.head;
			splitList.printList(head);
			
			
			splitList.splitList();
			splitList.printList(head1);
			splitList.printList(head2);
			
		}


		private void splitList() {
			// TODO Auto-generated method stub
			 Node slow_ptr = head;
		        Node fast_ptr = head;
		        
		        
		        if (head == null) {
		            return;
		        }
		        
		        
		        /* If there are odd nodes in the circular list then
		         fast_ptr->next becomes head and for even nodes 
		         fast_ptr->next->next becomes head */
		        while (fast_ptr.next != head  && fast_ptr.next.next != head) {
		            fast_ptr = fast_ptr.next.next;
		            slow_ptr = slow_ptr.next;
		        }
		        
		        
		        /* If there are even elements in list then move fast_ptr */
		        if (fast_ptr.next.next == head) {
		            fast_ptr = fast_ptr.next;
		        }
		        
		        /* Set the head pointer of first half */
		        head1 = head;
		        
		        /* Set the head pointer of second half */
		        if (head.next != head) {
		            head2 = slow_ptr.next;
		        }
		        
		        /* Make second half circular */
		        fast_ptr.next = slow_ptr.next;
		        
		        /* Make first half circular */
		        slow_ptr.next = head;
		 
		}
	
}

