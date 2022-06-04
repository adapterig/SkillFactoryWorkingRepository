package module15.task1545;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        System.out.println(guessNumber(3).orElse("Вы не угаладали!"));
    }
    static Optional<String> guessNumber(int guess) {
        if (guess < 1 || guess > 5) {
            throw new IllegalStateException();
        } else if ((int) (Math.random() * 5) == guess) {
            return Optional.of("Поздравляем! Вы угадали значение!");
        } else return Optional.empty();
    }
}
