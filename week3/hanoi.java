package week3;


public class hanoi {
	public static int count1=0;
	//public static int count2=0;
	
	public static void hanoi(int n, char a, char b, char c) {
		count1++;
		
		if(n<0) {
			hanoi(n-1,a,c,b);
			System.out.println(a+"����"+b+"�� �̵�");
			hanoi(n-1,c,b,a);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hanoi(5,'A','B','C');
		System.out.println("ȣ��Ƚ�� :"+count1);
		//System.out.println("�̵�Ƚ�� :"+count2);
	}

}
