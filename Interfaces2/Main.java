import javax.swing.JOptionPane;

public class Main {

    private static final int VECTOR_SIZE = 2;

    public static void main(String[] args) {

        Student[] students = createStudentArray();

        runSystem(students);
    }

    public static void runSystem(Student[] students) {

        boolean registrationCompleted = false;

        while (!registrationCompleted) {

            try {

                int index = requestIndex(students);

                Student student = students[index];

                fillName(student);

                int average = calculateAverage();

                student.setAverage(average);

                displayStudent(student);

                registrationCompleted = true;

            } catch (NumberFormatException e) {

                showError(
                        "Please enter only whole numbers."
                );

            } catch (ArrayIndexOutOfBoundsException e) {

                showError(
                        "Invalid index."
                );

            } catch (NullPointerException e) {

                showError(
                        "There is no object at this position."
                );

            } catch (ArithmeticException e) {

                showError(
                        "The number of exams must be greater than zero."
                );

            } catch (IllegalArgumentException e) {

                showError(
                        e.getMessage()
                );

            } catch (Exception e) {

                showError(
                        "Operation canceled by the user."
                );
            }
        }
    }

    public static Student[] createStudentArray() {

        Student[] array = new Student[VECTOR_SIZE];

        array[0] = new Student();

        return array;
    }

    public static int requestIndex(Student[] students) {

        int index = readInteger(
                "Enter the array index (0 or 1):"
        );

        if (index < 0 || index >= students.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (students[index] == null) {
            throw new NullPointerException();
        }

        return index;
    }

    public static void fillName(Student student) {

        String name = JOptionPane.showInputDialog(
                "Enter the student's name:"
        );

        if (name == null) {
            throw new RuntimeException();
        }

        student.setName(name);
    }

    public static int calculateAverage() {

        int totalScore = readInteger(
                "Enter the total score:"
        );

        int numberOfExams = readInteger(
                "Enter the number of exams:"
        );

        if (numberOfExams <= 0) {
            throw new ArithmeticException();
        }

        return totalScore / numberOfExams;
    }

    public static int readInteger(String message) {

        String input = JOptionPane.showInputDialog(
                message
        );

        if (input == null) {
            throw new RuntimeException();
        }

        return Integer.parseInt(input);
    }

    public static void displayStudent(Student student) {

        JOptionPane.showMessageDialog(
                null,
                student.toString()
        );
    }

    public static void showError(String message) {

        JOptionPane.showMessageDialog(
                null,
                message,
                "ERROR",
                JOptionPane.ERROR_MESSAGE
        );
    }
}
