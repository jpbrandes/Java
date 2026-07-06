public class ValentinesCard extends Card {
    public ValentinesCard(String recipient, String sender, Address address, Date date){
        super(recipient, sender, address, date);
    }

    @Override
    public String message(){
        return "Happy Valentine's Day!";
    }
}
