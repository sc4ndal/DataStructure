package week3;

public class CallBy {
	public static void SampleAccess(int B[], int n) {
		B[n] = 8;   //call by value A�� �ּҸ� B�� ����� 5��° �迭�� 8�� �ٲ�
		n++;        //call by reference k->n���� 5�� �ְ� �������� �ּҰ� �ƴ� ���ڶ� ������ ������ ���ư��� ��������� ���� X
		
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
