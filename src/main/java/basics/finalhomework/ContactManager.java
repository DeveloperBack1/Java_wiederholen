package basics.finalhomework;
import java.util.Scanner;

public class ContactManager {
    private static final int MAX_CONTACTS = 100;
    private static String[] names = new String[MAX_CONTACTS];
    private static String[] phoneNumbers = new String[MAX_CONTACTS];
    private static int contactCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Просмотреть контакты");
            System.out.println("3. Найти контакт");
            System.out.println("4. Удалить контакт");
            System.out.println("5. Выйти");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    searchContact(scanner);
                    break;
                case 4:
                    deleteContact(scanner);
                    break;
                case 5:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }

    private static void addContact(Scanner scanner) {
        if (contactCount >= MAX_CONTACTS) {
            System.out.println("Список контактов заполнен.");
            return;
        }
        System.out.print("Введите имя: ");
        String name = scanner.nextLine().trim();
        System.out.print("Введите номер телефона: ");
        String phone = scanner.nextLine().trim();

        if (name.isEmpty() || phone.isEmpty()) {
            System.out.println("Ошибка: имя и номер телефона не могут быть пустыми.");
            return;
        }

        names[contactCount] = name;
        phoneNumbers[contactCount] = phone;
        contactCount++;
        System.out.println("Контакт успешно добавлен!");
    }

    private static void viewContacts() {
        if (contactCount == 0) {
            System.out.println("Список контактов пуст.");
            return;
        }
        System.out.println("\nСписок контактов:");
        for (int i = 0; i < contactCount; i++) {
            System.out.println((i + 1) + ". " + names[i] + " - " + phoneNumbers[i]);
        }
    }

    private static void searchContact(Scanner scanner) {
        System.out.print("Введите имя для поиска: ");
        String name = scanner.nextLine().trim();

        for (int i = 0; i < contactCount; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                System.out.println("Номер телефона: " + phoneNumbers[i]);
                return;
            }
        }
        System.out.println("Контакт не найден.");
    }

    private static void deleteContact(Scanner scanner) {
        System.out.print("Введите имя контакта для удаления: ");
        String name = scanner.nextLine().trim();

        for (int i = 0; i < contactCount; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                for (int j = i; j < contactCount - 1; j++) {
                    names[j] = names[j + 1];
                    phoneNumbers[j] = phoneNumbers[j + 1];
                }
                contactCount--;
                System.out.println("Контакт удалён.");
                return;
            }
        }
        System.out.println("Контакт не найден.");
    }
}
