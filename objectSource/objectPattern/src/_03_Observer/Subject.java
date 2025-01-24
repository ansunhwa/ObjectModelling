package _03_Observer;

public interface Subject {
	void registerObwerver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver();

}
