package module8;

import java.util.ArrayList;

public class Player extends Human {
    Backpack backpack = new Backpack();

    public Backpack getBackpack() {
        return backpack;
    }

    Player(String name) {
        super(name);

    }

    public void take(String item) {
        backpack.items.add(item);
    }

    class Backpack {
        ArrayList<String> items = new ArrayList<String>();

        @Override
        public String toString() {
            StringBuilder returnString = new StringBuilder();
            boolean firstItem = true;
            for (String string : items) {
                if (!firstItem) {
                    returnString.append(",");
                } else {
                    firstItem = false;
                }
                returnString.append(string);
            }
            if (items.size() < 1) {
                return "the backpack is empty";
            } else {
                returnString.append(" in the backpack");
                return returnString.toString();
            }
        }
    }
}