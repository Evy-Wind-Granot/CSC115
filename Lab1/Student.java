/*
* Student.java
* A Student class
*/
public class Student {

	private String sID;
	private int grade;

	public Student() {
		sID = "";
		grade = -1;
	}
	public Student(String sID, int grade) {
		this.sID = sID;
		this.grade = grade;
	}
	public String getSID() {
		return this.sID; // so it compiles
	}
	public void setSID(String newsID){
		this.sID = newsID;
	}
	public int getGrade() {
		return this.grade; // so it compiles
	}
	public void setGrade(int grade){
		this.grade = grade;
	}
	public String toString(){
		return sID + ":" + grade;
	}
	public boolean equals(Student other){
		return (this.sID.equals(other.sID));
	}

}
