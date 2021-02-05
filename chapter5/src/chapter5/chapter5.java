package chapter5;

public class chapter5 {

	public static void main(String[] args) {
		int n1=10;
		int n2=10;
		int n3 =120;
		int n4 =24;
		int n5=1;
		
		if(n1>n2)
		{
			System.out.println("n1= "+n1+" > n2="+n2);
		}
		else if(n1==n2)
		{
			System.out.println("n1= "+n1+" == n2="+n2);
		}
		else
		{
			System.out.println("n1= "+n1+" < n2="+n2);
		}
		
		if((n3>0)&&(n3%2==0)) {
			System.out.println("n3는 양수 이면서 짝수 이다");
		}
		
		switch(n4/10) {
		case 0:
			System.out.println(n4 +" is 10 > n4");
			break;
		case 1:
			System.out.println(n4 +" is 10 <= n4");
			break;
		case 2:
			System.out.println(n4 +" is 20 <= n4");
			break;
		}
		
		while(n5<=5) {
			System.out.println("n5="+n5);
			n5++;
		}
		
		System.out.println("----");
		do {
			System.out.println("n5="+n5);
			n5--;
		}while(n5>=0);
		System.out.println("----");
		for(int i=0;i<5;i++)
		{
			System.out.println("n5="+n5);
			n5++;
		}
		System.out.println("----");
		//100이하의 수 중에서 5의 배수이자 7의 배수인 첫번째 수를 찿기!                                                                                                 
		int n6=1;
		boolean bo=false;
		while(n6<=100) {
			if((n6%5==0)&&(n6%7==0)) {
				bo=true;
				break;// <break>룰 사용을 해서 반복문중 가장 가까이에 감싸고 있는 반복문을 빠져 나간다.
			}
			++n6;
		}
		if(bo) {
			System.out.println("number is "+ n6);
		}
		else {
			System.out.println("100이하 수중에 5의 배수 7의 배수를 모든 만족하는 수는 없습니다");
		}
		//100미만의 5의배수와 7의 배수를 모두 만족 시키는 수를 찿아서 출력하고 갯수를 출력하시오
		int n7=1;
		int count=0;
		while((n7++)<100) {
			if((n7%5==0)&&(n7%7==0)) {
				System.out.println("n7="+n7);
				++count;
			}
			
		}
		System.out.println("count:"+count);
		System.out.println("----");
		//<continue>100미만의 5의배수와 7의 배수를 모두 만족 시키는 수를 찿아서 출력하고 갯수를 출력하시오
		int n8=1;
		int cnt=0;
		while((n8++)<100) {
			if((n8%5)!=0||(n8%7)!=0) {
				continue;
			}
			System.out.println("n8="+n8);
			++cnt;
			
		}
		System.out.println("count:"+cnt);
		System.out.println("----");
		// 구구단의 짝수 단인 2,4,6,8 단만 출력하는 프로그램을 작성하되 2단은 2*2 까지 4단은 4*4까지 단수까지만 출력을 합니다
		int dan=1;
		int a=1;
		while(dan<10) {
			if(dan%2==0) {
				while(a<=dan) {
					System.out.println(dan+"*"+a+"="+ dan*a);
					a++;
				}
				a=1;
			}
			++dan;
		}
		System.out.println("----");
		//AB+BA=99를 만족하는 모든 조합을 구하라
		int A=0, B=0;
		while(A<10) {
			while(B<10) {
				if((A*10+B)+(10*B+A)==99) {
					System.out.println("A:"+A+" B: "+B);
				}
				B++;
			}
			B=0;
			A++;
		}
		
		
	}

}
