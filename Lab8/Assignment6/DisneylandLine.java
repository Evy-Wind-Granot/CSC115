/*
 * DisneylandLine
 * 
 * A class to simulate a lineup of people waiting to enter
 * Disneyland. Some people come alone and go to the back of 
 * the line, others bribe their way to a certain position. 
 * Sometimes someone buys a bunch of tickets at once so 
 * multiple people can be removed from the line and enter
 * Disneyland at the same time.
 */
public class DisneylandLine {
	Queue<Person> lineup;
	//Do not add any other fields

	public DisneylandLine() {
		//Do not change the constructor in any way
		lineup = new GenericQueue<Person>();
	}
	
	/*
	 * Purpose: add a person to line to enter Disneyland
	 * Parameter: Person p - the person to add
	 * Returns void - nothing
	 */
	public void enterLine(Person p) {
		// TODO: implement this
		lineup.enqueue(p);
	}
	
	/*
	 * Purpose: gets the number of people in line
	 * Parameters: none
	 * Returns: int - number of people in line
	 */
	public int peopleInLine() {
		// TODO: implement this
		return lineup.size();
	}
	
	/*
	 * Purpose: handle the first person in line
	            (allow them to purchase their ticket
				 and enter into Disneyland)
	 * Parameter: none
	 * Returns: Person - the person who gets their ticket
	 *                   and is no longer waiting in line
	 */
	public Person handleOne() throws QueueEmptyException{
		// TODO: implement this
		if(lineup.isEmpty()){
		 	return null;
		}
		try{
			return lineup.dequeue();
		}catch (QueueEmptyException e){
			throw new QueueEmptyException(null);
		}
	}
	
	/*
	 * Purpose: handle a whole group of people waiting in line
	 *          (allow a group to buy a number of tickets 
	 *           and all enter Disneyland)
	 * Parameters: int num - the number of people
	 * Returns int - the number of people who were successfully
	 *               able to be removed from the line
	 */
	public int handleMultiple(int num) throws QueueEmptyException {
		// TODO: implement this
		int i = 0;
		while (i < num) {
			try {
				lineup.dequeue();
				i++;
			} catch (QueueEmptyException e) {
				break;
			}
		}
		return i;
	}
	
	/*
	 * Purpose: accept a bribe to put someone into a specific
	 *          position in the line to get into Disneyland
	 * Parameters: Person p - the person entering the line
	 *             int pos - the position they are trying to get to
	 * Returns boolean - true if person added to line, false otherwise
	 */
	public boolean premiumEntry(Person p, int pos) throws QueueEmptyException{
		// TODO: implement this
		if(lineup.isEmpty() && pos != 0){
			throw new QueueEmptyException("premiumEntry has thrown an Exception");
		}else if (pos < 0 || pos > lineup.size()) {
        	return false;
   	 	}
		if(lineup.isEmpty() && pos == 0){
			lineup.enqueue(p);
			return true;
		}
		for(int i = 0; i < pos; i++){
			Person l = lineup.dequeue();
			lineup.enqueue(l);
		}
		lineup.enqueue(p);
		for(int i = pos+1; i < lineup.size(); i++){
			Person l = lineup.dequeue();
			lineup.enqueue(l);
		}
    	return true;
	}
	
}
	
	