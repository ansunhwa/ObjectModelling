package _04_DIP;

public class Pet {
	Dog dog;
	Cat cat;
	// 나중에 추가하려면 class를 변경
	Hamster ham;  // 클래스는 변경하면 안되요 개방 폐쇄의 원칙(OCP)어긋남 -> 수정을 해버려서 
	
	
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
	

}
