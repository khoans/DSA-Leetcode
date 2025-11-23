package com.nskhoa.designpattern.BEHAVIORAL.iterator.example20;

public class SocialMediaFeed {
    private final Post[] posts = new Post[10];
    private int count = 0;

    void addPost(Post post) {
        if (count < posts.length) {
            posts[count++] = post;
        }
    }

    MyIterator<Post> createIterator() {
        return new FeedIterator();
    }

    private class FeedIterator implements MyIterator<Post> {
        private int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Post next() {
            return posts[index++];
        }
    }
}
