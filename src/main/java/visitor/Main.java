package visitor;

public class Main {
    public static void main(String[] args) {

        // Step 1: Create the system structure a Directory to put the file 
        Directory rootDir = new Directory("root");
        Directory subDir = new Directory("subdir");

        // Step 2: Create some files and add them to the directories
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.jpg", 200);
        File file3 = new File("file3.pdf", 300);

        rootDir.addElement(file1);
        rootDir.addElement(file2);
        rootDir.addElement(subDir);
        subDir.addElement(file3);

        // First: Create a visitor to calculate the total size of the file system
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        rootDir.accept(sizeVisitor);

        // Output the total size
        System.out.println("Total size of the file system: " + sizeVisitor.getTotalSize() + " bytes");


        // Second: Create a visitor to search for files with a specific extension
        SearchVisitor searchVisitor = new SearchVisitor(".txt");
        rootDir.accept(searchVisitor);

        // Output the found files
        System.out.println("Found files with extension .txt:");
        for (File file : searchVisitor.getFoundFiles()) {
            System.out.println(" - " + file.getName());
        }

    }
}
