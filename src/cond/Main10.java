package cond;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        System.out.println("점수를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input >= 90) {
            System.out.println("A학점입니다.");
        } else {
            System.out.println("B학점입니다.");
        }
        sc.close();
    }
}
