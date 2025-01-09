package sub4;

/*
 * 날짜 : 2025/01/09
 * 이름 : 정진우
 * 내용 : Java 클래스 상속 실습하기
 */

class Parent {
	private int num1;
	private int num2;
	
	public Parent(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int plus() {
		return num1 + num2;
	}
}

class Child extends Parent {
	
	private int num3;
	private int num4;
	
	public Child(int num1, int num2, int num3, int num4) {
		super(num1, num2);	//부모클래스 생성자 호출
		this.num3 = num3;
		this.num4 = num4;
	}
	
	public int minus() {
		return num3 - num4;
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		
		//상속 객체 생성
		Child child = new Child(1,2,3,4);
		int result1 = child.plus();
		int result2 = child.minus();
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		//Car 상속 객체 생성
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		sonata.speedUp(80);
		sonata.turbo();
		sonata.speedDown(20);
		sonata.show();
		
		Truck bongo = new Truck("봉고","남색",0,0);
		bongo.load(100);
		bongo.speedUp(60);
		bongo.show();
		
		StockAccount kb = new StockAccount("KB증권", "123123-10-123456", "홍길동", 10000, "엔비디아", 0, 204500);
		kb.deposit(1000000);
		kb.buy(3, 204500);
		kb.show();
		
		kb.sell(2, 205000);
		kb.show();
		
		System.out.println("=====================================");
		System.out.println("=====================================");
		
		Person ps = new Person("홍길동", 25);
		ps.work();
		ps.introduce();
		
		System.out.println("=====================================");
		System.out.println("=====================================");
		
		Doctor doc = new Doctor("허준", 30, "흉부외과");
		doc.work();
		
		System.out.println("=====================================");
		System.out.println("=====================================");
		
		Engineer eg = new Engineer("아무개", 40, "음향");
		eg.work();
		
	}
}
