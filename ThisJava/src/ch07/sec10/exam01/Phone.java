package ch07.sec10.exam01;

/*
 클래스 선언에 abstract 키워드를 붙이면 추상 클래스 선언이 된다.
 추상 클래스는 new 연산자를 이용해서 객체를 직접 만들지 못하고 상속을 통해 자식 클래스만 만들 수 있다.
 
 추상 클래스도 필드 메소드를 선언할 수 있다. 
 그리고 자식 객체가 생성될 때 super()로 추상 클래스의 생성자가 호출되기 때문에 생성자도 반드시 있어야 한다.
 */

public abstract class Phone {

	//필드 선언
	String owner;
	
	//생성자 선언
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드 선언
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
