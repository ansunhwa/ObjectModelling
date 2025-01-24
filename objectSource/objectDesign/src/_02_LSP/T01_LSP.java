package _02_LSP;
/*
 *  리스코프 치환 원칙 (LSP: Liskov
 *  - 자식 클래스는 최소한 부모클래스의 기능은 수행 할 수 있어야 한다
 */
class Dog{
	void speak() {
		System.out.println("멍멍");
	}
}

class WhiteDog extends Dog {
	String color = "white";

	}

class BlackDog extends Dog {
	String color = "black";

	}

public class T01_LSP {

	public static void main(String[] args) {
		Dog dog = new WhiteDog();
		//WhiteDog wDog = (WhiteDog)dog;
		System.out.println(((WhiteDog)dog).color);
		dog.speak();
		
		dog = new BlackDog();
		dog.speak();
		
		//override 하지말고 부모클래스 수행할 수 있어야 한다

	}

}
