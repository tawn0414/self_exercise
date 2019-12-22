package lecture;

public class kimsam_extends1_TestAccount {
	public static void main(String[] args) {
		kimsam_extends1_checkingAccount acc1 = 
			new kimsam_extends1_checkingAccount("111-222-333","장동건"
					,1000000,"1234-5647-8888");
		acc1.pay("1234-5678-8888", 500000);
		System.out.println("현재잔액====>"+acc1.getBalance());
		acc1.pay("1234-5647-8888", 500000);
		System.out.println("현재잔액====>"+acc1.getBalance());
		
	}

}
