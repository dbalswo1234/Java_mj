package collection;

import java.util.HashMap;
import java.util.LinkedList;

public class ExampleTest {

	public static void main(String[] args) {
		
		HashMap mem = new HashMap();		
		mem.put(100, "김데이");
		mem.put(200, "김사전");
		mem.put(300, "김구조");
		mem.put(400, "김자료");
		mem.remove(200);
		mem.put(300, "김충성");
		System.out.println(mem);
		
		LinkedList person = new LinkedList();
		person.add("프로그래머");
		person.add("DB관리자");
		person.add("프로젝트매니저");
		person.add("웹디자이너");
		System.out.println(person);
		
		

	}

}
