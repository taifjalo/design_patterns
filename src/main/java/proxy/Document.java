package proxy;

import java.nio.file.AccessDeniedException;
import java.util.Date;

    /*
    A Document has a unique identifier as well as the creation date and 
    the document content. The content is represented by a String. 
    The identifiers and creation dates are always public, but 
    the content can be protected.
    */


public interface Document {
    String getContent(User user) throws AccessDeniedException;
    int getID();
    String getName();
    Date getCreationDate();
}