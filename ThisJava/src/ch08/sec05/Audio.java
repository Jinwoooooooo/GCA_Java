package ch08.sec05;

public class Audio implements RemoteControl {

	//필드
	private int voulme;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(voulme > RemoteControl.MAX_VOULME) {
			this.voulme = RemoteControl.MAX_VOULME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.voulme = RemoteControl.MIN_VOLUME;
		} else {
			this.voulme = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + volume);
	}
	
	//필드 
	private int memoryVolume;
	
	//디폴트 메소드 재정의
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.voulme;
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
			setVolume(this.memoryVolume);
		}
	}
}
