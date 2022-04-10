package module9.task5;

public class Teacher extends People {
    String subject;

    public Teacher(String name, int age, String profession, String subject) {
        super(name, age, profession);
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    public String giveALesson() {
        return "The lesson was ended";
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getProfession() {
        return super.getProfession();
    }

    @Override
    public String getName() {
        return super.name;
    }

}
