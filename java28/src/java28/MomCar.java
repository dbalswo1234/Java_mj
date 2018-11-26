package java28;

public class MomCar extends DadCar implements Speaker {

	public void Mom() {
		MomCar mom = new MomCar();
		mom.dad();
		mom.soundUp();
		mom.soundDown();
	}

	@Override
	public void soundUp() {
		System.out.println("볼륨이 20씩 업~");
	}

	@Override
	public void soundDown() {
		System.out.println("볼륨이 5씩 다운~");
	}
	
	
}
