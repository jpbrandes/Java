public class ChristmasCard extends Card {
    public ChristmasCard(String recipient, String sender, Address address, Date date){
        super(recipient, sender, address, date);
    }

    @Override
    public String message(){
        return "Merry Christmas!";
    }

}
