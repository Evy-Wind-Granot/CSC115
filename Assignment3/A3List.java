public interface A3List {

	/* 
	 * Purpose: add s to the front of the list
	 * Parameters: String s - the string to add
	 * Returns: nothing
	 * Precondition: s is not null
	 */
	public void addFront(String s);

	/* 
	 * Purpose: add s to the back of the list
	 * Parameters: String s - the string to add
	 * Returns: nothing
	 * Precondition: s is not null
	 */
	public void addBack(String s);
	
	/* 
	 * Purpose: get the current size of the list
	 * Parameters: none
	 * Returns: int - number of elements in list
	 */
	public int size(); 
	
	/* 
	 * Purpose: determines if the list is empty
	 * Parameters: none
	 * Returns: boolean - true if empty, false otherwise
	 */
	public boolean isEmpty();
	
	/* 
	 * Purpose: removes the element from the front of the list
	 * Parameters: none
	 * Returns: nothing
	 */
	public void removeFront();
	
	/* 
	 * Purpose: removes the element from the back of the list
	 * Parameters: none
	 * Returns: nothing
	 */
	public void removeBack();
	
		/*
	 * Purpose: swap the front and back elements of this list
	 * Parameters: none
	 * Returns: void - nothing
	 */
	public void swapEnds();
	
	/*
	 * Purpose: remove all occurrences of x from this list
	 * Parameters: String x - the value to remove
	 * Returns: void - nothing
	 * Note: ALL occurrences of x are removed
	 */
	public void removeAll(String x);
}