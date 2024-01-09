package intermediate_23_LinkedList;


import intermediate_23_LinkedList.Node;

public class _2_GetSizeOfLinkedList {

	public static void main(String[] args) {
		
		//Creating the head
		//Adding 2 elements 
		//Add a tail
		//Print the size
		
		Node head1 = new Node(30);
		//printANodeOfLinkedList(head1);
		
		
		Node secondElem = new Node(40);
		head1.next=secondElem;
		
		Node thirdElem = new Node(50);
		secondElem.next=thirdElem;
		
		Node fourthElem = new Node(60);
		thirdElem.next=fourthElem;
		
		fourthElem.next=null;
		
		System.out.println("Size of ll:"+getSizeOfLL(head1));
		
		//get the 3rd element from ll
		
		System.out.println("3rd elem of ll:" + getKthElemOfLL(head1, 3) );
		
		System.out.println("Search for 50 in ll:" + searchInLL(head1, 40) );
		
		System.out.println("Search for 100 in ll:" + searchInLL(head1, 100) );
		
	
		
		

	}// main method
	
	
	public static void printANodeOfLinkedList(Node n) {
		System.out.println("This is the Node itself: "+n);
		System.out.println("This is node data:"+n.data);
		System.out.println("This is node next:"+n.next);
	}
	
	
	//Given the head of ll, get the size
	public static int getSizeOfLL(Node h) {
		int size=0;
		
		if(h==null) {
			return 0;
		}
		Node temp = h;
		
		while(temp!=null) {
			size++;
			temp=temp.next;
		}
		return size;
	}
	
	//Given the head node, get the kth element of linked list
	public static int getKthElemOfLL(Node h, int k) {
		int kThData=0;
		
		Node temp=h;
		
		for(int i=1;i<k;i++) {
			temp=temp.next;
		}
		kThData= temp.data;
		System.out.println("kth data in the final is:" + kThData);
		return kThData;
	}
	
	//Search for element v in ll
	public static boolean searchInLL(Node head, int v) {
		boolean isDataPresent=false;
		
		Node temp = head;
		while(temp!=null) {
			if(temp.data==v) {
				isDataPresent=true;
				break;
			}
			temp=temp.next;
		}
		return isDataPresent;
	}
	
	//Insert a new element and return head
	public static Node insertInLL(Node head, int B, int atIndex) {
		Node temp=head;
		//int index=0;
		
		Node n=new Node(B);
		
		/*
		while(temp != null && index < atIndex-1) {
			temp=temp.next;
			index++;
		}
		*/
		
		//if temp itself is null
		if(atIndex==0) {
			n.next=head.next;
			head=n;
			return head;
		}
		
		
		for(int i=1;i<atIndex-1;i++) {
			//to handle the edge case
			if(temp.next==null) {
				break;
			}
			
			temp=temp.next;
		}//fend
		
		n.next=temp.next;
		temp.next=n;
		
		return head;
	}//end of insert method
	

	/*
	 * //Insert a new element and return head public Node deleteANodeInLL(Node head,
	 * int atIndex) { Node temp=head;
	 * 
	 * 
	 * if(atIndex==0) { n.next=head.next; head=n; return head; }
	 * 
	 * 
	 * for(int i=1;i<atIndex-1;i++) { //to handle the edge case if(temp.next==null)
	 * { break; }
	 * 
	 * temp=temp.next; }//fend
	 * 
	 * temp.next; temp.next=n;
	 * 
	 * return head; }//end of delete method
	 * 
	 */
	
	
	
}//end of class





