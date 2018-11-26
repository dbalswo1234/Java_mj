package java28;

public class HandClockUser {
	
	public static void main(String[] args) {
		RunHandClock run = new RunHandClock();
		CookHandClock cook = new CookHandClock();
		run.timeStop();
		cook.timeStop();
		
		HandClock hand = new RunHandClock();  //추상클래스는 객체생성이 불가하다. 그러나 업캐스팅의 대상은 될수있다. 이것은 업캐스팅의 한예.
		
		
		
	}

}
