package com.nskhoa.designpattern.BEHAVIORAL.iterator.example2;

public class Blog {
    private final BlogPost[] posts = new BlogPost[10];
    private int count = 0;

    void addPost(BlogPost post) {
        if (count < posts.length) { posts[count++] = post; }
    }

    MyIterator<BlogPost> createIterator() {
        return new BlogIterator();
    }

    private class BlogIterator implements MyIterator<BlogPost> {
        private int index = 0;

        public boolean hasNext() { return index < count; }
        public BlogPost next() { return posts[index++]; }
    }
}
