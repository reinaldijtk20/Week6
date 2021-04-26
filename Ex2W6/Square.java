
public class Square extends Rectangle {
	
	public Square(){
		super();
	}
	
	public Square(double side){
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled){
		super(side, side, color, filled);
	}

	@Override
	public void setWidth(double side) {
		// TODO Auto-generated method stub
		super.setWidth(side);
		setLength(side);
	}

	@Override
	public void setLength(double side) {
		// TODO Auto-generated method stub
		super.setLength(side);
		setWidth(side);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return super.getLength() * super.getWidth();
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 4 * super.getLength();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A Square with side = " + super.getLength() + ", which is subclass of " + super.toString();
	}
	
}
