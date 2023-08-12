public class Person {
	private String name;
	private int height; // in cm
	private int age; // in years
	
	public Person(String name, int height, int age) {
		this.name = name;
		this.height = height;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "{"+name+","+height+","+age+"}";
	}
	
	public boolean equals(Person other) {
		return this.name.equals(other.name)
			&& this.age == other.age;
	}
}