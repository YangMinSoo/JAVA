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
			System.out.println("n3�� ��� �̸鼭 ¦�� �̴�");
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
		//100������ �� �߿��� 5�� ������� 7�� ����� ù��° ���� �O��!                                                                                                 
		int n6=1;
		boolean bo=false;
		while(n6<=100) {
			if((n6%5==0)&&(n6%7==0)) {
				bo=true;
				break;// <break>�� ����� �ؼ� �ݺ����� ���� �����̿� ���ΰ� �ִ� �ݺ����� ���� ������.
			}
			++n6;
		}
		if(bo) {
			System.out.println("number is "+ n6);
		}
		else {
			System.out.println("100���� ���߿� 5�� ��� 7�� ����� ��� �����ϴ� ���� �����ϴ�");
		}
		//100�̸��� 5�ǹ���� 7�� ����� ��� ���� ��Ű�� ���� �O�Ƽ� ����ϰ� ������ ����Ͻÿ�
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
		//<continue>100�̸��� 5�ǹ���� 7�� ����� ��� ���� ��Ű�� ���� �O�Ƽ� ����ϰ� ������ ����Ͻÿ�
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
		// �������� ¦�� ���� 2,4,6,8 �ܸ� ����ϴ� ���α׷��� �ۼ��ϵ� 2���� 2*2 ���� 4���� 4*4���� �ܼ������� ����� �մϴ�
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
		//AB+BA=99�� �����ϴ� ��� ������ ���϶�
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
