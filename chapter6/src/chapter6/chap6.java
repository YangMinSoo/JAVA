package chapter6;// �޼ҵ带 Ȱ��

public class chap6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� �ѷ�:"+ circumference(3));
		System.out.println("���� ����:"+ circlearea(3));
		//1�̻�100�̸��� �Ҽ��� �Ǻ��Ͽ� ���� ����ϴ� ���
		for(int i=1; i<=100; i++)
		{
			if(findnum(i)==true)
			{
				System.out.print(i+",");
			}
			
		}
		System.out.println("");
		System.out.println("2�� 3��: "+ recur(3));
		System.out.println("2�� 5��: "+ recur(5));
		System.out.println("");
		tobinary(10);
		
		
	}
	
	public static double circumference (double rad)//���� �ѷ��� ���ϴ� �޼ҵ�
	{
		return 2*3.14*rad;
	}
	
	public static double circlearea(double rad)// ���� ���̸� ���ϴ� �޼ҵ�
	{
		return 3.14*rad*rad;
	}
	public static boolean findnum (int num)// �Ҽ��� ���ϴ� �޼ҵ�
	{
		int check=0;
		for(int a=1;a<=num;a++)
		{
			if(num%a==0)
			{
				check++;
			}
		}
		if(check==2)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static int recur(int a)// ��͸� �̿��� 2�� n�� ���ϱ�
	{
		if(a==0)
		{
			return 1;
		}
		else
		{
			
			return 2*recur(a-1);
		}
		
		
	}
	
	public static int tobinary (int a)// 10�� ������ �Է¹޾� ������ ǥ���� ����ϴ� �޼ҵ�
	{
		if(a>0)
		{
			int bit=0;
			bit=a%2;
			a=a/2;
			
			tobinary(a);
			System.out.print(bit);
		}
		return 0;
		
	}
	

}
