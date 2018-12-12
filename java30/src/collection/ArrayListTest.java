package collection;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList doing = new ArrayList();
		doing.add("일어나기");
		doing.add("커피마시기");
		doing.add(1350); //지하철비용
		doing.add(5);   //5분 걷기
		System.out.println(doing);
		System.out.println(doing.size()+"가지 일을 했다.");
		System.out.println("제일먼저 한일은 " + doing.get(0));
		System.out.println("마지막에 걸었던 시간은 " + doing.get(doing.size()-1)+"분");
		
		doing.add(1, "걷기");
		System.out.println(doing);
		doing.set(1, "택시타기");
		System.out.println(doing);
		
		ArrayList ski = new ArrayList();
//		ski.add("스키대회");
//		ski.add("박스키");
//		ski.add("송스키");
//		ski.add("김스키");
//		ski.add("정스키");
//		ski.remove(2);
//		System.out.println(ski);
		ski.set(0, "");
		ski.set(1, "박스키");
		ski.set(2, "송스키");
		ski.set(3, "김스키");
		ski.set(4, "정스키");
		System.out.println(ski);
		
		
	}
}
