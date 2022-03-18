package week3;

public class CallBy {
	public static void SampleAccess(int B[], int n) {
		B[n] = 8;   //call by value A의 주소를 B가 들고가서 5번째 배열을 8로 바꿈
		n++;        //call by reference k->n으로 5를 주고 더하지만 주소가 아닌 숫자라 실행이 끝나면 날아가서 결과값에는 영향 X
		
	}
	public static void main(String[] args) {
		int[] A = new int[10];
		A[5] = 7;
		int k = 5;
		
		SampleAccess(A, k);
		for (int i : A) {
			System.out.print(i+" ");
		}
		System.out.println(k);
	}

}
