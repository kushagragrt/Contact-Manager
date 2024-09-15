import java.util.Scanner;

public class ContactsManager {
    Contact[] myFriends;
    int friendsCount;

    ContactsManager() {
        friendsCount = 0;
        myFriends = new Contact[500];
    }

    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactsManager myContactsManager = new ContactsManager();

        System.out.print("Enter the number of contacts: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Loop to add 'n' contacts
        for (int i = 0; i < n; i++) {
            Contact contact = new Contact();
            System.out.print("Enter name for contact " + (i + 1) + ": ");
            contact.name = scanner.nextLine();
            System.out.print("Enter phone number for contact " + (i + 1) + ": ");
            contact.phoneNumber = scanner.nextLine();
            System.out.print("Enter email for contact " + (i + 1) + ": ");
            contact.email = scanner.nextLine();
            myContactsManager.addContact(contact);
        }

        // Now search for a contact and display the phone number
        System.out.print("Enter the name of the contact to search: ");
        String searchName = scanner.nextLine();
        Contact result = myContactsManager.searchContact(searchName);
        if (result != null) {
            System.out.println("Phone number: " + result.phoneNumber);
        } else {
            System.out.println("Contact not found.");
        }

        scanner.close();
    }
}
