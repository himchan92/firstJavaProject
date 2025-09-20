package loop;

public class Main4 {
    public static void main(String[] args) {
        for(int i = 2; i <= 9; i++) {
            int value;
            System.out.println("--- " + i + "단 ---");
            for(int j = 1; j <= 9; j++) {
                value = i * j;
                System.out.println(i + " x " + j + " = " + value);
            }
        }
    }
}
