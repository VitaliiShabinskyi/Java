import java.util.Random;

public class Deck {
    private Card[] cards = new Card[24];

    private final String[] COUNT = {"Бубны", "Черви", "Пики", "Крести"};
    private final String[] COUNT_VALUE = {"Девятка", "Десятка", "Валет", "Дама", "Король", "Туз"};
    private int bound = 0;

    private Random random = new Random();
    private int[] position = new int[24];

    private Card[] player1 = new Card[6];
    private Card[] player2 = new Card[6];

    public void generateDeck() {
        for (int i = 0; i < COUNT.length; i++) {
            for (int j = 0; j < COUNT_VALUE.length; j++) {
                cards[bound] = new Card(COUNT[i], COUNT_VALUE[j]);
                bound++;
            }
        }
    }

    public void distributeCard() {
        for (int i = 0; i < 6; i++) {
            int pos = random.nextInt(24);
            if (cards[pos] == null) {
                i--;
            } else {
                player1[i] = cards[pos];
                cards[pos] = null;
            }
//            while (position[pos] != 0 && cards[pos] != null) {
//                pos = random.nextInt(24);
//            }
//            position[pos] = pos;
//            player1[i] = cards[pos];
//            cards[pos] = null;
        }
        for (int i = 0; i < 6; i++) {
            int pos = random.nextInt(24);
            if (cards[pos] == null) {
                i--;
            } else {
                player2[i] = cards[pos];
                cards[pos] = null;
            }
//            while (position[pos] != 0 && cards[pos] != null) {
//                pos = random.nextInt(24);
//            }
//            position[pos] = pos;
//            player2[i] = cards[pos];
//            cards[pos] = null;
        }
    }

    public Card[] getPlayer1() {
        return player1;
    }

    public Card[] getPlayer2() {
        return player2;
    }

    public void display() {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) {
                System.out.println("Карта выдана");
            } else {
                System.out.println(cards[i].toString());
            }
        }
    }


}
