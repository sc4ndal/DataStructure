package week3;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("�̸� �Է�: ");
		name = sc.next();
		//if(name == "ȫ�浿") -> ȫ�浿�� �ƴմϴ�.
		if(name.equals("ȫ�浿"))
			System.out.println("ȫ�浿�� �½��ϴ�.");
		else
			System.out.println("ȫ�浿�� �ƴմϴ�.");

	}

}
