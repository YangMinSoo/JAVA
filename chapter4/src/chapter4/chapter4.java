package chapter4;

public class chapter4 {

	public static void main(String[] args) {
		//2�� ���� ���ϱ�
		int num=7;
		num=~num;
		num=num+1;
		System.out.println("num:7 -> "+ num);
		
		//15678�� ������ �������� 3��° ��Ʈ�� 5��° ��Ʈ�� ��� �Ǵ��� Ȯ���Ͽ� ��� �ϵ��� �Ѵ�
		int num1= 15678;
		System.out.println((num1>>2)&1);//�����ʿ��� 3��° ��Ʈ
		System.out.println((num1>>4)&1);//�����ʿ���  5��° ��Ʈ
		
		

	}

}
