package ch13.sec02.exam03;

public class GenericExample {
	public static void main(String[] args) {
		
		Box<String> box1 = new Box<>();
		box1.content = "100";
		
		Box<String> box2 = new Box<>();
		box2.content = "100";
		
		boolean result1 = box1.compare(box2); //박스의 내용물 비교 (String에서 재정의된 equals() 사용)
		System.out.println("result1 : " + result1);
	}
}
