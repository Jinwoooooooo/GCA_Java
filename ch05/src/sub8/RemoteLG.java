package sub8;

public class RemoteLG implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("LG - POWER ON...");
	}

	@Override
	public void powerOff() {
		System.out.println("LG - POWER OFF...");
	}

	@Override
	public void chUp() {
		System.out.println("LG - CHANNEL UP...");
	}

	@Override
	public void chDown() {
		System.out.println("LG - CHANNEL DOWN...");
	}

	@Override
	public void soundUp() {
		System.out.println("LG - SOUND UP...");
	}

	@Override
	public void soundDown() {
		System.out.println("LG - SOUND DOWN...");
	}
	
}
