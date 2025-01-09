package sub5;

/*
 * 날짜 : 2025/01/09
 * 이름 : 정진우
 * 내용 : Java Overriding 실습하기
 */

class AAA {
	
	public void method2() {
		System.out.println("AAA : Method2...");
	}
	
	public void method3() {
		System.out.println("AAA : Method3...");	
	}
}

class BBB extends AAA {
	
	public void method1() {
		System.out.println("BBB : Method1...");
	}
	
	@Override
	public void method2() {
		System.out.println("BBB : Method2...");
	}
	
	//Overload
	public void method3(int a) {
		System.out.println("BBB : Method3...");	
	}
}

class CCC extends BBB {
	
	@Override
	public void method1() {
		System.out.println("CCC : Method1...");
	}
	
	@Override
	public void method2() {
		System.out.println("CCC : Method2...");
	}
	
	//Overload
	public void method3(int a, int b) {
		System.out.println("CCC : Method3...");	
	}
}

public class OverridingTest {
	public static void main(String[] args) {
		
		//오버라이드 메소드 실습
		CCC c = new CCC();
		c.method1();		//부모클래스의 메소드와 자식클래스 메소드의 method1은 같은 메소드(구분할 수 없음)이기 때문에 CCC의 method1을 호출
		c.method2();		//부모클래스의 메소드와 자식클래스 메소드의 method1은 같은 메소드(구분할 수 없음)이기 때문에 CCC의 method1을 호출
		c.method3();		//매개변수를 받지 않는 부모클래스 AAA의 method3 메소드
		c.method3(1);		//매개변수 1개를 받는 부모클래스 BBB의 method3 메소드
		c.method3(1, 2);	//매개변수를 2개를 받는 CCC클래스 자신의 method3 메소드
		
		//method3는 매개변수로 구분이 된다.
		
		System.out.println();
		System.out.println("=========================");
		System.out.println();
		
		//Car 상속 객체 오버라이드 메소드
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		Truck bongo = new Truck("봉고","흰색", 0, 0);
		
		sonata.speedUp(200);
		sonata.show();
		System.out.println();
		System.out.println("=========================");
		System.out.println();
		bongo.load(10);
		bongo.speedUp(80);
		bongo.show();
	}
}
