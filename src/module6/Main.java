package module6;

public class Main {


    public static void main(String[] args) {
/*
Make the class Battle (add your code there)
to allow monsters to fight
*/

        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Zombie("Bob"));
        battle.add(new Zombie("Eve"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new GiantSnake("Son of Kaa"));

        battle.add(new Zombie("Noname"));
        battle.add(new GiantSnake("Noname"));

        battle.start();
        Object o = 3;

/*
This fragment of code has to output

Monster Alice the Zombie was created
Monster Bob the Zombie was created
Monster Eve the Zombie was created
Monster Kaa the GiantSnake was created
Monster Son of Kaa the GiantSnake was created
Monster Noname the Zombie was created
No more monsters!
Monster Noname the GiantSnake was created
No more monsters!
Monster Alice the Zombie attacked with damage 5
Raaaauuughhhh Alice the Zombie growled
Monster Bob the Zombie attacked with damage 5
Raaaauuughhhh Bob the Zombie growled
Monster Eve the Zombie attacked with damage 5
Raaaauuughhhh Eve the Zombie growled
SSSSSS Kaa the GiantSnake growled
Monster Kaa the GiantSnake attacked with damage 5
     ...and hid in the grass
SSSSSS Son of Kaa the GiantSnake growled
Monster Son of Kaa the GiantSnake attacked with damage 5
     ...and hid in the grass

But the Buttle class has ony one println "No more monsters!"

*/

    }

}

