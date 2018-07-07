package warmup;

//Concrete Class
public class LocalStudent extends Student {
	
	public LocalStudent(int studentID, String name) {
		super(studentID, name);
	}
	
	
	public static void main(String[] args) {
		LocalStudent lc1 = new LocalStudent(1234, "Ahmet");
		lc1.attendClass();
	}

	@Override
	public void attendClass() {
		System.out.println("Attending class local");
		
	}

}
