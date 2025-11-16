package com.nskhoa.designpattern.creational.prototype.example13;

import java.util.ArrayList;
import java.util.List;

public class WebsiteTemplate implements Cloneable {
    private String header;
    private String footer;
    private List<Section> sections = new ArrayList<>();
    private Theme theme;

    @Override
    public WebsiteTemplate clone() {
        try {
            WebsiteTemplate cloned = (WebsiteTemplate) super.clone();
            cloned.sections = this.sections != null ? new ArrayList<>(this.sections) : new ArrayList<>();
            cloned.theme = this.theme != null ? this.theme.clone() : null;
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }



    // Usage
    public static void main(String[] args) {
        WebsiteTemplate baseTemplate = new WebsiteTemplate();

        WebsiteTemplate clientAWebsite = baseTemplate.clone();
        clientAWebsite.setHeader("Client A Header");

        WebsiteTemplate clientBWebsite = baseTemplate.clone();
        clientBWebsite.setHeader("Client B Header");
    }
}
