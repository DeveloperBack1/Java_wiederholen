package skillbox_projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Contact {
    private String name;
    private String phone;
    private String type; // Friend or Colleague

    public Contact(String name, String phone, String type) {
        this.name = name;
        this.phone = phone;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Type: " + type;
    }

    public class ContactManager {
        private static List<Contact> contacts = new ArrayList<>();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            while (true) {
                System.out.println("\nContact Manager:");
                System.out.println("1. Add Contact");
                System.out.println("2. View Contacts");
                System.out.println("3. Delete Contact");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1 -> addContact();
                    case 2 -> viewContacts();
                    case 3 -> deleteContact();
                    case 4 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid option, try again.");
                }
            }
        }

        private static void addContact() {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter phone number: ");
            String phone = scanner.nextLine();
            System.out.print("Enter type (Friend/Colleague): ");
            String type = scanner.nextLine();

            contacts.add(new Contact(name, phone, type));
            System.out.println("Contact added successfully.");
        }

        private static void viewContacts() {
            if (contacts.isEmpty()) {
                System.out.println("No contacts available.");
                return;
            }
            contacts.forEach(contact -> System.out.println(contact));
        }

        private static void deleteContact() {
            System.out.print("Enter name of contact to delete: ");
            String name = scanner.nextLine();

            boolean removed = contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(name));

            if (removed) {
                System.out.println("Contact deleted successfully.");
            } else {
                System.out.println("Contact not found.");
            }
        }
    }
}
