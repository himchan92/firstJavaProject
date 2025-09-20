package cond;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        System.out.println("점수를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        switch (score) {
            case(90):
                System.out.println("A학점");
                break;
            case(80):
                System.out.println("B학점");
                break;
            case(70):
                System.out.println("C학점");
                break;
            default:
                System.out.println("재수강..");
                break;
        }
        sc.close();
    }
}
