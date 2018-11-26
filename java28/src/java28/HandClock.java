package java28;

public abstract class HandClock implements Clock{
	
	//추상메서드가 하나라도 포함되어 있으면 그 클래스는 
	//아직 완벽하지 않으므로 추상클래스다.
	
	int price;

	@Override
	public void watch() {
		System.out.println("손목시계로 시각을 보다.");
	}

	@Override
	public void timeStop() {
		
	}
	
	
	

}
