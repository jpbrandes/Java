package Interfaces2;

public class Student {

    private String name;
    private int average;

    public Student() {
    }

    public void setName(String name) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "The name cannot be empty."
            );
        }

        this.name = name.trim();
    }

    public void setAverage(int average) {

        if (average < 0 || average > 10) {
            throw new IllegalArgumentException(
                    "The average must be between 0 and 10."
            );
        }

        this.average = average;
    }

    public String getName() {
        return name;
    }

    public int getAverage() {
        return average;
    }

    @Override
    public String toString() {

        return "===== STUDENT DATA ====="
                + "\nName: " + name
                + "\nAverage: " + average;
    }
}
