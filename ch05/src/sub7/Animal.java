package sub7;

//추상클래스 - 추상메소드를 갖는 클래스, 상속을 위한 클래스
public abstract class Animal {
	
	//추상메소드 - 내용이 없는 미완성 메소드, 오버라이드를 위한 메소드.
	public abstract void move();
	
	//오버라이드를 위해 내용이 없는 메소드 선언
	public void hunt() {};
}
