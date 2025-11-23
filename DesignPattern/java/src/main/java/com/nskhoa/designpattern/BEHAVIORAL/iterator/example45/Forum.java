package com.nskhoa.designpattern.BEHAVIORAL.iterator.example45;

public class Forum {
    private final Post[] posts = new Post[10];
    private int count = 0;

    void addPost(Post p) {
        if (count < posts.length) {
            posts[count++] = p;
        }
    }

    MyIterator<Post> createIterator() {
        return new PostIterator();
    }

    private class PostIterator implements MyIterator<Post> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Post next() {
            return posts[index++];
        }
    }
}
