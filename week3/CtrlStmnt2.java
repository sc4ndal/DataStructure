package week3;

public class CtrlStmnt2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i +=2) {
			System.out.println(i);
		}

		for (int i = 1; i <= 10; i ++) {
			if(i%2 == 1)
			System.out.println(i);
		}

		for (int i = 1; i <= 10; i +=2) {
			if(i%2 == 0)
				continue;  //i�� 2�� �������� 0�̸� �������� �ʰ� �ö󰡼� �ٽ� ����
			System.out.println(i);
		}
		int i = 1;
		while(i<=10) {
			if(i%2 == 0) {
				i++;
				continue;
			}
			System.out.println(i);
			
			i++;
		}

	}

}
