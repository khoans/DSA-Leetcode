package com.nskhoa.designpattern.BEHAVIORAL.iterator.example9;

public class DocumentLibraryDemo {
    public static void main(String[] args) {
        DocumentLibrary library = new DocumentLibrary();
        library.addDocument(new Document("Project Plan", "Timeline and milestones."));
        library.addDocument(new Document("Budget Report", "Quarterly financials."));

        MyIterator<Document> it = library.createIterator();
        while (it.hasNext()) {
            Document doc = it.next();
            System.out.println(doc.getTitle() + ": " + doc.getContent());
        }
    }
}

