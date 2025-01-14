package sub1;

/*
 * 날짜 : 2025/01/14
 * 이름 : 정진우
 * 내용 : Java Object 클래스 실습하기
 */

public class ObjectTest { //암묵적으로 Object 클래스를 상속
	public static void main(String[] args) {
		
		//자바 최상위 클래스 Object로 다형성 구현
		Object a1 = new Apple("한국", 3000);
		Object a2 = new Apple("일본", 2000);
		
		System.out.println(a1.toString());	//toString() 메소드를 직접 호출
		System.out.println(a2);	//toString() 메소드를 간접 호출
		
		//객체 비교
		if(a1 == a2) {	//Stack에 저장되는 주소를 비교
			System.out.println("객체 a1, a2는 참조변수 주소값이 같다");
		} else {
			System.out.println("객체 a1, a2는 참조변수 주소값이 다르다.");
		}
		
		if(a1.equals(a2)) {	//Heap에 저장되는 인스턴스(객체)를 비교
			System.out.println("객체 a1, a2가 인스턴스가 서로 같다");
		} else {
			System.out.println("객체 a1, a2가 인스턴스가 서로 다르다.");
		}
		
		//객체 해시값
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
	}
}
