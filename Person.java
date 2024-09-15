import java.util.Scanner;

public class Person {
    private String userName;
    private String SSN;

    // Getter for ID
    private String getId() {
        return SSN + "-" + userName;
    }

    public String getUserName() {
        return userName;
    }

    public boolean isSamePerson(Person p) {
        return p.getId().equals(this.getId());
    }

    // Method to take input from user
    public void setInput(String name, String ssn) {
        this.userName = name;
        this.SSN = ssn;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Create an array to hold 'n' Person objects
        Person[] persons = new Person[n];

        // Loop to take inputs for 'n' persons
        for (int i = 0; i < n; i++) {
            persons[i] = new Person();
            System.out.print("Enter name for person " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter SSN for person " + (i + 1) + ": ");
            String ssn = scanner.nextLine();
            persons[i].setInput(name, ssn);
        }

        // Check for first person example (can modify as needed)
        System.out.println("First person info: ");
        System.out.println("Name: " + persons[0].getUserName());
        System.out.println("Is same person: " + persons[0].isSamePerson(persons[0]));

        scanner.close();
    }
}
