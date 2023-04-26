public class Player {
    private String name;
    private Card[] cards;

    public Player(String name, Card[] cards) {
        this.name = name;
        this.cards = cards;
    }

    public void displayCards() {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) {
                System.out.println("Карты нет");
            } else {
                System.out.println(cards[i].toString());
            }

        }
    }

    public void makeMove(int number) {
        System.out.println(name + " сделал ход картой " + cards[number]);
        cards[number] = null;
    }
}
