package loop;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int value;
        Scanner sc = new Scanner(System.in);
        System.out.print("몇단을 출력할까요");
        int dan = sc.nextInt();

        for(int i = 1; i <= 9; i++) {
            value = dan * i;
            System.out.println(dan + " x " + i + " = " + (value));
        }
        sc.close();
    }
}
