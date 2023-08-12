/*
* HeapPriorityQueue.java
*
* An implementation of a minimum PriorityQueue using a heap.
* based on the implementation in "Data Structures and Algorithms
* in Java", by Goodrich and Tamassia
*
* This implementation will throw a Runtime, HeapEmptyException
*	if the heap is empty and removeMin is called.
*
* This implementation will throw a Runtime, HeapFullException
*	if the heap is full and insert is called.
*
*/
public class HeapPriorityQueue<T extends Comparable<T>> implements PriorityQueue<T> {

	protected final static int DEFAULT_SIZE = 10000;
	
	protected T[] storage;
	protected int currentSize;
	
	// Feel free to change rootIndex to 0 if you want to 
	// use 0-based indexing (either option is fine)
	private static final int rootIndex = 1;

	/*
	 * Constructor that initializes the array to hold DEFAULT_SIZE elements
	 */
	@SuppressWarnings({"unchecked"})
	public HeapPriorityQueue(Class<T> dataType) {
		// Creating generics arrays in Java is not very clean. The following 
		// two lines allocate the generic array for you based on whether you
		// have selected to store the root at index 0 or 1 above.
		if (rootIndex == 0) {
			storage = (T[]) java.lang.reflect.Array.newInstance(dataType, DEFAULT_SIZE);
		} else {
			storage = (T[]) java.lang.reflect.Array.newInstance(dataType, DEFAULT_SIZE+1);
		}
		currentSize = 0;
	}
	
	/*
	 * Constructor that initializes the array to hold size elements
	 */
	@SuppressWarnings({"unchecked"})
	public HeapPriorityQueue(Class<T> clazz, int size) {
		// Creating generics arrays in Java is not very clean. The following 
		// two lines allocate the generic array for you based on whether you
		// have selected to store the root at index 0 or 1 above.
		if (rootIndex == 0) {
			storage = (T[]) java.lang.reflect.Array.newInstance(clazz, size);
		} else {
			storage = (T[]) java.lang.reflect.Array.newInstance(clazz, size+1);
		}
		currentSize = 0;
	}

	public void insert (T element) throws HeapFullException {
		// TODO: implement this
		//System.out.println(storage.length);
		// When inserting the first element, choose whether to use 
		// a 0-based on 1-based implementation. (By default, the root
		// index is set to 1 for you above. Whatever you choose,
		// make sure your implementation for the rest of the program
		// is consistent with this choice.
		if (isFull()) {
            throw new HeapFullException();
        }
        currentSize++;
        storage[currentSize] = element;
        bubbleUp(currentSize);
    }
	
	private void bubbleUp(int index) {
		// TODO: implement this\
		if (index <= rootIndex) {
            return;
        }
        int parent = index / 2;
        if (storage[index].compareTo(storage[parent]) < 0) {
            swap(index, parent);
            bubbleUp(parent);
        }
	}
			
	public T removeMin() throws HeapEmptyException {
		// TODO: implement this
		if (isEmpty()) {
            throw new HeapEmptyException();
        }
        T min = storage[rootIndex];
        storage[rootIndex] = storage[currentSize];
		storage[currentSize] = null;
        currentSize--;
        bubbleDown(rootIndex);
        return min;
	
	}
	
	private void bubbleDown(int index) {
		// TODO: implement this
		int smallest = index;
        int left = index*2;
        int right = (index*2) + 1;

        if (left <= currentSize && storage[left].compareTo(storage[smallest]) < 0) {
            smallest = left;
        }
        if (right <= currentSize && storage[right].compareTo(storage[smallest]) < 0) {
            smallest = right;
        }
        if (smallest != index) {
            swap(index, smallest);
            bubbleDown(smallest);
        }
	}
	private void swap(int i, int j) {
        T temp = storage[i];
        storage[i] = storage[j];
        storage[j] = temp;
    }

	public boolean isEmpty(){
		// TODO: implement this
		return currentSize == 0; // so it compiles
	}
	
	public boolean isFull() {
		// TODO: implement this
		
		return currentSize == storage.length - 1; // so it compiles
	}
	
	public int size () {
		// TODO: implement this
		return currentSize; // so it compiles
	}
	
	// FOR DEBUGGING:
	public String toString() {
		String s = "";
		String sep = "";
		if (rootIndex == 0) {
			for (int i = 0; i < currentSize; i++) {
				s += sep + storage[i];
				sep = " ";				
			}
		} else if (rootIndex == 1) {
			for(int i=1; i<=currentSize; i++) {
				s += sep + storage[i];
				sep = " ";
			}
		}
		return s;
	}
}
