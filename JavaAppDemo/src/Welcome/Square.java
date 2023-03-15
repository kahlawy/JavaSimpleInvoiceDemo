package Welcome;

public class Square extends Shape {

	/*@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub
		super.setHeight(height);
	}*/
	
	//Square
	Shape sh = new Shape();
	
	
	public double SquareArea() {
		return sh.getHeight() * sh.getWidth();
	}
}
