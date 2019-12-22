package 인터페이스;

/*
 * 객체의 타입을 검사하고 작업할 수 있다.
 * instanceof연산자 이용
 * 
 * 
 */

class A{

}
interface IA{
	
}


public class interfaceofTest {
	public static void main(String[] args) {
		SubA obj = new SubA();
		//상속을 하고 있는 클래스는 타입으로 나옴
		if(obj instanceof SuperA) { //SuperA 타입이냐?
			System.out.println("SuperA타입이다.");
		}else {
			System.out.println("SuperA타입 아니다.");
		} 
		
		if(obj instanceof InterA) {
			System.out.println("InterA타입이다.");
		}else {
			System.out.println("InterA타입 아니다.");
		}
		
		if(obj instanceof InterB) {
			System.out.println("InterB타입이다.");
		}else {
			System.out.println("InterB타입 아니다.");
		}
		
		if(obj instanceof InterC) {
			System.out.println("InterC타입이다.");
		}else {
			System.out.println("InterC타입 아니다.");
		}
		
		if(obj instanceof IA) {
			System.out.println("IA타입이다.");
		}else {
			System.out.println("IA타입 아니다.");
		}
	
	
	

	}

}
