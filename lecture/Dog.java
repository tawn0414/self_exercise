package lecture;

public class Dog extends Animal{
	public Dog(int speed) {
		super(speed);
	}
	public void run(int hours) {
		double result = super.distance+(hours*(super.getSpeed()/2));
		System.out.println("개의 이동거리="+result);
	}
}
