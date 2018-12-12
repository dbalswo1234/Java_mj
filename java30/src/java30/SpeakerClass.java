package java30;

import java30.Speaker;

public class SpeakerClass implements Speaker{

	@Override
	public void soundUp() {
		System.out.println("소리를 10씩 Up...");
		
	}

	@Override
	public void soundDown() {
		System.out.println("소리를 10씩 Down...");
		
	}

}
