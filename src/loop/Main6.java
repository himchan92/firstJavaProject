package loop;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("숫자를 입력하세요");
            num = sc.nextInt();
            System.out.println("입력한 숫자는 " + num + "입니다.");
        } while(num != 0);
        System.out.println("프로그램 종료합니다.");
        sc.close();
    }
}
