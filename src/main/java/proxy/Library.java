package proxy;

import java.util.HashMap;

public class Library {
    private HashMap<String ,Document> documents = new HashMap<>();

    // Add a public document to the library: This is the method that adds a document to the library. It takes a RealDocument as input and stores it directly in the documents map.
    public void addDocument(Document document){
        documents.put(document.getName(), document);
    }

    // Add a protected document to the library: This is the method that adds a document to the library. It takes a RealDocument as input, creates a ProxyDocument for it, and then stores the proxy in the documents map. This way, when users access the document through the library, they will interact with the proxy, which can enforce access control.
    public void addProtectedDocument(RealDocument document){
        ProxyDocument documentProxy = new ProxyDocument(document);
        documents.put(document.getName(), documentProxy);

    }


    public Document getDocument(String name){
        return documents.get(name);
    }

}
