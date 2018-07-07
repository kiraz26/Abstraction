package warmup;

public abstract class Student {
	int studentID;
	String name;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	
	public abstract void attendClass();
	
	public void study() {
		System.out.println("Studying");
	}
}
