package proxy;
import java.nio.file.AccessDeniedException;

public class Main {
    public static void main(String[] args) {

        // Get the singleton instance of AccessControlService
        AccesControlService accessControl = AccesControlService.getInstance();

        // Create users
        User user = new User("John");
        User user2 = new User("Jane");

        // Create library and add documents
        Library library = new Library();
        library.addProtectedDocument(new RealDocument("Document 2", "This is protected document"));
        library.addDocument(new RealDocument("Document 1", "This is a public document"));

        // Grant access to user2 for Document 2
        accessControl.grantAccess("Document 2", user2);

        // Retrieve documents
        Document doc2 = library.getDocument("Document 2");
        Document doc1 = library.getDocument("Document 1");

        
        // Try to access document contents
        try {
            System.out.println(doc2.getContent(user2));
            System.out.println(doc1.getContent(user));
            System.out.println(doc1.getContent(user2));

            System.out.println(doc2.getContent(user));
        } catch (AccessDeniedException e) {
            System.out.println("Access denied for user " + user.getName());
        }
    }
}

