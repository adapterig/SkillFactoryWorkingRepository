package module3;

public class Mage {
    String name;
    int level;
    int damage;
    String type;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    public String getInfo() {
        return this.name + ", " + this.level + ", " + this.damage + ", " + this.type;
    }

    public String fight(Mage mage) {
        if (this.type.equals("fire") && mage.type.equals("ice")) {
            return this.name;
        } else if (this.type.equals("ice") && mage.type.equals("earth")) {
            return this.name;
        } else if (this.type.equals("earth") && mage.type.equals("fire")) {
            return this.name;
        } else if (this.type.equals("fire") && mage.type.equals("earth")) {
            return mage.name;
        } else if (this.type.equals("ice") && mage.type.equals("fire")) {
            return mage.name;
        } else if (this.type.equals("earth") && mage.type.equals("ice")) {
            return mage.name;
        } else if (this.type.equals(mage.type)) {
            if (this.level > mage.level) {
                return this.name;
            } else if (this.level < mage.level) {
                return mage.name;
            } else {
                if (this.damage > mage.damage) {
                    return this.name;
                } else if (this.damage < mage.damage) {
                    return mage.name;
                } else {
                    return "draw";
                }

            }
        }
        return "?";
    }
}
