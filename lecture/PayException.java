package lecture;

import java.lang.Exception;

// ����� ���� Exception : �������� ���� �״�� ����ϼ���.
public class PayException extends Exception {
	
	public PayException(String message){
	    super(message);
	}
}