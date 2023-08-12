public class Team {
	private String name;
	private Player[] roster;
	
	public Team(String name, Player[] roster) {
		this.name = name;
		this.roster = roster;
	}
	
	public String getName() {
		return name;
	}
	
	public Player[] getRoster() {
		return roster;
	}
	
	/*
	 * Purpose: get the total number of fans across
	 *          all players on this team
	 * Parameters: none
	 * Returns: int - the sum of fans of all players
	 *                on this team
	 *
	 * Note: If the same player appears in the roster
	 * multiple times, their fans are counted each 
	 * time (you do not need to check for duplicates)
	 */
	public int totalFans() {
		int sum = 0;
		// TODO: implement this
		for(Player plr : roster){
			sum += plr.getFans();
		}
		return sum;
	}
	
	/*
	 * Purpose: get the youngest player on this team
	 * Parameters: none
	 * Returns: Player - the youngest player, or null
	 *          if there are no players on this team
	 *
	 * Note: If the team has more than one player the 
	 * youngest age, the player who comes first in 
	 * the roster of players is returned
	 */
	public Player getYoungest() {
		// TODO: implement this
		if (roster == null || roster.length == 0) {
			return null;
		}
		Player youngest = roster[0];
		for (int i = 1; i < roster.length; i++) {
			if (roster[i].getAge() < youngest.getAge()) {
				youngest = roster[i];
			}
		}
		return youngest; // so it compiles
	}

	/*
	 * Purpose: get the player with the given name
	 *          on this team
	 * Parameters: String name - the player to search for
	 * Returns: Player - the player with the given name, 
	 *          or null if there is no player with the
	 *          given in the this team's roster
	 *
	 * Note: If the team has more than one player with 
	 * the given name, the player who comes first in 
	 * the roster of players is returned
	 */
	public Player getPlayer(String name) {
		Player p = null;
		// TODO: implement this
		for(Player plr : roster){
			if(plr.getName().equals(name)){
				return plr;
			}
		}
		return p; // so it compiles
	}
	
	/*
	 * Purpose: update the player with the given name
	 *          by updating their number of fans by 
	 *          the number of fans given
	 * Parameters: String name - name of player to update
	 *             int fans - number of fans to add
	 * Returns: boolean - true if the player was found 
	 *          and the fans were added, false otherwise
	 * 
	 * Note: If the team has more than one player with 
	 * the given name, the player who comes first in 
	 * the roster of players is updated
	 */
	public boolean goingViral(String name, int fans) {
		boolean found = false;
		// TODO: implement this
		for(Player plr : roster){
			if(plr.getName().equals(name)){
				plr.addFans(fans);
				found = true;
				break;
			}
		}
		return found; // so it compiles
	}
}
