package inherit;

public class Dog extends Animal {
    String breed;
    String name;
    int age;

    public void roll() {
        System.out.println(name + "가 바닥을 구룹니다.");
    }
}
