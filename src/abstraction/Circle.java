package abstraction;

public class Circle extends Shape {

	double radius;

	public Circle() {
		super("Circle");
		System.out.println("No arg cons from Circle");
	}

	public Circle(String name, double radius) {
		this();
		this.radius = radius;
		System.out.println("2 args cons from Circle");
	}

	public static void main(String[] args) {
		Circle c1 = new Circle("Circle", 10);
		c1.calculateArea();
		System.out.println(c1.calculateArea());

	}

	@Override
	public double calculateArea() {
		super.area = Math.PI * radius * radius;
		return area;
	}

	@Override
	public void draw() {
		System.out.println("drawing circle with radius "+radius);
	}

	@Override
	public void superDraw() {
		// TODO Auto-generated method stub
		
	}

}
