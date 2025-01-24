package _01_OCP;

public class T01_OCP_solution {

	public static void main(String[] args) {
		SoundPlayer sp = new SoundPlayer();
		
		sp.setPalyInter(new Wav());
		System.out.println("Wav 파일 재생 : ");
		sp.play();
		
		sp.setPalyInter(new Mp3());
		System.out.println("mp3 파일재생 : ");
		sp.play();
		

	}

}
