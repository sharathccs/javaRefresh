/*
 * Creating a simple linked list with 2 nodes and 
 * 
 * 
 * /
 */


package intermediate_23_LinkedList;

public class _1_CreateALinkedList {

	public static void main(String[] args) {
		Node h = new Node(30);
		System.out.println("Head:"+h);
		System.out.println("Head.data:"+h.data);
		System.out.println("Head.next:"+h.next);
		
		Node tail = h;
		tail.next = new Node(40);
		
		System.out.println("Tail:"+tail);
		System.out.println("Tail.data:"+tail.data);
		System.out.println("Tail.next:"+tail.next);
		

	}

}

 class Node {
	
	int data;
	Node next;
	
	Node(int x){
		data=x;
		next=null;
	}
}
