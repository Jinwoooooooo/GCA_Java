package ch07.sec10.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		
		//Phone 클래스는 abstract, 추상 클래스이기 때문에 객체를 직접 만들 수 없다.
		//Phone phone = new Phone();
		
		//하지만 부모 클래스를 상속받은 자식 클래스로 객체를 만들 수 있다.
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
