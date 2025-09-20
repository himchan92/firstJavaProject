package cond;

public class Main4 {
    public static void main(String[] args) {
        int score = 80;
        if(score >= 90) {
            System.out.println("A학점");
        }
        else if(score >= 80 && score < 90) {
            System.out.println("B학점");
        }
        else if(score >= 70 && score < 80) {
            System.out.println("C학점");
        }
        else {
            System.out.println("D학점입니다.");
        }
    }
}
