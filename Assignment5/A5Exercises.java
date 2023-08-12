public class A5Exercises {

	// PART 1

	/*
	 * Purpose: get a count of the number of odd values in the array
	 * Parameters: int[] arr
	 * Returns: int - the number of odd-valued elements
	 * Post-condition - the array contents are unchanged
	 */
	public static int countOdd(int[] arr) {
		// TODO: implement this
		return countOddRecursive(arr, 0, 0); // so it compiles
	}
	private static int countOddRecursive(int[] arr, int i, int count){
		if(i >= arr.length){
			return count;
		} 
		if( arr[i] % 2 != 0){
			return countOddRecursive(arr, i+1, count+1);
		}
		return countOddRecursive(arr, i+1, count);
	}
	

	/*
	 * Purpose: add x to all values in the given array
	 * Parameters: int[] array - the array to modify
	 *             int x - the value to add to all elements
	 * Returns: void - nothing
	 */
	public static void addXToAll(int[] array, int x) {
		// TODO: implement this
		addXToAllRecursive(array, x, 0);
	}
	private static void addXToAllRecursive(int[] array, int x, int i){
		if(i >= array.length){
			return;
		}
		array[i] += x;
		addXToAllRecursive(array, x, i+1);
	}
	
	/*
	 * Purpose: get the minimum value found in the array
	 * Parameters: int[] array - the array to search
	 * Returns: int - minimum value found in the array
	 *                or -1 if the array is empty
	 * Post-condition - the array contents are unchanged
	 */
	public static int getMinimum(int[] array) {
		// TODO: implement this
		if(array.length == 0){
			return -1;
		}
		return getMinRec(array, 0, array[0]); // so it compiles
	}
	private static int getMinRec(int[] array, int i, int min){
		if(i == array.length){
			return min;
		}
		int temp = array[i];
		if(temp < min){
			min = temp;
		}
		return getMinRec(array, i+1, min);
	}
	/*
	 * Purpose: determines if there is at least one occurrence of x
	 *          before the first occurrence of y in the array
	 * Parameters: int[] array - the array to search
	 *             int x - the value that must come first
	 *             int y - the value that must come second
	 * Returns: boolean - true if there is at least one occurrence
	 *                    of x before the first occurrence of y
	 */
	public static boolean comesBefore(int[] array, int x, int y) {
		// TODO: implement this
		return comesBeforeRec(array, x, y, 0, false); // so it compiles
	}
	private static boolean comesBeforeRec(int[] array, int x, int y, int i, boolean found){
		if(i == array.length){
			return false;
		}
		if(array[i] == x){
			found = true;
		}
		if(array[i] == y){
			return found; 
		}
		return comesBeforeRec(array, x, y, i + 1, found);
	}
	


	/////////////
	// PART II //
	/////////////
	
	/*
	 * Purpose: get the total number of groceries in s
	 * Parameters: Stack<GroceryItem> s - the stack of groceries
	 * Returns: int - the total number of groceries
	 * Post-condition: s is not modified
	 */
	public static int groceriesCount(Stack<GroceryItem> s) {
		// TODO: implement this
		return groceriesCountRec(s); // so it compiles
	}
	private static int groceriesCountRec(Stack<GroceryItem> s){
		if(s.isEmpty()){
			return 0;
		}
		GroceryItem i = s.pop();
		int count = 1 + groceriesCountRec(s);
		s.push(i);
		return count;
	}

	/*
	 * Purpose: get the total price of all grocery items
	 * Parameters: Stack<GroceryItem> s - the stack of groceries
	 * Returns: double - the total price of all items
	 * Post-condition: s is not modified
	 */
	public static double totalPrice(Stack<GroceryItem> s) {
		// TODO: implement this
		return totalPriceRec(s); // so it compiles
	}
	private static double totalPriceRec(Stack<GroceryItem> s){
		if(s.isEmpty()){
			return 0.0;
		}
		GroceryItem i = s.pop();
		double price = i.getPrice()+totalPriceRec(s);
		s.push(i);
		return price;
	}
	/*
	 * Purpose: get the average price of the grociery items in s
	 * Parameters: Stack<GroceryItem> s - the stack of groceries
	 * Returns: double - the average price of the groceries
	 *                   0.0 if there are no groceries in s
	 * Post-condition: s is not modified
	 */
	public static double averagePrice(Stack<GroceryItem> s) {
		// TODO: implement this
		if(s.isEmpty()){
			return 0.0;
		}
		return totalPriceRec(s)/groceriesCountRec(s); // so it compiles
	}

	/*
	 * Purpose: determine whether toFind is contained in s
	 * Parameters: Stack<GroceryItem> s - the stack of groceries
	 *             GroceryItem toFind - the grocery item to search for
	 * Returns: boolean - true if s contains toFind, false otherwise
	 * Post-condition: s is not modified
	 */
	public static boolean containsItem(Stack<GroceryItem> s, GroceryItem toFind) {
		// TODO: implement this
		return containsItemRec(s, toFind); // so it compiles
	}
	private static boolean containsItemRec(Stack<GroceryItem> s, GroceryItem toFind){
		if(s.isEmpty()){
			return false;
		}
		GroceryItem i = s.pop();
		boolean n = i.equals(toFind) || containsItemRec(s, toFind);
		s.push(i);
		return n;
	}

	/*
	 * Purpose: determine the grocery items in s are stacked correctly
	 *          (ie. there is never a grocery item stacked on top of 
	 *               another item that weighs LESS than it does)
	 * Parameters: Stack<GroceryItem> s - the stack of grocery items
	 * Returns: boolean - true if groceries in s are stacked correctly
	 * Post-condition: s is not modified
	 */
	public static boolean stackedCorrectly(Stack<GroceryItem> s) {
		// TODO: implement this
		if (s.isEmpty()) {
			return true; 
		}
		GroceryItem cur = s.pop();
		boolean isStackedCorrectly = stackedCorrectlyRec(s, cur); 
		s.push(cur); 
		return isStackedCorrectly;
	}	
	private static boolean stackedCorrectlyRec(Stack<GroceryItem> s, GroceryItem cur){
		if(s.isEmpty()){
			return true;
		}
		GroceryItem i = s.pop();
		if(i.getWeight() >= cur.getWeight() && stackedCorrectlyRec(s, i)){
			s.push(i);
			return true;
		}
		s.push(i);
		return false;
	}

}