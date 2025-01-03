package ch04.sec07;

public class BreakExample {
	public static void main(String[] args) {
		
		int count = 0;
		
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			} else {
				count++;
			}
		}
		System.out.println("6이 아닌 다른 숫자가 나온 횟수 : " + count);
		System.out.println("프로그램 종료");
	}
}
