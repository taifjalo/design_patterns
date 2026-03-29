package visitor;

public interface FileSystemVisitor {
    
    // Visitor interface for visiting files and directories in a file system structure.
    void visitFile(File file);
    void visitDirectory(Directory directory);
}
