package sub3;

public class Calc {
	
	//------------싱글톤 공식.------------
	//싱글톤 객체 이름은 보통 instance
	//클래스 변수 instance는 MethodArea에 즉, 메모리에 가장 먼저 올라가 있는 변수.
	private static Calc instance = new Calc(); //정적 변수, 클래스 변수는 클래스 수준에서 하나의 변수만 존재하며, 모든 객체가 이를 공유한다.
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}	//다른 클래스에서 객체로 생성할 수 없게함.
	//---------------------------------
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}
}
