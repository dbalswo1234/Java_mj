package java30;

public class SPhone implements Phone {

	@Override
	public void talk() {
	System.out.println("삼성 빅스비로 대화를 합니다.");
	}

	@Override
	public void internet() {
		System.out.println("구글 크롬으로 인터넷을 합니다.");
	}

}
