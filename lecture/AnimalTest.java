package lecture;
public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);
		if(cheatableChicken instanceof Chicken){
			cheatableChicken.fly();
		}
		System.out.println("1�ð� ��");
		dog.run(1);
		chicken.run(1);
		cheatableChicken.run2(1);
		System.out.println("2�ð� ��");
		dog.run(2);
		chicken.run(2);
		cheatableChicken.run2(2);
		System.out.println("3�ð� ��");
		dog.run(3);
		chicken.run(3);
		cheatableChicken.run2(3);
	}
}












