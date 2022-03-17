package week2;

public class ForIfElse {
	public static long fact1(int n) {
		long tmp = 1;
			for(int i = 2; i <= n; i++) {
				tmp = i*tmp;
			}
			return tmp;
	}
	public static long fact2(int n) {
		if(n == 0) 
			return 1;
		else
			return n * fact2(n-1);	
		
		
	}
	public static void main(String[] args) {
			System.out.println(fact1(5));
			System.out.println(fact2(5));
	}

}
