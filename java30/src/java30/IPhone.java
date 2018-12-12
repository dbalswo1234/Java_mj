package java30;

public class IPhone implements Phone {
	
	

	@Override
	public void talk() {
		System.out.println("시리와 대화를 합니다.");
	}

	@Override
	public void internet() {
		System.out.println("사파리로 인터넷을 합니다.");
	}

}
