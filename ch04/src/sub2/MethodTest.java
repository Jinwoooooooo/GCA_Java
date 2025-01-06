package sub2;

/*
 * 날짜 : 2025/01/06
 * 이름 : 정진우
 * 내용 : Java 메서드 실습하기
 */

public class MethodTest {
	
	//Main 메서드 : 자바 프로그램의 시작 메서드(진입점)
	public static void main(String[] args) {
		
		//메서드 호출(실행)
		int y1 = fx(1);
		int y2 = fx(2);
		int y3 = fx(3);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		//지역변수와 메서드
		int total1 = sum(1, 10);
		int total2 = sum(1, 100);
		
		System.out.println("total1 : " + total1);
		System.out.println("total2 : " + total2);
	}
	
	//메서드 정의
	//Main 메서드에서 호출해야하기 때문에 Main과 같이 static 키워드 맞춰줌
	public static int fx(int x) { //접근권한, 반환타입, 메서드명(매개변수)
		int y = 2 * x + 3;
		
		return y; //반환값
	}
	
	public static int sum(int start, int end) {
		int total = 0; //지역변수 : 메서드내에 선언한 변수, 메서드가 종료되면 변수 해제
		
		for(int k=start; k<=end; k++) {
			total += k;
		}
		
		return total;
	}
	
}
