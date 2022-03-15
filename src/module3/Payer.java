package module3;

public class Payer {
    private String surname;
    private String name;
    private String address;
    private String cardNumber;

    public Payer(String surname, String name, String address, String cardNumber) {
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    public String toString() {
        return this.surname + " " + this.name + ", address: " + this.address + ", card: " + this.cardNumber;
    }
}