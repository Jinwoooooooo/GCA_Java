package step2;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();

        h += time/60; //시간 = 시간 + 타이머시간과 60을 나눈 몫
        m += time%60; // 분 = 분 + 타이머시간과 60을 나눈 나머지

        if (m >= 60) {
            h += 1;
            m -= 60;
        }

        if (h >= 24) {
            h %= 24;
        }
        System.out.print(h + " " + m);
    }
}
