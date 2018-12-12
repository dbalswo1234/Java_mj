package java30;

public class KiwiSpeaker implements Speaker {

	
	//인터페이스는 데이타 타입이 될수있다. ex) Speaker kiwi = new BananaSpeaker();  Speaker라는 인터페이스가 kiwi라는 변수명 앞에 쓰였다.
	@Override
	public void soundUp() {
		System.out.println("키위 스피커의 사운드 UP");
	}

	@Override
	public void soundDown() {
		System.out.println("키위 스피커의 사운드 DOWN");
	}

	@Override
	public String toString() {
		return "나는 키위";
	}

	
	
}
