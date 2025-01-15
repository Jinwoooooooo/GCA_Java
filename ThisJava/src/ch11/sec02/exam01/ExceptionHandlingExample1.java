package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {

	public static void printLength(String data) {
		int result = data.length();	//data가 null일 경우 NullPointerException 발생
		System.out.println("문자 수 : " + result);
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
}
