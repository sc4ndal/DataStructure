package week3;

import java.util.Scanner;

public class CtrlStmnt1 {

	public static void main(String[] args) {
		outer: //�ٱ� for���� �̸� outer
		for (int i = 0; i < 10; i++) {
			inner:  //�� for���� �̸� inner
			for (int j = 0; j < 10; j++) {
				if(i+j == 5)
					break outer;  //outer���� for���� ���
				System.out.printf("i=%d j=%d\t",i,j);
			}
			System.out.println();
			
		}

	}

}
