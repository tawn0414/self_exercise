package lecture;

public class Chicken extends Animal implements Cheatable{
	public Chicken(int speed) {
		super(speed);
	}
	public void run(int hours) {
		double result = super.distance+(hours*super.getSpeed());
		System.out.println("닭의 이동거리="+result);
	}
	public void run2(int hours) {
		double result = super.distance+(hours*super.getSpeed());
		System.out.println("날으는 닭의 이동거리="+result);
	}
	public void fly() {
		super.setSpeed(super.getSpeed()*2);
	}
}
