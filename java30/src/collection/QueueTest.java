package collection;

import java.util.LinkedList;

public class QueueTest {  //먼저 들어온 데이터가 먼저 나가는 것.(=큐)

	public static void main(String[] args) {
		LinkedList milk = new LinkedList();
		milk.add("어제우유");
		milk.add("오늘우유");
		milk.add("내일우유");
		System.out.println(milk);
		
		milk.remove();
		System.out.println(milk);
		
		
		milk.remove();
		System.out.println(milk);
		


	}

}
