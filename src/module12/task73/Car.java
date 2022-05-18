package module12.task73;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private final String brand;
    private final long serialNumber;

    public Car(String brand, long serialNumber) {
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return serialNumber == car.serialNumber &&
                brand.equals(car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    @Override
    public String toString() {
        return brand;
    }

    @Override
    public int compareTo(Car o) {
        return brand.compareTo(o.brand);
    }
    /*public static void main(String[] args) {
        Set<Car> cars = new TreeSet<>(Comparator.reverseOrder()); // строка 1
        cars.add(new Car("Toyota", 243423424L)); // строка 2
        cars.add(new Car("Subaru", 112313213L));
        System.out.println(cars);
    }*/
}
