package visitor;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {

    private String extension;                           // Search by extension, for example: .txt, .pdf, .jpg etc. الامتداد الملف الذي نبحث عنه
    private List<File> foundFiles = new ArrayList<>();  // Array of files extensions to save the search term for, for example: .txt, .pdf, .jpg etc.


    public SearchVisitor(String extension) {
        this.extension = extension;
    }

    // Method to search for files by extension (.txt or .pdf or .jpg etc.) that match the search term and print their details.
    @Override
    public void visitFile(File file) {
        if (file.getName().endsWith(extension)) {
            foundFiles.add(file);
            System.out.println("Found file: " + file.getName() + " (Size: " + file.getSize() + " bytes)");
        }
    }

    @Override
    public void visitDirectory(Directory directory) {
        // No need to do anything here, as the Directory will automatically accept the visitor for its contained elements.
    }

    // Method to return the list of found files that match the search term.
    public List<File> getFoundFiles() {
        return foundFiles;
    }
}
