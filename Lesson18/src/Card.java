public class Card {
    private String suit;
    private String value;
    private int cost;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Масть: " + suit +
                " \tДостоинство: " + value;
    }
}
