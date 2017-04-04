package com.linkedlist;


public class AddTwoLinkedListInReverseOrder {

	 static Node head1, head2;
	 
	static class Node{
		
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
		 
		 
		public static void main(String[] arg){
			AddTwoLinkedListInReverseOrder listReverse = new AddTwoLinkedListInReverseOrder();
			 
	        // creating first list
			listReverse.head1 = new Node(9);
			listReverse.head1.next = new Node(9);
			listReverse.head1.next.next = new Node(9);
			listReverse.head1.next.next.next = new Node(9);
	        
	        System.out.print("First List is ");
	        listReverse.printList(head1);
	 
	        // creating seconnd list
	        listReverse.head2 = new Node(1);
	        listReverse.head2.next = new Node(8);
	        System.out.print("Second List is ");
	        listReverse.printList(head2);
	        
	        
	        Node re = listReverse.addList(head1, head2);
	        listReverse.printList(re);
	        
		}
		
	


	int carry=0;
	Node result = null;

	private Node addList(Node head12, Node head22) {
			// TODO Auto-generated method stub
		
			
			Node cur = null;
			
			
			int firstsize = getSize(head12);
			int secondsize = getSize(head22);
		
			
			if(firstsize==secondsize){
				result = addSameSizeList(head12, head22);
			}else{
				
				int diff = Math.abs(firstsize-secondsize);
				if(firstsize<secondsize){
					swapNodes(head12, head22);
				}
				
				
				cur = head12;
				for(int i= diff; i>0; i--){
					cur = cur.next;
				}
				
				result = addSameSizeList(cur, head22);
				
				addCarrytoRemaining(head1, cur, carry);
				
			}
			
			if (carry>0) {
				Node temp = new Node(carry);
				temp.next = result;
				result = temp;
			}
			
			return result;
			
		}






	private void addCarrytoRemaining(Node head12, Node cur, int carry) {
		// TODO Auto-generated method stub
		int sum;
		if(head12!=cur){
			
			addCarrytoRemaining(head12.next, cur, carry);
			
			sum = carry+head12.data;
			
			carry = sum/10;
			sum = sum%10;
			
			Node temp = new Node(sum);
			temp.next = result;
			
			result = temp;
			
			
		}
	}






	private void swapNodes(Node head12, Node head22) {
		// TODO Auto-generated method stub
		Node temp  = head12;
		head12 = head22;
		head22 = temp;
	}






	private Node addSameSizeList(Node head12, Node head22) {
		// TODO Auto-generated method stub
		
		if(head12==null)
			return null;
		int sum;
		Node result = new Node(0);		
		Node temp ;
		
			result.next = addSameSizeList(head12.next, head22.next);
		
			sum = carry+head12.data+head22.data;
			carry = sum/10;
			sum = sum%10;
			
			
				
			
			result.data = sum;
			
		
		
		return result;
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






	public void printList(Node head12) {
		// TODO Auto-generated method stub
		 while (head12 != null) {
	            System.out.print(head12.data + " ");
	            head12 = head12.next;
	        }
	        System.out.println("");	
	}

	
}
