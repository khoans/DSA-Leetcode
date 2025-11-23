package com.nskhoa.designpattern.BEHAVIORAL.iterator.example18;

public class TextFile {
    private final String[] lines;
    private int count;

    TextFile(String[] lines) {
        this.lines = lines;
        this.count = lines.length;
    }

    MyIterator<String> createIterator() {
        return new LineIterator();
    }

    private class LineIterator implements MyIterator<String> {
        private int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public String next() {
            return lines[index++];
        }
    }
}
