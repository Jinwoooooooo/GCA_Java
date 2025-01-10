package sub8;

public class RemoteSamsung implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("SAMSUNG - POWER ON...");
	}

	@Override
	public void powerOff() {
		System.out.println("SAMSUNG - POWER OFF...");
	}

	@Override
	public void chUp() {
		System.out.println("SAMSUNG - CHANNEL UP...");
	}

	@Override
	public void chDown() {
		System.out.println("SAMSUNG - CHANNEL DOWN...");
	}

	@Override
	public void soundUp() {
		System.out.println("SAMSUNG - SOUND UP...");
	}

	@Override
	public void soundDown() {
		System.out.println("SAMSUNG - SOUND DOWN...");
	}

}
