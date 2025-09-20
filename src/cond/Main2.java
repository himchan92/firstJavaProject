package cond;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 1) {
            System.out.println("홀수");
        } else {
            System.out.println("짝수");
        }
        sc.close();
    }
}