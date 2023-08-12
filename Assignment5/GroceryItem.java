public class GroceryItem {
	
	private String name;
	private double price; // in Canadian dollars
	private int weight; // in lbs
	
	public GroceryItem(String name, double price, int weight) {
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String toString() {
		return name + ", price: $"+price+", weight: "+weight+"lbs";
	}
	
	public boolean equals(GroceryItem other) {
		return this.name.equals(other.name)
			&& this.weight == other.weight
				&& this.price == other.price;
	}
}
				
	