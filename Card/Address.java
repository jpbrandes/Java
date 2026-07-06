public class Address {
    private String street;
    private int houseNum;
    private String cityName;

    public Address (String street, int houseNum, String cityName){
        this.street = street;
        this.houseNum = houseNum;
        this.cityName = cityName;
    }

    public Address (String street, int houseNum){
        this.street = street;
        this.houseNum = houseNum;
        this.cityName = null;
    }

    // Getter Methods
    public String getStreet(){
        return this.street;
    }

    public int getHouseNum(){
        return this.houseNum;
    }

    public String getCityName(){
        return this.cityName;
    }

    // Setter Methods
    public void setStreet(String street){
        this.street = street;
    }

    public void setHouseNum(int houseNum){
        this.houseNum = houseNum;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString(){
        return "Address: " + getStreet() + ", " +  getHouseNum() + ", " + getCityName() + ".";
        }
}
