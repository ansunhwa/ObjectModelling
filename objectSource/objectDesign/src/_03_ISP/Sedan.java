package _03_ISP;

public class Sedan implements Car {

	@Override
	public void drive() {
		System.out.println("운전중");
		
	}

	@Override
	public void turnLefr() {
		System.out.println("왼쪽");
		
	}

	@Override
	public void turnRight() {
		System.out.println("오른쪽");
		
	}

	@Override
	public void stop() {
		System.out.println("정지");
		
	}

	@Override
	public void water() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void patientTransport() {
		// TODO Auto-generated method stub
		
	}


}
