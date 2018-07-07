package abstraction;

public class Triangle extends Shape{
	double leng1;
	double leng2;
	double leng3;
	
	public Triangle() {
		super("Triangle");
		System.out.println("No arg cons from Triangle");
	}
	
	public Triangle(String name, double leng1, double leng2, double leng3) {
		this();
		this.leng1=leng1;
		this.leng2=leng2;
		this.leng3=leng3;
		System.out.println("4 args cons from Triangle");
	}

	public static void main(String[] args) {
		Triangle tr1 = new Triangle("Triangle", 3, 5, 6);
		tr1.calculateArea();
		System.out.println(tr1.calculateArea());
		
	}

	@Override
	public double calculateArea() {
		super.area=leng1*leng2*leng3/2;
		return area;
	}

	@Override
	public void draw() {
		System.out.println("drawing triangle with 3 leng "+leng1+" "+leng2+" "+leng3);
		
	}

	@Override
	public void superDraw() {
		// TODO Auto-generated method stub
		
	}

}
