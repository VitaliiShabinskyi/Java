import java.util.Arrays;

public class Main {
     /*
    План занятия
    1) Реализация распределения колоды карт
    2) Повторение
     */

    /*
    Теория
    Нужно запрогроммировать колоду карт
    Карта имеет набор атрибутов: масть и достоинство
    Создадим шаблон для карты(тип - класс) назовем его Card. Добавим в этот класс основные атрибуты для карты: масть, достоинство
    и ее старшинство(ранг), чтобы определить какая карту какую будет бить
    На основании этого шаблона(класса) можно создать конкретный экземпляр карты(объект) и заполнить ими колоду.
    Создадим колоду карт для игры в 66: нам понадобятся тузы, короли, дамы, валеты, десятки, девятки. Каждая карта имеет 4
    варианта масти, таким образом всего будет 6*4 = 24 карты.
    Создадим массив типа Card и заполним его нужными объектами(картами)
    Card[] cards = new Card[24];
     */

    /*
    Заметки
    Показать ход исполнения программы позволяет прием, который называется трассировка. Трассировка просто выводит на консоль
    состояние переменных во время исполнения программы
     */

    /*
    Задачи со звездочкой
    Усложнить реализованный проект - реализовать карточную игру
     */

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
