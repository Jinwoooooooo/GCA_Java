package sub6;

/*
 * 날짜 : 2025/01/10
 * 이름 : 정진우
 * 내용 : Java 다형성 실습하기
 * 
 * 다형성(Polymorphism)
 *  - 상속 관계에서 부모 클래스의 기능이 자식 클래스에서 다양한 기능으로 변하는 특징
 *  - 객체 타입 선언을 부모 클래스 타입으로 선언
 *  - 다형성을 활용해서 프로그래밍의 중복을 줄이고 통일성과 유연성을 향상
 */

public class PolyTest {
	public static void main(String[] args) {
			
		//다형성을 적용한 객체 생성(업캐스팅)	부모를 바라본다고 해서 업캐스팅.
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a1.hunt();
		
		a2.move();
		a2.hunt();
		
		a3.move();
		a3.hunt();
		
		//다운캐스팅
		Tiger tiger = (Tiger)a1;
		Eagle eagle = (Eagle)a2;
		Shark shark = (Shark)a3;
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		//타입 비교연산
		if(a1 instanceof Tiger) {
			System.out.println("a1은 Tiger입니다.");
		} else if(a2 instanceof Eagle) {
			System.out.println("a2는 Eagle입니다.");			
		} else if(a3 instanceof Shark) {
			System.out.println("a3는 Shark입니다.");						
		}
		
		//다형성을 활용한 객체 배열
		Animal arr[] = {tiger, eagle, shark};
		
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
		
		Pet dog = new Dog();
		Pet cat = new Cat();
		
		printSound(dog);
		printSound(cat);
		
	}
	
	public static void printSound(Pet pet) {
		pet.makeSound();
	}
}
