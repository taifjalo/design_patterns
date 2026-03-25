package proxy;

import java.nio.file.AccessDeniedException;
import java.util.Date;

public class ProxyDocument implements Document {
    
    private RealDocument realDocument;
    
    public ProxyDocument(RealDocument document) {
        this.realDocument = document;
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        Boolean isAllowed = AccesControlService.getInstance().checkAuthorization(realDocument.getName(), user.getName());
        if (!isAllowed) {
            throw new AccessDeniedException("Access denied for user: " + user.getName());
        }
        return realDocument.getContent(user);
    }

    @Override
    public int getID() {
        return realDocument.getID();
    }

    @Override
    public String getName() {
        return realDocument.getName();
    }

    @Override
    public Date getCreationDate() {
        return realDocument.getCreationDate();
    }
}
