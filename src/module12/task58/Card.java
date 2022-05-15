package module12.task58;

import java.util.HashSet;
import java.util.Objects;

public class Card {
    private final String rank;
    private final String suit;

    public Card(String rank, String suit) {
        if (rank == null || suit == null) {
            throw new IllegalArgumentException();
        }
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != this.getClass()) return false;
        if (o == this) return true;
        Card card = (Card) o;
        return this.rank.equals(card.rank) && this.suit.equals(card.suit);
    }


    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    public static void main(String[] args) {
        HashSet<Card> cards = new HashSet<>();
        cards.add(new Card("Ace", "Diamonds"));
        cards.add(new Card("Jack", "Diamonds"));
        cards.add(new Card("Queen", "Diamonds"));
        cards.add(new Card("King", "Diamonds"));
        cards.add(new Card("Joker", "Diamonds"));
        cards.add(new Card("6", "Diamonds"));
        cards.add(new Card("7", "Diamonds"));
        cards.add(new Card("8", "Diamonds"));
        cards.add(new Card("9", "Diamonds"));
        cards.add(new Card("Ace", "Hearts"));
        cards.add(new Card("Jack", "Hearts"));
        cards.add(new Card("Queen", "Hearts"));
        cards.add(new Card("King", "Hearts"));
        cards.add(new Card("Joker", "Hearts"));
        cards.add(new Card("6", "Hearts"));
        cards.add(new Card("7", "Hearts"));
        cards.add(new Card("8", "Hearts"));
        cards.add(new Card("9", "Hearts"));
        cards.add(new Card("Ace", "Clubs"));
        cards.add(new Card("Jack", "Clubs"));
        cards.add(new Card("Queen", "Clubs"));
        cards.add(new Card("King", "Clubs"));
        cards.add(new Card("Joker", "Clubs"));
        cards.add(new Card("6", "Clubs"));
        cards.add(new Card("7", "Clubs"));
        cards.add(new Card("8", "Clubs"));
        cards.add(new Card("9", "Clubs"));
        cards.add(new Card("Ace", "Spades"));
        cards.add(new Card("Jack", "Spades"));
        cards.add(new Card("Queen", "Spades"));
        cards.add(new Card("King", "Spades"));
        cards.add(new Card("Joker", "Spades"));
        cards.add(new Card("6", "Spades"));
        cards.add(new Card("7", "Spades"));
        cards.add(new Card("8", "Spades"));
        cards.add(new Card("9", "Spades"));
        cards.add(new Card("Queen", "Clubs"));
        cards.add(new Card("Ace", "Spades"));
        cards.add(new Card("Jack", "Spades"));
        cards.add(new Card("Queen", "Spades"));
        System.out.println(cards.size());


    }
}
