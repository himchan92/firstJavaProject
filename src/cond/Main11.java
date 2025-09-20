package cond;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        System.out.println("점수입력");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        String grade = (input >= 90) ? "A" : "B";
        System.out.println(grade + "학점입니다.");
        sc.close();
    }
}
