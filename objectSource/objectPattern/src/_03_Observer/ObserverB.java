package _03_Observer;

public class ObserverB implements Observer {

	@Override
	public void update() {
		System.out.println("B에게 이벤트 알람이 왔습니다");
	}

	@Override
	public String toString() {
		return "ObserverB";
	}
	
	

}
