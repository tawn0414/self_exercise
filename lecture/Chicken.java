package lecture;

public class Chicken extends Animal implements Cheatable{
	public Chicken(int speed) {
		super(speed);
	}
	public void run(int hours) {
		double result = super.distance+(hours*super.getSpeed());
		System.out.println("���� �̵��Ÿ�="+result);
	}
	public void run2(int hours) {
		double result = super.distance+(hours*super.getSpeed());
		System.out.println("������ ���� �̵��Ÿ�="+result);
	}
	public void fly() {
		super.setSpeed(super.getSpeed()*2);
	}
}
