package lecture;

public abstract class Animal {
	int speed;//�ӵ� km/h
	double distance;//�̵��Ÿ� km
	
	public Animal() {
		
	}

	public Animal(int speed) {
		super();
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	public abstract void run(int hours);
	
}
