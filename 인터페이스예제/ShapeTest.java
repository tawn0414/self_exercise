package 인터페이스예제;

//워크북 p74 문제6
public class ShapeTest {
	public static void main(String[] args) {
		Shape shape[] = new Shape[7];
		
		shape[0] = new Triangle(7, 5, "Blue");
		shape[1] = new Rectangle(4, 6, "Blue");
		shape[2] = new Triangle(6, 7, "Red");
		shape[3] = new Rectangle(8, 3, "Red");
		shape[4] = new Triangle(9, 8, "White");
		shape[5] = new Rectangle(5, 7, "White");
		shape[6] = new Circle(0, 0,  "Green",5);
		
		for (int i=0; i<shape.length;i++) {
			
			//System.out.println(shape[i].getClass().getName()+"\t" + shape[i].getArea() +"\t" + shape[i].getColors() );
			if(shape[i] instanceof Triangle) {
				System.out.println("Triangle\t" + shape[i].getArea() +"\t" + shape[i].getColors() );

			}else if(shape[i] instanceof Rectangle) {
				System.out.println("Rectangle\t" + shape[i].getArea() +"\t" + shape[i].getColors() );

			}else if(shape[i] instanceof Circle) {
				System.out.println("Circle\t" + shape[i].getArea() +"\t" + shape[i].getColors() );

			}
			
		}
		
		System.out.println();
		System.out.println("=============사이즈 변경 후 정보============");
		
		
		for (int i=0; i<shape.length;i++) {
			if(shape[i] instanceof Triangle) {
				((Triangle) shape[i]).setResize(5);
				System.out.println("Triangle\t" + shape[i].getArea() +"\t" + shape[i].getColors() );

			}else if(shape[i] instanceof Rectangle) {
				((Rectangle) shape[i]).setResize(5);
				System.out.println("Rectangle\t" + shape[i].getArea() +"\t" + shape[i].getColors() );

			}
			else if(shape[i] instanceof Circle) {
				((Circle) shape[i]).setResize(5);
				System.out.println("Circle\t" + shape[i].getArea() +"\t" + shape[i].getColors() );

			}
			
		}
		
		System.out.println("=============사이즈 변경 후 정보============");
		//향상된 for문 - 5.0부터 추가된 for문
		//배열이나 Collection을 다룰 때 사용
		//for문이 한 번 실행될 때마다 shape배열에서 요소 하나씩 꺼내서 obj에 전달 후 작업
		for (Shape obj : shape) {
			//System.out.println(obj.getColors()); //obj == shape[i]
			//참조변수의 타입으로만 메소드 접근할 수 잇다.
			//객체의 타입을변경하는 경우, 무조건 변경하는 것이 아니라 
			//객체의 타입을 체크한 후에 변경한다. 
			String name = "";
			if(obj instanceof Rectangle) {
				((Rectangle)obj).setResize(5);
				name = "Rectangle";
			}else if(obj instanceof Triangle) {
				((Triangle)obj).setResize(5);
				name = "Triangle";
			}else {
				((Circle)obj).setResize(5);
				name = "Circle";
			}
			System.out.println(name+"\t" + obj.getArea() +"\t" + obj.getColors() );

			
		}
		

	}

}
