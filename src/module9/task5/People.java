package module9.task5;

public abstract class People {
    protected String name;
    protected int age;
    protected String profession;

    public People(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public String getProfession() {
        return this.profession;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

}
