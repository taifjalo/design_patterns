package proxy;

import java.util.Date;

public class RealDocument implements Document {
    public String name;
    public Date createdAt;
    protected String content;
    private static int idCounter = 0;
    private final int id;
    
    public RealDocument(String name,  String content) {
        this.name = name;
        this.createdAt = new Date(System.currentTimeMillis());
        this.content = content;
        this.id = ++idCounter;
    }

    @Override
    public String getContent(User user) {
        return content;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getCreationDate() {
        return createdAt;
    }

}
