package InventorySystemEnhanced;

public class DateISE {

    public int day;
    public int month;
    public int year;

    public DateISE(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public DateISE(int day, int month) {
        this.day = day;
        this.month = month;
        this.year = 2026; // Default year
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

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Invalid day. The day must be between 1 and 31.");
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) { // Added validation for day and month.
            this.month = month;
        } else {
            System.out.println("Invalid month. The month must be between 1 and 12.");
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", this.day, this.month, this.year);
    }
}

/* The code above is an override. An override is used to replace a method from the parent class, in this case the toString() method from the Object class, which is the parent class of all classes in Java.
The toString() method is used to return a string representation of an object, and here we are overriding it to return the date in the "dd/MM/yyyy" format. */
