public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int day){
        if (day >= 1 && day <= 31) {
            this.day = day;
        }
    }

    public void setMonth(int month){
        if (month >= 1 && month <= 12){
            this.month = month;
        }
    }

    public void setYear(int year){
        this.year = year;
    }
    
    @Override
    public String toString(){
        return getDay() + "/" +  getMonth() + "/" + getYear();
        }
}
