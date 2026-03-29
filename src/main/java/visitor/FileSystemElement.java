package visitor;

public interface FileSystemElement {

    // Interface for elements in the file system (files and directories) that can accept a visitor.
    void accept(FileSystemVisitor visitor);
}
