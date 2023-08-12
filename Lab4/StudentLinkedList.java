public class StudentLinkedList implements StudentList {

	StudentNode head;
	int count;

	public StudentLinkedList() {
		head = null;
		count = 0;
	}

	public void add(Student s) {
		// TODO: complete
		StudentNode n = new StudentNode(s);
		if(size() == 0){
			head = n;
		}else{
			StudentNode cur = head;
			while(cur.next != null){
				cur = cur.next;
			}
			cur.next = n;
		}
	}

	public int size() {
		// TODO: complete
		StudentNode cur = head;
		int counter= 0;
		while(cur != null){
			cur = cur.next;
			counter++;
		}
		count = counter;
		return count;
	}

	public void removeFront() {
		// TODO: complete
		if(size() == 0){
			return;
		}else if(size() == 1){
			head = null;
		}else{
			StudentNode temp = head.next;
			head.next = null;
			head = temp;
		}
	}

	public boolean contains(Student s) {
		// TODO: complete
		if(size() == 0){
			return false;
		}else{
			StudentNode cur = head;
			int i = 0;
			while(cur != null &&  i == 0){
				if(cur.getData().equals(s)){
					i = 1;
				}
				cur = cur.next;
			}
			return i == 1;
		}
	}
	
	/*
	 * Purpose: returns a String reprensentation of elements
	 *      in this list separated by newlines
	 * Parameters: none
	 * Returns: String - the representation
	 */
	public String toString() {
		// DO NOT CHANGE THIS METHOD - it is correct
		// Changing it will result in your code getting
		// a score of 0 from the autograder for this lab
		
		String s = "";
		StudentNode tmp = head;

		while(tmp != null) {
			s  += tmp.getData() + "\n";
			tmp = tmp.next;
		}

		return s;
	}
}
