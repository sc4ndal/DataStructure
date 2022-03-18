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
				continue;  //i를 2로 나눴을때 0이면 내려가지 않고 올라가서 다시 실행
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
