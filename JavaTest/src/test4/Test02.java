package test4;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class NotFoundException extends Exception {
	public NotFoundException() {
		super("해당하는 숫자를 찾을 수 없습니다.");
	}
}

public class Test02 {
	public static void main(String[] args) {
		
		int[] arr = {2, 4, 6, 8, 10};
		
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("찾을 숫자 입력 : ");
			int find = sc.nextInt();
			searchArray(find, arr);
			System.out.println("해당하는 숫자 찾음!");
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하세요.");
		}
		
		
		System.out.println("프로그램 정상 종료...");
	}
	
	public static void searchArray(int find, int[] arr) throws NotFoundException {
		
		for(int i : arr) {
			if(i == find) {
				return;
			}
		}
		throw new NotFoundException();
	}
}
