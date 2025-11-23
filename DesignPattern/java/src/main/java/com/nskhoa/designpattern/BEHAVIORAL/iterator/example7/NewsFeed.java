package com.nskhoa.designpattern.BEHAVIORAL.iterator.example7;

public class NewsFeed {
    private final NewsArticle[] articles = new NewsArticle[10];
    private int count = 0;

    void addArticle(NewsArticle article) { if (count < articles.length) articles[count++] = article; }

    MyIterator<NewsArticle> createIterator() { return new NewsFeedIterator(); }

    private class NewsFeedIterator implements MyIterator<NewsArticle> {
        private int index = 0;
        public boolean hasNext() { return index < count; }
        public NewsArticle next() { return articles[index++]; }
    }
}
