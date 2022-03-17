package module6;

import java.util.Locale;

public class Zombie extends Monster {
    public static String scream = "Raaaauuughhhh";
    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }
    // Overload this method to make SCREAMS

    public void growl(boolean isLoud){
        if (isLoud){
            System.out.print(scream.toUpperCase());
        }else {
            System.out.print(scream);
        }
        super.growl();
    }

    @Override
    public void attack(){
        super.attack();
        growl();
    }

}
