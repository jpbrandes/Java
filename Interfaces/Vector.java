import javax.swing.JOptionPane;

public class Vector {

    private Person[] personObjects;

    // Constructor
    public Vector(int size) {
        personObjects = new Person[size];
    }

    // Add person
    public void addPerson(Person person, int position) {

        if (position >= 0 && position < personObjects.length) {

            personObjects[position] = person;

        } else {

            JOptionPane.showMessageDialog(null,
                    "Invalid position!");
        }
    }

    // Get person
    public Person getPerson(int position) {

        if (position >= 0 && position < personObjects.length) {

            return personObjects[position];

        } else {

            JOptionPane.showMessageDialog(null,
                    "Invalid position!");

            return null;
        }
    }

    // Display information
    public void displayInformation() {

        String text = "";

        for (int i = 0; i < personObjects.length; i++) {

            if (personObjects[i] != null) {

                text += "Position " + i + "\n";
                text += personObjects[i].toString();
                text += "\n\n";

            } else {

                text += "Position " + i + ": Empty\n\n";
            }
        }

        JOptionPane.showMessageDialog(null, text);
    }
}
