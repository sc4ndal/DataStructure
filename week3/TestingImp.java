package week3;

class TestAnIm implements testing{  //TestAnIm class�� testing�� �޾ƿ�
	
	//Source - Override Implement Methods Ŭ�� - prt1,2()�� ������
	@Override
	public void prt1() {
		System.out.println("�������̽��� ���� ��� ����");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prt2() {
		System.out.println("implements ������ �������̽� ������ ���� �� ����");
		// TODO Auto-generated method stub
		
	}
	
	
}

public class TestingImp {
public static void main(String[] args) {
	TestAnIm a = new TestAnIm();
	a.prt1();
}

	
	
	
}
