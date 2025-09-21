package inherit;

public class Cat extends Animal {
    String breed;
    String name;
    int age;

    public void bark() {
        System.out.println(name + "가 야옹거립니다.");
    }
}
