package _02_LSP;
/*
 *  리스코프 치환 원칙 (LSP: Liskov
 *  - 자식 클래스는 최소한 부모클래스의 기능은 수행 할 수 있어야 한다
 */
class Cat{
	void speak() {
		System.out.println("야옹");
	}
}

class WhiteCat extends Cat {
	String color = "white";
	@Override
	void speak() {
		System.out.println("야우웅");
	}
}
class BlackCat extends Cat {
	String color = "black";
	@Override
	void speak() {
		System.out.println("냥냥냥");
	}
}
public class T01_LSP_solution {

	public static void main(String[] args) {
		Cat cat = new WhiteCat();
		cat.speak();
		
		cat = new BlackCat();
		cat.speak();
		

	}

}
