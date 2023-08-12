public class A4Exercises {

	/*
	 * Purpose: gets the number of people in the given list
	 * Parameters: List pList - the list of people
	 * Returns: int - the number of people in the given list
	 */
	public static int peopleCount(List pList) {
		// TODO: implement this
		return pList.size(); // so it compiles
	}
	
	/*
	 * Purpose: gets the total number of adults in the given list
	 * Parameters: List pList - the list of people
	 * Returns: int - the number of adults in pList
	 *
	 * NOTE: for this assignment, assume an adult is 
	 *       any person who is 18 or older.
	 */
	public static int adultsCount(List pList) {
		// TODO: implement this
		int count = 0;
		for(int i = 0; i < pList.size(); i++){
			if(pList.get(i).getAge() >= 18){
				count++;
			}
		}
		return count; // so it compiles
	}
	
	/*
	 * Purpose: get the number of people into the list p is
	 * Parameters: List pList - the list of people
	 *             Person p = the person to find
	 * Returns: int - the distance the first occurrence of 
	 *                p is from the start of the list, or 
	 *                -1 if p is not found in pList
	 */
	public static int distanceAway(List pList, Person p) {
		// TODO: implement this
		if(pList.size() == 0){
			return -1;
		}else{
			int count = 0;
			for(int i = 0; i < pList.size(); i++){
				if(pList.get(i).equals(p)){
					return count;
				}
				count++;
			}
		}
		return -1;
	}
	
	/*
	 * Purpose: get the distance the tallest person is 
	 *          from the start of the list
	 * Parameters: List pList - the list of people
	 * Returns: int - the distance the tallest person
	 *                is from the start of the list,
	 *                or 0 if the list is empty
	 *
	 * Note: if two or more people are tied as the tallest, 
	 *       the index of the person who comes first in the
	 *       list among those who are tied is returned
	 */
	public static int distanceToTallest(List pList) {
		// TODO: implement this
		if(pList.size() == 0){
			return 0;
		}
		int max = 0;
		int count = 0;
		int max_count = 0;
		for(int i = 0; i < pList.size(); i++){
			if(pList.get(i).getHeight() > max){
				max = pList.get(i).getHeight();
				max_count = count;
			}
			count++;
		}
		return max_count; 
	}

	/*
	 * Purpose: get the number of buildings visible 
	 *          from the beginning of the list 
	 * Parameters: List pList - the list of people
	 * Returns: int - the number of buildings visible
	 * 
	 * Note: Read through the assignment PDF for more information
	 */
	public static int numberVisible(List pList) {
		// TODO: implement this
		if (pList.size() == 0) {
			return 0;
		}
		int Buildings = 1;
		int max = pList.get(0).getHeight(); 
		for (int i = 1; i < pList.size(); i++) {
			if (pList.get(i).getHeight() > max) {
				Buildings++;
				max = pList.get(i).getHeight();
			}
		}
		return Buildings;
	}
		
	/*
	 * Purpose: get the longest number adults found in a row in the list
	 * Parameters: List pList - the list of people
	 * Returns: int - the longest number of adults found in a row
	 * 
	 * Note: Assume an adult is a person 18 years or older
	 */
	public static int numberOfAdultsInARow(List pList) {
		// TODO: implement this
		if(pList.size()==0){
			return 0;
		}
		int count = 0;
		int max = 0;
		for(int i = 0; i < pList.size(); i++){
			if(pList.get(i).getAge() >= 18){
				count++;
				if(count>max){
					max = count;
				}
			}else{
				count = 0;
			}
		}
		return max; // so it compiles
	}
}