package com.nskhoa.designpattern.BEHAVIORAL.iterator.example20;

public class SocialMediaFeedDemo {
    public static void main(String[] args) {
        SocialMediaFeed feed = new SocialMediaFeed();
        feed.addPost(new Post("Alice", "Hello world!"));
        feed.addPost(new Post("Bob", "Enjoying Java design patterns."));

        MyIterator<Post> it = feed.createIterator();
        while (it.hasNext()) {
            Post post = it.next();
            System.out.println(post.getUser() + ": " + post.getContent());
        }
    }
}
