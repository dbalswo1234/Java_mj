package collection;

import java.util.Vector;

import java30.KiwiSpeaker;

public class CollectionTest {

	
	public static void main(String[] args) {
		Vector data = new Vector();
		data.add("감사합니다");
		data.add(100);
		data.add(11.22);
		data.add(true);
		data.add(new KiwiSpeaker());
		
		
		System.out.println(data);  //원래 data를 찍으면 new KiwiSpeaker()라고 했을때 주소값이 찍히게 된다. 그러나 키위스피커로 가서 toString을 오버라이드하여 쓰면 내가 원하는 것을 찍을수 있다.
		System.out.println(data.size());
		System.out.println(data.get(data.size()-1));
		
//		for (int i = 0; i < data.size(); i++) {
//			System.out.println(data.get(i));
//		} //for문 종료
		
		String hi = (String)data.get(0);  //data.get()은 괄호안의 값이 object이다. 즉, 최상위 클래스란 말이다. 아무거나 집어넣어도 상관없는 클래스의 값을 String클래스에다 넣으려니 다운캐스팅이므로 안들어가는것이다.
		                                  //큰애를 작은애한테 우겨넣으려니 안되는것이다. 
		Integer num = (int)data.get(1);
		double num2 = (Double)data.get(2);
		double num3 = (double)data.get(2);
		data.remove(0);
		System.out.println(data);
		
	}
}
