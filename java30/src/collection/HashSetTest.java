package collection;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("휴대폰");
		bag.add("볼펜");
		bag.add(10000);
		bag.add("볼펜");   //Set타입은 중복값은 허용하지 않음.
		System.out.println(bag);
		System.out.println(bag.size());
		
		for (Object o : bag) {
			System.out.println(o);
		}

		
		HashSet team = new HashSet();
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		
		for (Object team1 : team) {
			System.out.print(team1+" ");
		}
		
		
	}

}
