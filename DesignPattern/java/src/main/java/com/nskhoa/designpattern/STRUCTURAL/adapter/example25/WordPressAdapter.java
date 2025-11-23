package com.nskhoa.designpattern.STRUCTURAL.adapter.example25;

public class WordPressAdapter implements CMS {
    private WordPressCMS wp = new WordPressCMS();
    public void publishContent(String content) {
        wp.wpPublish(content);
    }
}
