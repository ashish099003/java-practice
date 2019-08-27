package PracticeJava;

public  class Llist {
	
	Node head;
	
	static class Node{
		
		int data;
		Node next;
		Node(int d){data=d;next = null;}
	
	}
	public  void push(int new_data) {
		
		Node temp = new Node(new_data);
		temp.next = head;
		head = temp;
	
	}
	
	public void insertAfter(int new_Data, Node prev_node) {
		
		if(prev_node==null) {
			System.out.println("prev_node cannot be null");
		}
		Node temp = new Node(new_Data);
		temp.next= prev_node.next;
		prev_node.next = temp;	
	}
	
	public void append(int new_Data) {
		// push at the end of list
		Node new_Node = new Node(new_Data);
		if(head==null) {
			head = new Node(new_Data);
			return;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		
		temp.next= new_Node;
	}
	public void printList() 
	    { 
	        Node tnode = head; 
	        while (tnode != null) 
	        { 
	            System.out.print(tnode.data+" "); 
	            tnode = tnode.next; 
	        } 
	        System.out.println("\n");
	    }
	void deleteKey(int key) {
		Node temp = head, prev=null;
		if(temp.next!=null && temp.data==key) {
			head= temp.next;
		}
		while(temp!=null && temp.data!=key) {
			prev = temp;
			temp = temp.next;
		}
		
		if(temp==null) return;
		
		prev.next= temp.next;		
		
	}
	
	void deletePosition(int pos) {
		if(head==null)
			return;
		Node temp =head;
		if(pos==0)
			head= temp.next;
		for(int i=0;temp!=null && i<=pos-1;i++)
			temp = temp.next;
		if(temp==null || temp.next==null)
			return;
		
		Node next = temp.next.next;
		temp.next = next;
		
		
	}
	
	int llistLengthIteration() {
		Node temp = head;
		int count =0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	int llistLenghthRecursive(Node temp) {		
		if(temp==null) {			
			return  0; 
		}
		return 1 + llistLenghthRecursive(temp.next);	
	}
	
	void SearchIterative(int key) {
		Node temp = head;
		
		while(temp!=null) {
			if(temp.data==key) {
				System.out.println("Succesfull");
				return;
			}
			temp = temp.next;
		}
	}
	boolean SearchRecursive(Node temp, int key) {
		
		if(temp==null) {
			System.out.println("Not found");
			return false;
		}
		
		if(temp.data==key)		
			return true;
		 return SearchRecursive(temp.next, key);
			
			
	}
	int getElement(int position) {
		Node temp = head;
		for(int i=0; i < position; i++){
			temp= temp.next;
		}
		return temp.data;
	}
	
	int getElementFromLast(Node temp, int position) {
		int count =0;
		if(temp==null)
			return count;
		
		if(count ==position) {
			return temp.data;
		}
		
		count = 1+ getElementFromLast(temp.next,position);
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Llist listt = new Llist();
		listt.push(10);
		listt.push(20);
		listt.push(30);
		listt.push(40);
		listt.push(50);
		listt.append(100);
		listt.printList();
		listt.insertAfter(200, listt.head.next.next);
		listt.printList();
	}

}
