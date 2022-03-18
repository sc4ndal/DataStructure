package week3;

class TestAnIm implements testing{  //TestAnIm class에 testing을 받아옴
	
	//Source - Override Implement Methods 클릭 - prt1,2()를 가져옴
	@Override
	public void prt1() {
		System.out.println("인터페이스는 다중 상속 가능");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prt2() {
		System.out.println("implements 다음에 인터페이스 여러개 적을 수 있음");
		// TODO Auto-generated method stub
		
	}
	
	
}

public class TestingImp {
public static void main(String[] args) {
	TestAnIm a = new TestAnIm();
	a.prt1();
}

	
	
	
}
