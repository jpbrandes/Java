public class Main {
    public static void main(String[] args) {
        Address e1 = new Address("A Street", 10);
        Date d1 = new Date(1,1,2025);

        Card[] cards = new Card[5];

        cards[0] = new BirthdayCard("João", "Maria", e1, d1);
        cards[1] = new BirthdayCard("Ana", "Carlos", e1, d1);
        cards[2] = new ChristmasCard("Pedro", "Júlia", e1, d1);
        cards[3] = new BirthdayCard("Lucas", "Fernanda", e1, d1);
        cards[4] = new ValentinesCard("Marcos", "Paula", e1, d1);

        for (Card c : cards){
            c.showMessage();
            System.out.println("-----------------");
        }
    }
}
