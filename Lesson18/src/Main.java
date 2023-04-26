import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.generateDeck();
        deck.distributeCard();
        Card[] player1 = deck.getPlayer1();
        Card[] player2 = deck.getPlayer2();

//        System.out.println("Player 1:");
//        for (int i = 0; i < player1.length; i++) {
//            System.out.println(player1[i]);
//        }
//        System.out.println("Player 2:");
//        for (int i = 0; i < player2.length; i++) {
//            System.out.println(player2[i]);
//        }

//        System.out.println("\nОстаток колоды");
//        deck.display();

        Player vlad = new Player("Vlad", player1);          //
        Player masha = new Player("Masha", player2);

        System.out.println("\nКолода Влада:");
        vlad.displayCards();

        System.out.println("\nКолода Маши:");
        masha.displayCards();

        vlad.makeMove(1);

        masha.makeMove(4);

        System.out.println("\nКолода Влада:");
        vlad.displayCards();

        System.out.println("\nКолода Маши:");
        masha.displayCards();

    }
}
