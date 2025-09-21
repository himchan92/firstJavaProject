package classes;

public class Car {
    static int countOfCars = 0;
    String brand;
    int year;
    String color;

    public Car() {
        System.out.println("새 차량 출구");
        this.carInfo();
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
        this.color = "white";
        this.carInfo();
    }

    public Car(String brand, int year, String color) {
        System.out.println("새 자동차 생성");
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public void carInfo() {
        System.out.println("차량정보");
        System.out.println(brand);
        System.out.println(year);
        System.out.println(color);
    }

    public static void countOfCarsInfo() {
        System.out.println("차량 수량: " + countOfCars);
    }
}
