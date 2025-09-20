package cond;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        System.out.print("학년을 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        if(grade == 4) {
            Scanner gradeScore = new Scanner(System.in);
            System.out.print("점수를 입력하세요.");
            int score = gradeScore.nextInt();

            if(score >= 90) {
                System.out.println("장학금 지급 대상");
            }
            else {
                System.out.println("장학금 지급대상이 아닙니다.");
            }
            gradeScore.close();
        } else {
            System.out.println("장학금 지급 학년이 아닙니다.");
        }
        sc.close();
    }
}
