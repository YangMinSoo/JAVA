package chapter4;

public class chapter4 {

	public static void main(String[] args) {
		//2의 보수 취하기
		int num=7;
		num=~num;
		num=num+1;
		System.out.println("num:7 -> "+ num);
		
		//15678의 오른쪽 끝에서의 3번째 비트와 5번째 비트가 어떻게 되는지 확인하여 출력 하도록 한다
		int num1= 15678;
		System.out.println((num1>>2)&1);//오른쪽에서 3번째 비트
		System.out.println((num1>>4)&1);//오른쪽에서  5번째 비트
		
		

	}

}
