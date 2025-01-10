package sub7;

/*
 * 날짜 : 2025/01/10
 * 이름 : 정진우
 * 내용 : Java 추상클래스 실습하기
 */

public class AbstractTest {
	public static void main(String[] args) {
		
		//추상클래스는 객체 생성 X
		//Animal animal = new Animal();
		
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		Animal shark = new Shark();
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();

		shark.move();
		shark.hunt();
		
	}
}
