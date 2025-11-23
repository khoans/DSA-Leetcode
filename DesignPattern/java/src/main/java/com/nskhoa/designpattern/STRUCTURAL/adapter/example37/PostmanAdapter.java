package com.nskhoa.designpattern.STRUCTURAL.adapter.example37;

public class PostmanAdapter implements APIDocumentation {
    private PostmanDoc postman = new PostmanDoc();
    public void generateDocs(String apiSpec) {
        postman.postmanGenerate(apiSpec);
    }
}
