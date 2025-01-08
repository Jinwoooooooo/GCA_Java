package sub3;

public class Increment {
	
	private int num1; 			//일반 변수, 인스턴스 변수는 객체당 하나씩 존재한다.
	private static int num2;	//정적 변수, 클래스 변수는 클래스 수준에서 하나의 변수만 존재하며, 모든 객체가 이를 공유한다.
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
	
	
}
