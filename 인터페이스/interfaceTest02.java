package 인터페이스;
import javax.swing.JFrame;
//인터페이스를 사용하는 목적은 다중상속을 허용, 다형성을 적용할 수 있도록,
//			기본적으로 구현해야 하는 기능이 무엇인지 정의하기 위한 목적

class GUITest extends JFrame implements Runnable{
	GUITest(){
	}
	GUITest(String title){
		super(title);
		setSize(500, 500); //이 메소드들은 부모클래스 안에 정의되어있는 메소드들이라 갖다쓸수있음
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//클래스이름으로 액세스, 대문자->값이 저장된 상수
		//누르면 종료된다.
		
	}
	
}
public class interfaceTest02 {
	public static void main(String[] args) {
		

	}
}
