package java30;

public class Tour2 {

	public static void main(String[] args) {
		BananaSpeaker s = new BananaSpeaker();
		StrongWindow w = new StrongWindow();
		Car car = new Car(s,w);
		car.info();
		
	}

}
