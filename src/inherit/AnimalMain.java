package inherit;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breed = "푸들";
        dog.name = "밍키";
        dog.age = 10;
        System.out.println(dog.breed + "이고 나이는 " + dog.age + "살이고 이름은 " + dog.name);
        Cat cat = new Cat();
        cat.name ="찬이";
        cat.age = 11;
        System.out.println(cat.name + "이름이고 나이는 " + cat.age);
    }
}
