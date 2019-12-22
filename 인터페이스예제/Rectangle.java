package 인터페이스예제;

public class Rectangle extends Shape implements Resize {
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
	}
	

	@Override
	public double getArea() {
		double area = 0.0;
		area = (double)getWidth() * (double)getHeight();
		return area;
		
	}

	@Override
	public void setResize(int size) {

		 setWidth(getWidth() + size);
	}
}
