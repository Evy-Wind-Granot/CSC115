public class ShapeList{
    
	private static final int DEFAULT_SIZE = 2;

	private Shape[] elements;
	private int count;

	public ShapeList() {
		elements = new Shape[DEFAULT_SIZE];
		count = 0;
	}

	/*
	 * Purpose: returns the number of elements in list
	 * Parameters: none
	 * Returns: int - the number of elements
	 */
	public int size() {
		// TODO
		int count = 0;

		for(Shape element: elements){
			if(element != null){
				count++;
			}
		}
		return count;
	}

	/*
	 * Purpose: adds Shape s to back of this list
	 * Parameters: Shape - s
	 * Returns: nothing
	 *
	 * IMPLEMENTATION NOTE: if elements is full, a new
	 * array should be created to hold all of the original
	 * elements and also shape s.
	 */
	public void add(Shape s) {
		// TODO
		if(this.size() == elements.length){
			Shape[] sha = new Shape[this.size() +1 ];
			for(int i = 0; i < elements.length; i++){
				sha[i] = elements[i];
			}
			sha[elements.length] = s;
			elements = sha;
		}
		else{
			for(int i = 0; i < elements.length; i++){
				if(elements[i] == null){
					elements[i] = s;
					return;
				}
			}
		}
	}

	/*
	 * Purpose: returns a String reprensentation of the elements
	 *      in this list separated by newlines
	 * Parameters: none
	 * Returns: String - the representation
	 */
	public String toString() {
		String string = "";

        for (int i = 0; i < this.size(); i++) {
            //if (elements[i] != null) {
                string += elements[i] + "\n";
            //}
        }
        return string.toString();
	}

	/*
	 * Purpose: removes the first element in this list
	 * Parameters: none
	 * Returns: nothing
	 *
	 * IMPLEMENTATION NOTE: After removing the first element,
	 * all other elements should be shuffled forward 
	 * so that there are no gaps in the array.
	 */
	public void removeFront() {
		// You are not required to implement this method for lab 2
		// It is here as an additional exercise for those of you
		// who would like a little more practice working with 
		// arrays of objects in Java.
		if(elements.length == 0){
			return;
		}
		Shape[] s = new Shape[this.size()-1];
		for(int i = 0; i < s.length; i++){
			s[i] = elements[i+1];
		}
		elements = s;
	}    
}
