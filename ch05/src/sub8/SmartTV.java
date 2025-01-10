package sub8;

public class SmartTV extends TV implements Computer {

	@Override
	public void boot() {
		System.out.println("SmartTV boot...");
	}

	@Override
	public void internet() {
		System.out.println("SmartTV internet...");
	}
	
	public void process() {
		powerOn();
		boot();
		internet();
	}
}
