package java30;



public class MyCar {
	
	public MyCar() {   //MyCar의 기본 생성자인데 그 안에 메서드가 또 있고 그 메서드의 인수를 인터페이스 Speaker의 주소값을 넣으면 그 인터페이스가 호출이 될것이다. new라는 연산자를 사용하여 Speaker 인터페이스의 주소값을 넣어준다.
		
		none(new Speaker() {
			
			@Override
			public void soundUp() {
				System.out.println("내 차는 볼륨이 1씩 증가됩니다.");
				
			}
			
			@Override
			public void soundDown() {
				System.out.println("내 차는 볼륨이 1씩 감소됩니다.");
				
			}
		});
		
		
	} //생성자 종료
	
	
	public void none(Speaker s) {
		SpeakerClass speaker = new SpeakerClass();
		speaker.soundUp();
		speaker.soundDown();
	}
	
	
	

} //클래스 종료
