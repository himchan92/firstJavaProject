package calc.ex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. --> ");
        int num = sc.nextInt();
        System.out.print("실수를 입력하세요. --> ");
        double num2 = sc.nextDouble();
        System.out.println(num + (int)num2);
        System.out.println(num - num2);
        System.out.println(num * num2);
        System.out.println(num / (int)num2);
        sc.close();
    }
}
