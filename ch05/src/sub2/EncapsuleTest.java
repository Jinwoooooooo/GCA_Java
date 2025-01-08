package sub2;

/*
 * 날짜 : 2025/01/07
 * 이름 : 정진우
 * 내용 : Java 클래스 캡슐화 실습하기
 */

public class EncapsuleTest {
	public static void main(String[] args) {
		
		//Car 객체 생성 초기화
		Car sonata = new Car("소나타", "흰색", 10);
		
		//캡슐화된 속성은 외부에서 참조, 접근할 수 없음
		//sonata.name = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 10;
		
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		/*
		 <출력>
		 차량명 : 아반테
		 차량색 : 검정색
		 현재 속도 : 20
		 */
		System.out.println("-------------------------");
		
		Car avante = new Car("아반테", "검정색", 20);
		avante.speedUp(60);
		avante.speedDown(60);
		avante.show();
		
		System.out.println("-------------------------");

		avante.setColor("흰색"); //Setter를 이용해 속성 수정
		avante.show();
		
		/*
		 Account 객체 생성 초기화(캡슐화 적용)
		 <출력>
		 은행명 : 국민은행
		 계좌번호 : 110-11-1021
		 예금주 : 김유신
		 현재 잔액 : 10000
		 */
		
		Account kb = new Account("국민은행", "110-11-1021", "김유신", 90000);
		kb.deposit(100000);
		kb.withdraw(180000);
		kb.show();
		
		//김유신 -> 김유진 개명
		kb.setName("김유진");
		kb.show();
		
		/*
		 Account 객체 생성 초기화(캡슐화 적용)
		 <출력>
		 은행명 : 우리은행
		 계좌번호 : 110-11-1211
		 예금주 : 김춘추
		 현재 잔액 : 15000
		 */
		
		Account wri = new Account("우리은행", "110-11-1211", "김춘추", 100000);	
		wri.deposit(100000);
		wri.withdraw(185000);
		wri.show();
		
		//우리은행 -> 유리은행 상호변경
		wri.setBank("유리은행");
		wri.show();
		
		
		Book book = new Book("노르웨이 숲", "무라카미 하루키", "9788937434488", 5);
		
		boolean isOk = book.borrowBook();
		if(isOk) {
			System.out.println(book.getTitle() + " 도서 대출 성공");
		} else {			
			System.out.println(book.getTitle() + " 도서 대출 실패");
		}
		book.show();
		
		
		Book book1 = new Book("이것이 자바다", "신용권", "10002", 0);
		book1.show();
		if(book1.borrowBook()) {
			System.out.println(book1.getTitle() + " 도서 대출 성공");
		} else {
			System.out.println(book1.getTitle() + " 도서 대출 실패");			
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		Movie movie1 = new Movie("오펜하이머", "크리스토퍼 놀란", 8.53, 100);
		movie1.showDetails();

		if(movie1.reserveSeat()) {
			System.out.println(movie1.getTitle() + " 영화 예매 완료");
		} else {
			System.out.println(movie1.getTitle() + " 영화 예매 실패");			
		}
		movie1.showDetails();
	}
}
