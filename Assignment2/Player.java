public class Player {
	private String name;
	private int age;
	private int fans;
	
	public Player () {
		name = "unnamed";
		age = 0;
		fans = 0;
	}
	public Player (String name, int age, int fans) {
		this.name = name;
		this.age = age;
		this.fans = fans;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	} 
	
	public int getFans() {
		return fans;
	}
	
	public void addFans(int newFans) {
		this.fans += newFans;
	}
	
	public String toString() {
		return "Name: "+name+", age: "+age+", fans: "+fans;
	}
	
	public boolean equals(Player other) {
		return this.name.equals(other.name) &&
			this.age == other.age &&
				this.fans == other.fans;
	}
}