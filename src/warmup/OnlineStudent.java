package warmup;

public class OnlineStudent extends Student{

	public OnlineStudent(int studentID, String name) {
		super(studentID, name);
	}
	
	public static void main(String[] args) {
	
		OnlineStudent o1= new OnlineStudent(21345, "Veli");
		System.out.println(o1.name);
		o1.attendClass();
		o1.name ="Halil";
		System.out.println(o1.name);
	
	}

	@Override
	public void attendClass() {
		System.out.println("Attending class online");
		
	}

}
