public class A2Exercises {
	
	/*
	 * Purpose: get the player with more fans
	 * Parameters: Player p1, Player p2 - the players to compare
	 * Returns: Player - the player with more fans, or p1
	 *          both players have the same number of fans
	 */
	public static Player moreFans(Player p1, Player p2) {
		// TODO: implement this
		if(p1.getFans() > p2.getFans()){
			return p1;
		}else{
			return p2;
		} // so it compiles
	}			
	
	/*
	 * Purpose: count the number of players on the given team
	 *          with more fans than the given threshold
	 * Parameters: Team t - the team to examine
	 *             int threshold - the number of fans must 
	 *                             be higher than this value
	 * Returns: int - the number of players on the team 
	 *                with more fans than threshold
	 */
	public static int countAbove(Team t, int threshold) {
		int count = 0;
		// TODO: implement this
		for(Player plr : t.getRoster()){
			if(plr.getFans() > threshold){
				count++;
			}
		}
		return count; // so it compiles
	}
	
	/*
	 * Purpose: get the number of teams with at least one 
	 *          player on the roster named toFind
	 * Parameters: Team[] teams - the array of teams to search
	 *             String toFind - the name to search for
	 * Returns: int - the number of teams with a player on the
	 *                roster with the given name
	 */
	public static int countWithName(Team[] teams, String toFind) {
		int count = 0;
		// TODO: implement this
		for(Team members: teams){
			for(Player plr: members.getRoster()){
				if(plr.getName().equals(toFind)){
					count++;
					break;//ask about break//
				}
			}
		}
		return count; // so it compiles
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////Ask about break!!
	/*
	 * Purpose: get the average age of youngest players
	 *          in the array of teams given
	 * Parameters: Team[] t = the array of teams
	 * Returns double - the average age of the youngest 
	 *                  players from each team, or
	 *                  -1.0 if no players are able to
	 *                  be analyzed
	 */
	public static double averageYoungestAge(Team[] teams) {
		double sum = 0.0;
		double average = 0.0;
		int counter = 0;
		// TODO: implement this
		for(Team members: teams){
			Player youngest = null;
			for(Player plr: members.getRoster()){
				if(youngest == null || plr.getAge() < youngest.getAge()){
					youngest = plr;
				}
			}
			if(youngest != null){
				sum += youngest.getAge();
				counter++;
			}
		}
		average = sum/counter;
		if(sum == 0.0){
			return -1.0;
		}
		return average; // so it compiles
	}
		
	/*
	 * Purpose: get the team with most fans (cumulative 
	 *          across all players on the roster)
	 * Parameters: Team[] teams - the array of teams
	 * Returns: Team - the team with the highest number
	 *                 of fans across all players on 
	 *                 the roster
	 * Precondition: teams is not empty
	 * Note: If multiple teams have the same number of
	 *       fans, the team that comes first in the 
	 *       array is returned.
	 */
	public static Team mostFans(Team[] teams) {
		Team mostFans = teams[0];
		// TODO: implement this
		int max = 0;
		for(Team members : teams){
			int testing = 0;
			for(Player plr : members.getRoster()){
				testing += plr.getFans();
			}
			if(testing > max){
				mostFans = members;
				max = testing;
			}
		}
		return mostFans; // so it compiles
	}
}
