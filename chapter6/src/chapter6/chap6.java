package chapter6;// 메소드를 활용

public class chap6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("원의 둘레:"+ circumference(3));
		System.out.println("원의 넓이:"+ circlearea(3));
		//1이상100미만의 소수를 판별하여 전부 출력하는 방법
		for(int i=1; i<=100; i++)
		{
			if(findnum(i)==true)
			{
				System.out.print(i+",");
			}
			
		}
		System.out.println("");
		System.out.println("2의 3승: "+ recur(3));
		System.out.println("2의 5승: "+ recur(5));
		System.out.println("");
		tobinary(10);
		
		
	}
	
	public static double circumference (double rad)//원을 둘레를 구하는 메소드
	{
		return 2*3.14*rad;
	}
	
	public static double circlearea(double rad)// 원의 넓이를 구하는 메소드
	{
		return 3.14*rad*rad;
	}
	public static boolean findnum (int num)// 소수를 구하는 메소드
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
	
	public static int recur(int a)// 재귀를 이용한 2의 n승 구하기
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
	
	public static int tobinary (int a)// 10의 정수를 입력받아 이진수 표현을 출력하는 메소드
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
