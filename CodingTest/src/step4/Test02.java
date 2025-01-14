package step4;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			int num = sc.nextInt(); 
			a[i] = num;
		}
		for(int j=0; j<a.length; j++) {
			if(a[j] < x) {
				
			}
			System.out.println(a[j]);
		}
	}
}
