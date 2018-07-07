package interfacewarmup;

public interface Flyable {
	
	// a field in an interface is automatically
	// int WINGCOUNT=2;
	// int TAILCOUNT=1;
	public static final int WINGCOUNT = 2;
	public static final int TAILCOUNT = 1;

	
	public abstract void fly();

}
