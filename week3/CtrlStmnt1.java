package week3;

import java.util.Scanner;

public class CtrlStmnt1 {

	public static void main(String[] args) {
		outer: //바깥 for문의 이름 outer
		for (int i = 0; i < 10; i++) {
			inner:  //안 for문의 이름 inner
			for (int j = 0; j < 10; j++) {
				if(i+j == 5)
					break outer;  //outer까지 for문을 벗어남
				System.out.printf("i=%d j=%d\t",i,j);
			}
			System.out.println();
			
		}

	}

}
