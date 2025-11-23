package com.nskhoa.designpattern.BEHAVIORAL.iterator.example45;

public class ForumPostIteratorDemo {
    public static void main(String[] args) {
        Forum forum = new Forum();
        forum.addPost(new Post("Welcome to the forum!"));
        forum.addPost(new Post("Thanks for joining!"));

        MyIterator<Post> it = forum.createIterator();
        while (it.hasNext()) {
            System.out.println(it
                                       .next()
                                       .getContent());
        }
    }
}

