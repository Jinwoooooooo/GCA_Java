package ch08.sec03;

public class RemoteControlExample {
	public static void main(String[] args) {
		System.out.println("리모콘 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
		System.out.println("리모콘 최소 볼륨 : " + RemoteControl.MIN_VOLUME);
	}
}

/*
 상수는 구현 객체와 관련 없는 인터페이스 소속 멤버이므로
 위와 같이 인터페이스로 바로 접근해서 상수값을 읽을 수 있다. 
 */
