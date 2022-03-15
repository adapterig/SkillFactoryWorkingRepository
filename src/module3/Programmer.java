package module3;

public class Programmer {
    String name;
    String company;
    String position;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";

    }

    public String getPosition() {
        return this.position;
    }

    public void work() {
        switch (this.position) {
            case "intern":
                this.position = "junior";
                break;
            case "junior":
                this.position = "middle";
                return;
            case "middle":
                this.position = "senior";
                break;
            case "senior":
                this.position = "lead";
                break;
            default:
                break;
        }
    }
}
