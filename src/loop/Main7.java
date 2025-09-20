package loop;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while(true) {
            int input = sc.nextInt();
            sum = sum + input;
            System.out.println("결과 : " + sum);
            if(sum > 10000) {
                break;
            }
        }
        System.out.println("탈출");
        sc.close();
    }
}
