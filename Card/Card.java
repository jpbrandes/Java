public abstract class Card {
    private String recipient;
    private String sender;
    private Address address;
    private Date date;

    public Card (String recipient, String sender, Address address, Date date){
        this.recipient = recipient;
        this.sender = sender;
        this.address = address;
        this.date = date;
    }

    public String getRecipient(){
        return this.recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSender(){
        return this.sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Address getAddress(){
        return this.address;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public Date getDate(){
        return this.date;
    }

    public void setDate(Date date){
        this.date = date;
    }


    public void showMessage(){
        System.out.println("To: " + recipient);
        System.out.println("From: " + sender);
        System.out.println("Address: " + address);
        System.out.println("Date: " + date);
        System.out.println("Message: " + message());
    }

    public abstract String message();

}
