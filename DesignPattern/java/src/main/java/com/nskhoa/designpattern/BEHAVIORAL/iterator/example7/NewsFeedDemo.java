package com.nskhoa.designpattern.BEHAVIORAL.iterator.example7;

public class NewsFeedDemo {
    public static void main(String[] args) {
        NewsFeed newsFeed = new NewsFeed();
        newsFeed.addArticle(new NewsArticle("Elections Coming", "Details about upcoming elections."));
        newsFeed.addArticle(new NewsArticle("Stock Market", "Market trends analyzed."));

        MyIterator<NewsArticle> it = newsFeed.createIterator();
        while (it.hasNext()) {
            NewsArticle article = it.next();
            System.out.println(article.getHeadline() + ": " + article.getContent());
        }
    }
}

