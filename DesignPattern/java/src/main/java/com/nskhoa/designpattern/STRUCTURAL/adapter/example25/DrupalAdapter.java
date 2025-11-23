package com.nskhoa.designpattern.STRUCTURAL.adapter.example25;

public class DrupalAdapter implements CMS {
    private DrupalCMS drupal = new DrupalCMS();
    public void publishContent(String content) {
        drupal.drupalPublish(content);
    }
}
