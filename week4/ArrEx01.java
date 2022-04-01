package week4;

import java.util.Scanner;

public class ArrEx01 {
		
		public static void arrIns(int[] tempArr, int k, int val) {
			int i;
			for(i = tempArr.length-1; i>k;i--)
				tempArr[i] = tempArr[i-1];
				tempArr[i] = val;
		}
		

		public static void arrDel(int[] tempArr, int k) {
		
		int i;
		for (i = k; i < tempArr.length-1; i++) {
			tempArr[i] = tempArr[i+1];
		}
			tempArr[i]=0;
		}	
	public static void main(String[] args) {
//		int[] arr1;
//		arr1 = new int[5];
		
//		int[] arr1=new int[5];   //int 데이터타입의 사이즈가 5인 배열

		Scanner sc = new Scanner(System.in);
		int arr1[] = {10,20,30,40,50}, i, idx, value;
		System.out.println("삽입할 index 입력 : ");
		idx = sc.nextInt();
		System.out.println("삽입할 value 입력 : ");
		value = sc.nextInt();
		
		arrIns(arr1, idx, value);
		
//		System.out.println("삭제할 index 입력 : ");
//		int idx = sc.nextInt();
		
		
//		for (int i = 0; i < arr1.length; i++) {
//			arr1[i] = sc.nextInt();	
//		}      입력받은 값 넣음
		
//		for (i = idx; i < arr1.length-1; i++) {
//			arr1[i] = arr1[i+1];
//		}
		//arr1[i]=0;
		
		
//		arrDel(arr1, idx);
		for (int j = 0; j < arr1.length; j++) {
			System.out.println(arr1[j]);
		}
	}
}
