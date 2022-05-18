package module12.addtask1;

import java.util.*;

public class Pet implements Comparable<Pet> {
    public final String animalBreed;
    public final String name;
    private double weight;

    public double getWeight() {
        return weight;
    }

    public Pet(String animalBreed, String name, double weight) {
        if (animalBreed == null || name == null || weight <= 0 || animalBreed == "" || name == "") {
            throw new IllegalArgumentException("wrong name or animalBreed or weight");
        }
        this.animalBreed = animalBreed;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Pet p) {
        return (int) Math.signum(this.weight - p.getWeight());
    }

    @Override
    public String toString() {
        return this.name + " " + this.animalBreed + " " + this.weight;
    }

    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("Cat", "Barsik", 2.7));
        pets.add(new Pet("Dog", "Bobik", 5.8));
        pets.add(new Pet("Parrot", "Kesha", 0.5));
        pets.add(new Pet("Dog", "Bob", 2.2));
        pets.add(new Pet("Pig", "Hrew", 9.4));
        pets.add(new Pet("Spider", "William", 0.06));
        pets.add(new Pet("Mouse", "Lu", 0.1));

        System.out.println(pets);
        Collections.sort(pets);
        System.out.println(pets);
        Collections.sort(pets, new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return o1.name.length() - o2.name.length();
            }
        });
        System.out.println(pets);
    }
}
