package visitor;

import java.util.ArrayList;
import java.util.List;

class Directory implements FileSystemElement {
    private final String name;
    private final List<FileSystemElement> elements = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    // Setter
    public void addElement(FileSystemElement element) {
        elements.add(element);
    }

    // Getters
    public String getName() {
        return name;
    }
    public List<FileSystemElement> getElements() {
        return elements;
    }

    
    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visitDirectory(this);
        for (FileSystemElement element : elements) {
            element.accept(visitor);
        }
    }
}

