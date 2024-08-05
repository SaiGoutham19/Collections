import java.util.*;

public class Collection {

    private static List<String> list = new ArrayList<>();
    private static Set<String> set = new HashSet<>();
    private static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Collection Management System");
            System.out.println("1. Manage Lists");
            System.out.println("2. Manage Sets");
            System.out.println("3. Manage Maps");
            System.out.println("4. Exit");

            int choice = getValidInteger(scanner, "Enter your choice (1-4): ");
            switch (choice) {
                case 1:
                    manageLists(scanner);
                    break;
                case 2:
                    manageSets(scanner);
                    break;
                case 3:
                    manageMaps(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    private static void manageLists(Scanner scanner) {
        while (true) {
            System.out.println("\nManage Lists");
            System.out.println("1. Add an element");
            System.out.println("2. Remove an element");
            System.out.println("3. Display all elements");
            System.out.println("4. Back to main menu");

            int choice = getValidInteger(scanner, "Enter your choice (1-4): ");
            switch (choice) {
                case 1:
                    addElementToList(scanner);
                    break;
                case 2:
                    removeElementFromList(scanner);
                    break;
                case 3:
                    displayList();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    private static void manageSets(Scanner scanner) {
        while (true) {
            System.out.println("\nManage Sets");
            System.out.println("1. Add an element");
            System.out.println("2. Remove an element");
            System.out.println("3. Display all elements");
            System.out.println("4. Back to main menu");

            int choice = getValidInteger(scanner, "Enter your choice (1-4): ");
            switch (choice) {
                case 1:
                    addElementToSet(scanner);
                    break;
                case 2:
                    removeElementFromSet(scanner);
                    break;
                case 3:
                    displaySet();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    private static void manageMaps(Scanner scanner) {
        while (true) {
            System.out.println("\nManage Maps");
            System.out.println("1. Add a key-value pair");
            System.out.println("2. Remove a key-value pair");
            System.out.println("3. Display all key-value pairs");
            System.out.println("4. Back to main menu");

            int choice = getValidInteger(scanner, "Enter your choice (1-4): ");
            switch (choice) {
                case 1:
                    addKeyValuePair(scanner);
                    break;
                case 2:
                    removeKeyValuePair(scanner);
                    break;
                case 3:
                    displayMap();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    private static void addElementToList(Scanner scanner) {
        System.out.print("Enter the element to add to the list: ");
        String element = scanner.nextLine();
        list.add(element);
        System.out.println("Element added.");
    }

    private static void removeElementFromList(Scanner scanner) {
        System.out.print("Enter the element to remove from the list: ");
        String element = scanner.nextLine();
        if (list.remove(element)) {
            System.out.println("Element removed.");
        } else {
            System.out.println("Element not found in the list.");
        }
    }

    private static void displayList() {
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("List elements: " + list);
        }
    }

    private static void addElementToSet(Scanner scanner) {
        System.out.print("Enter the element to add to the set: ");
        String element = scanner.nextLine();
        if (set.add(element)) {
            System.out.println("Element added.");
        } else {
            System.out.println("Element already exists in the set.");
        }
    }

    private static void removeElementFromSet(Scanner scanner) {
        System.out.print("Enter the element to remove from the set: ");
        String element = scanner.nextLine();
        if (set.remove(element)) {
            System.out.println("Element removed.");
        } else {
            System.out.println("Element not found in the set.");
        }
    }

    private static void displaySet() {
        if (set.isEmpty()) {
            System.out.println("The set is empty.");
        } else {
            System.out.println("Set elements: " + set);
        }
    }

    private static void addKeyValuePair(Scanner scanner) {
        System.out.print("Enter the key: ");
        String key = scanner.nextLine();
        System.out.print("Enter the value: ");
        String value = scanner.nextLine();
        if (map.putIfAbsent(key, value) == null) {
            System.out.println("Key-value pair added.");
        } else {
            System.out.println("Key already exists in the map.");
        }
    }

    private static void removeKeyValuePair(Scanner scanner) {
        System.out.print("Enter the key to remove from the map: ");
        String key = scanner.nextLine();
        if (map.remove(key) != null) {
            System.out.println("Key-value pair removed.");
        } else {
            System.out.println("Key not found in the map.");
        }
    }

    private static void displayMap() {
        if (map.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("Map entries: " + map);
        }
    }

    private static int getValidInteger(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}
