
public class Driver {
	public static void main(String[] args) {
		Shape s = new Shape("black", false);
		System.out.println(s.toString());
		
		Circle c = new Circle(4.0, "yellow", true);
		System.out.println(c.toString() 
						+ ",area = " + c.getArea()
						+ " perimeter " + c.getPerimeter());
		
		Rectangle r = new Rectangle(4.0, 5.2, "yellow", true);
		System.out.println(r.toString() 
						+ ",area = " + r.getArea()
						+ " perimeter " + r.getPerimeter());
		
		Square sq = new Square(4.0, "yellow", true);
		System.out.println(sq.toString() 
						+ ",area = " + sq.getArea()
						+ " perimeter " + sq.getPerimeter());
	}
}
