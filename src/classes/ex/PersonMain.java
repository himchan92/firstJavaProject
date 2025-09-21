package classes.ex;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("김길벗", 21);
        person.displayInfo();
        person.setName("이코천");
        person.setAge(22);
        System.out.println("수정이름: " + person.getName());
        System.out.println("수정나이: " + person.getAge());
    }
}
