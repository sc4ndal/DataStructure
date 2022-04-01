package week4;

class Animal<T>{   //generic은 class명<> = 지정 직전에 datatype 지정 가능
	T a;
	void eat() {System.out.println("냠냠");}
}

class Cat extends Animal{   //Cat class에 Animal class 상속받아서 a와 eat 사용 가능
	int b;
	void meow() {System.out.println("야옹");}
}
class Tiger<G> extends Animal{
	G c;
	void mong() {System.out.println("어흥");}
}
public class ClassCat {
	public static void main(String[] args) {
		Animal<Integer> an = new Animal();
		an.eat();
		Cat cat = new Cat();
		cat.meow(); cat.eat();
		Animal<Integer> an2 = new Cat();  //부모 클래스의 an2는 Animal class 밖에 사용 불가
		Cat cat2 = (Cat)an2;
		//an2.
		cat2.meow();
		Tiger<String> tiger = new Tiger();
		tiger.mong();
		Tiger<Integer> tiger2 = new Tiger();
		tiger2.c = 3;
		System.out.println(tiger2.c);
		tiger2.eat();
	}
}
