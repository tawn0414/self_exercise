package 인터페이스예제;

public class Circle extends Shape implements Resize {
	private int radius;
	
	public Circle() {
		
	}
	

	public Circle(int width, int height, String colors, int radius) {
		super(width, height, colors);
		this.radius = radius;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public void setResize(int size) {
		setRadius(getRadius()+size);
	}


	@Override
	public double getArea() {
		return this.radius*this.radius*Math.PI;
		
	}

}