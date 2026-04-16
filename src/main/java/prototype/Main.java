package prototype;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Recommendation> recommendations = new ArrayList<>();

        // default recommendation
        Recommendation fantasyRecommendation = new Recommendation("Fantasy Lovers");
        fantasyRecommendation.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", 1954));
        fantasyRecommendation.addBook(new Book("A Game of Thrones", "George R.R. Martin", "Fantasy", 1996));
        recommendations.add(fantasyRecommendation);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. View recommendations");
            System.out.println("2. Select a recommendation");
            System.out.println("3. Create a new recommendation");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (recommendations.isEmpty()) {
                        System.out.println("No recommendations available.");
                    } else {
                        for (int i = 0; i < recommendations.size(); i++) {
                            System.out.println((i + 1) + ". " + recommendations.get(i).getTargetAudience());
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter recommendation number: ");
                    int index = scanner.nextInt() - 1;
                    scanner.nextLine();
                    if (index >= 0 && index < recommendations.size()) {
                        manageRecommendation(scanner, recommendations, index);
                    } else {
                        System.out.println("Invalid selection.");
                    }
                    break;
                case 3:
                    System.out.print("Enter target audience for new recommendation: ");
                    String audience = scanner.nextLine();
                    Recommendation newRec = new Recommendation(audience);
                    recommendations.add(newRec);
                    System.out.println("New recommendation created!");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void manageRecommendation(Scanner scanner, List<Recommendation> recommendations, int index) {
        Recommendation selectedRec = recommendations.get(index);
        while (true) {
            System.out.println("\nManaging Recommendation: " + selectedRec.getTargetAudience());
            System.out.println("1. View books");
            System.out.println("2. Add a book");
            System.out.println("3. Remove a book");
            System.out.println("4. Clone recommendation");
            System.out.println("5. Return to main menu");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nCurrent Books:");
                    System.out.println(selectedRec);
                    break;
                case 2:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    selectedRec.addBook(new Book(title, author, genre, year));
                    System.out.println("Book added!");
                    break;
                case 3:
                    System.out.print("Enter book title to remove: ");
                    String removeTitle = scanner.nextLine();
                    selectedRec.getBooks().removeIf(book -> book.getTitle().equalsIgnoreCase(removeTitle));
                    System.out.println("Book removed if it existed.");
                    break;
                case 4:
                    System.out.print("Enter new target audience for cloned recommendation: ");
                    String newAudience = scanner.nextLine();
                    Recommendation clonedRec = selectedRec.clone();
                    clonedRec.setTargetAudience(newAudience);
                    recommendations.add(clonedRec);
                    System.out.println("Recommendation cloned!");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}