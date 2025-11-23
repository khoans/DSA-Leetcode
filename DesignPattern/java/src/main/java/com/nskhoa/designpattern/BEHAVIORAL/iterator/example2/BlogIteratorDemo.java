package com.nskhoa.designpattern.BEHAVIORAL.iterator.example2;

public class BlogIteratorDemo {
    public static void main(String[] args) {
        Blog blog = new Blog();
        blog.addPost(new BlogPost("Java Patterns", "Content about Iterator Pattern"));
        blog.addPost(new BlogPost("Spring Boot", "Intro to Spring Boot development"));

        MyIterator<BlogPost> iterator = blog.createIterator();
        while (iterator.hasNext()) {
            BlogPost post = iterator.next();
            System.out.println(post.getTitle() + ": " + post.getContent());
        }
    }
}

