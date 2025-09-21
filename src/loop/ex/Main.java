package loop.ex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("자판기 프로그램 시작!!");
        int money = 0;
        int select = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("현재 투입된 금액: " + money + "원");
            System.out.println("1.콜라(1,500원)");
            System.out.println("1.오렌지주스(2,000원)");
            System.out.println("3.생수(1,000원)");
            System.out.println("4.종료");
            System.out.print("음료를 고르세요.(번호입력):");
            select = sc.nextInt();
            if(select == 4) {
                System.out.println("프로그램 종료");
                break;
            }

            switch (select) {
                case 1:
                    money = money + 1500;
                    break;
                case 2:
                    money = money + 2000;
                    break;
                case 3:
                    money = money + 1000;
                    break;
                default:
                    System.out.println("다시선택하세요");
                    break;
            }
        }
        sc.close();
    }
}
