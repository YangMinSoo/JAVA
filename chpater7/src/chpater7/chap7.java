package chpater7;

public class chap7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BankAccount myaccount= new BankAccount();
		//myaccount=���� ���� , new BankAccount=�ν��Ͻ� (new�� ���ؼ� �ν��Ͻ��� ������ �ϰ� �Ǹ� �ּҰ��� ��ȯ�� �ȴ�)
		//���� ������������ ���� ���� �ν��Ͻ��� �ּ� ���� ������ �ȴ�
		
		BankAccount firstAccount = new BankAccount("first","011",1000);
		firstAccount.deposite(3000);
		firstAccount.withdraw(3000);
		firstAccount.checkAccount();
		checkbalance(firstAccount);
		

	}
	
	//���������� �Ű����� ����
	public static void checkbalance(BankAccount ref)
	{
		System.out.println("balance is(main check) "+ref.balance);
	}

}
