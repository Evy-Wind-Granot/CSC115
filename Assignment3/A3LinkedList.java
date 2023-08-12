// Name:Evy Wind-Granpt
// Student number: v01013467

public class A3LinkedList implements A3List {
	private A3Node head;
	private A3Node tail;
	private int length;
	
	public A3LinkedList() {
		head = null;
		tail = null;
		length = 0;
	}
	
	public void addFront(String s) {
		// TODO: implement this
		A3Node n = new A3Node(s);
		if(head == null){
			tail = n;
		}else{
			head.prev = n;
			n.next = head;
		}
		head = n;
		length++;
	}

	public void addBack(String s) {
		// TODO: implement this
		A3Node n = new A3Node(s);
		if(tail == null){
			head = n;
		}else{
			tail.next = n;
			n.prev = tail;
		}
		tail = n;
		length++;
	}
	
	public int size() {
		int count = 0;
		A3Node cur = head;

		while(cur != null){
			cur = cur.next;
			count++;
		}
		length = count;
		return length;
	}
	
	public boolean isEmpty() {
		return length==0 && head == null;
	}
	
	public void removeFront() {
		// TODO: implement this
		if(size() <= 1){
			head = null;
			tail = null;
		}else{
			head = head.next;
			head.prev = null;
		}
		length--;
	}
	
	public void removeBack() {
		// TODO: implement this
		if(size() <= 1){
			head = null;
			tail = null;
		}else{
			tail = tail.prev;
			tail.next = null;
		}
		length--;
	}
		
	//////////////////
	/* PART 2 BELOW */
	//////////////////
	public void swapEnds() {
		// TODO: implement this
		if(isEmpty() || head == tail){
			return;
		}else if(size() == 2){
			head.prev = tail;
			tail.next = head;
			head.next = null;
			tail.prev = null;
			A3Node temph = head;
	 		A3Node tempt = tail;
	 		tail = temph;
	 		head = tempt;
		}else{
			tail.next = head.next;
			head.prev = tail.prev;
			head.next.prev = tail;
			tail.prev.next = head;
			tail.prev = null;
			head.next = null;
			
			A3Node temph = head;
			A3Node tempt = tail;

			tail = temph;
			head = tempt;
		}
	}
		
	public void removeAll(String toRemove) {
		// TODO: implement this
		A3Node cur = head;
		while(cur != null){
			if (cur.getData().equals(toRemove)){
				if(size() == 1){
					head = null;
					tail = null;
				}
				else if(cur == head){
					head = cur.next;
					if(head != null){
						head.prev = null;
					}
				}else if(cur == tail){
					tail = cur.prev;
					tail.next = null;
				}else{
					cur.next.prev = cur.prev;
					cur.prev.next = cur.next;
				}
			}
			length--;
			cur = cur.next;
		}
	}
		
	////////////////////////////////////////
	/* METHODS BELOW TO HELP WITH TESTING */
	////////////////////////////////////////
	
	/*
	 * Purpose: return a string representation of the list 
	 *          when traversed from front to back
	 * Parameters: none
	 * Returns: nothing
	 *
	 * USED TO HELP YOU WITH DEBUGGING
	 * DO NOT CHANGE THIS METHOD
	 */
	public String frontToBack() {
		String result = "{";
		A3Node cur = head;
		while (cur != null) {
			result += cur.getData();
			cur = cur.next;
		}
		result += "}";
		return result;
	}
	
	/*
	 * Purpose: return a string representation of the list 
	 *          when traversed from back to front
	 * Parameters: none
	 * Returns: nothing
	 *
	 * USED TO HELP YOU WITH DEBUGGING
	 * DO NOT CHANGE THIS METHOD
	 */
	public String backToFront() {
		String result = "{";
		A3Node cur = tail;
		while (cur != null) {
			result += cur.getData();
			cur = cur.prev;
		}
		result += "}";
		return result;
	}
}
	