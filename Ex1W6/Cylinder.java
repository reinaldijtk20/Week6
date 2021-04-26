
public class Cylinder extends Circle {
	
	private double height;
	
	public Cylinder(){
		super();
		height = 1.0;
	}
	
	public Cylinder(double height){
		super();
		this.height = height;
	}
	
	public Cylinder(double height, double radius){
		super(radius);
		this.height = height;
	}
	
	public double getHeight(){
		return height;
	}
	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (2 * Math.PI * getRadius()) + (2 * super.getArea());
	}

	public double getVolume(){
		return super.getArea() * height;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cylinder: subclass of " + super.toString()
				+ " height = " + height;
	}
	
}
