package assignment9;

public class students implements Comparable<students> {
	int rollRoll;
	String name;
	int marks;
	@Override
	public String toString() {
		return "students [rollRoll=" + rollRoll + ", name=" + name + ", marks=" + marks + "]";
	}
	public students() {
		super();
	}
	public students(int rollRoll, String name, int marks) {
		super();
		this.rollRoll = rollRoll;
		this.name = name;
		this.marks = marks;
	}
	public int getRollRoll() {
		return rollRoll;
	}
	public void setRollRoll(int rollRoll) {
		this.rollRoll = rollRoll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public int compareTo(students o) {
		return -(this.marks-o.marks);
	}

}
