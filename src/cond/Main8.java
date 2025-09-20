package cond;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        System.out.println("양수를 입력");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num > 0) {
            if(num % 2 == 1) {
                System.out.println("홀수");
            }
            else {
                System.out.println("짝수");
            }
        }
        else {
            System.out.println("양수를 입력하세요");
        }
        sc.close();
    }
}
