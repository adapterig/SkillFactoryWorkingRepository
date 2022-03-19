package module6;

public class Soldier {

    String name;
    int price;
    String phrase;

    public Soldier(String name){
        this.name = name;
        this.price = 135;
        this.phrase = "Будет исполнено";
    }

    public void attack() {
        System.out.println(this.name + " атакует!");
    }

    public void move() {
        System.out.println(this.name + " передвигается в указанную точку");
    }

    public void sound(){
        System.out.println(this.name + " говорит: " + phrase);
    }
}
