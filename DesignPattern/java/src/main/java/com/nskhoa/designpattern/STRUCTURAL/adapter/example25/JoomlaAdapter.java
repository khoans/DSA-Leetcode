package com.nskhoa.designpattern.STRUCTURAL.adapter.example25;

public class JoomlaAdapter implements CMS {
    private JoomlaCMS joomla = new JoomlaCMS();
    public void publishContent(String content) {
        joomla.joomlaPublish(content);
    }
}
