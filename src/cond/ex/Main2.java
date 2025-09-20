package cond.ex;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        switch (text) {
            case "a": case "b": case "c":
                System.out.println(text);
                break;
            default:
                System.out.println("알파벳이 없습니다.");
                break;
        }
        sc.close();
    }
}
