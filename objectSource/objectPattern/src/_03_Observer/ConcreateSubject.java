package _03_Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreateSubject implements Subject {
	// 감시자를 담을 리스트
	List<Observer> observers = new ArrayList<>();

	@Override
	public void registerObwerver(Observer o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeObserver(Observer o) {
		observers.add(o);
		System.out.println(o + "구독 완료");

	}

	@Override
	public void notifyObserver() {
		observers.remove(observers);           // 허.....
		System.out.println(  "구독 취소");

	}

}
