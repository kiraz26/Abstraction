package abstraction;

public abstract class Shape extends SuperShape{
	String name;
	double area;
	
	public Shape(String name) {
		this.name = name;
		System.out.println("One arg cons from Shape");
	}
	
	public abstract double calculateArea();
	public abstract void draw();
	
}
