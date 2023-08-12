public interface List {

	/* 
	 * Purpose: add p to the back of the list
	 * Parameters: Person p - the person to add
	 * Returns: nothing
	 * Precondition: p is not null
	 */
	public void add(Person p);
		
	/* 
	 * Purpose: get the current size of the list
	 * Parameters: none
	 * Returns: int - number of elements in list
	 */
	public int size(); 
			
	/* 
	 * Purpose: gets the person at the given index in the list
	 * Parameters: int index - the index of the person to access
	 * Returns: Person - the person at the given index
	 * Precondition: 0 <= index < size()
	 */
	public Person get(int index);
	
	/*
	 * Purpose: get the index of p in this list
	 * Parameters: Person p - the person to find
	 * Returns: int - index of p, or -1 if p is not in this list
	 */
	public int find(Person p);
	
}