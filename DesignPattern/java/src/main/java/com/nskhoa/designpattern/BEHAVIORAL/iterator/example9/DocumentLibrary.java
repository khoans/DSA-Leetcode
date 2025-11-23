package com.nskhoa.designpattern.BEHAVIORAL.iterator.example9;

public class DocumentLibrary {
    private final Document[] documents = new Document[10];
    private int count = 0;

    void addDocument(Document doc) {
        if (count < documents.length) {
            documents[count++] = doc;
        }
    }

    MyIterator<Document> createIterator() {
        return new DocumentLibraryIterator();
    }

    private class DocumentLibraryIterator implements MyIterator<Document> {
        private int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Document next() {
            return documents[index++];
        }
    }
}
