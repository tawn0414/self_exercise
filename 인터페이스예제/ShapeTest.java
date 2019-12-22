package �������̽�����;

//��ũ�� p74 ����6
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
		System.out.println("=============������ ���� �� ����============");
		
		
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
		
		System.out.println("=============������ ���� �� ����============");
		//���� for�� - 5.0���� �߰��� for��
		//�迭�̳� Collection�� �ٷ� �� ���
		//for���� �� �� ����� ������ shape�迭���� ��� �ϳ��� ������ obj�� ���� �� �۾�
		for (Shape obj : shape) {
			//System.out.println(obj.getColors()); //obj == shape[i]
			//���������� Ÿ�����θ� �޼ҵ� ������ �� �մ�.
			//��ü�� Ÿ���������ϴ� ���, ������ �����ϴ� ���� �ƴ϶� 
			//��ü�� Ÿ���� üũ�� �Ŀ� �����Ѵ�. 
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
