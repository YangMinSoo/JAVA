package chpater7;

public class chap7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BankAccount myaccount= new BankAccount();
		//myaccount=참조 변수 , new BankAccount=인스턴스 (new를 통해서 인스턴스를 생성을 하게 되면 주소값이 반환이 된다)
		//따라서 참조변수에는 새로 생긴 인스턴스의 주소 값이 저장이 된다
		
		BankAccount firstAccount = new BankAccount("first","011",1000);
		firstAccount.deposite(3000);
		firstAccount.withdraw(3000);
		firstAccount.checkAccount();
		checkbalance(firstAccount);
		

	}
	
	//참조변수의 매개변수 선언
	public static void checkbalance(BankAccount ref)
	{
		System.out.println("balance is(main check) "+ref.balance);
	}

}
