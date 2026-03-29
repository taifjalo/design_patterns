package visitor;

// SizeCalculatorVisitor should traverse the file system and calculate the total size of all files.

public class SizeCalculatorVisitor implements FileSystemVisitor {

    private long totalSize = 0;

    // Method to calculate the total size of all files in the file system.
    @Override
    public void visitFile(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visitDirectory(Directory directory) {
        // No need to do anything here.
    }

    public long getTotalSize() {
        return totalSize;
    }
}
