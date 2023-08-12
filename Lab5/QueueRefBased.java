public class QueueRefBased implements Queue {

	private QueueNode front;
	private QueueNode back;
	// no numElements for this implementation

	public QueueRefBased() {
		front = null;
		back = null;
	}

	public int size() {
		int count = 0;
		QueueNode cur = front;
		while(cur != null){
			count++;
			cur = cur.next;
		}		
		return count;			
	}

	public boolean isEmpty() {
		return front == null;
	}

	public void enqueue (int value) {
		QueueNode n = new QueueNode(value);
		if(back == null){
			back = n;
			front = n;
		}else{
			back.next = n;
			back = n;
		}
		
	}

	public int dequeue() {
		int temp = 0;
		if(size() == 1){
			temp = front.getValue();
			front = null;
			back = null;
		}else{
			temp = front.getValue();
			front = front.next;
		}

		
		
		return temp; // so it compiles
	}

	public int peek()  {
		
		return front.getValue(); // so it compiles
	}

	public void makeEmpty() {
		

		front = null;
		back = null;
	}
}
