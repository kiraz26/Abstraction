package interfacewarmup;

public class Bird implements Flyable, Sounds {
	
	public static final int WINGCOUNT=12;
	
	
	@Override
	public void fly() {
		System.out.println("fly like a bird");
	}

	@Override
	public void makeNoise() {
		System.out.println("quack quack");
		
		
		
		
		
	}

}
