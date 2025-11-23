package com.nskhoa.designpattern.STRUCTURAL.adapter.example25;

public class Client {
    public static void main(String[] args) {
        CMS wordpress = new WordPressAdapter();
        CMS drupal = new DrupalAdapter();
        CMS joomla = new JoomlaAdapter();

        wordpress.publishContent("Hello from WordPress!");
        drupal.publishContent("Hello from Drupal!");
        joomla.publishContent("Hello from Joomla!");
    }
}
