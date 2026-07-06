package Interfaces;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        // Ask how many people will be registered
        int quantity = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "How many people would you like to register?")
        );

        // Create vector with the specified size
        Vector vector = new Vector(quantity);

        // Loop
        for (int i = 0; i < quantity; i++) {

            JOptionPane.showMessageDialog(null,
                    "Registering person " + (i + 1));

            // Data input
            String name = JOptionPane.showInputDialog(
                    "Enter the name:");

            String salaryStr = JOptionPane.showInputDialog(
                    "Enter the salary:");

            String codeStr = JOptionPane.showInputDialog(
                    "Enter the code:");

            try {

                // Conversion
                double salary = Double.parseDouble(salaryStr);

                int code = Integer.parseInt(codeStr);

                // Create person
                Person person = new Person(
                        name,
                        salary,
                        code
                );

                // Add to vector
                vector.addPerson(person, i);

            } catch (NumberFormatException error) {

                JOptionPane.showMessageDialog(null,
                        "Error: Please enter valid numbers!");

                // Go back one position in the loop
                i--;
            }
        }

        // Display all registered people
        vector.displayInformation();
    }
}
