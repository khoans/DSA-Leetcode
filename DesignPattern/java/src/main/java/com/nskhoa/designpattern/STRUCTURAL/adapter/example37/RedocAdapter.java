package com.nskhoa.designpattern.STRUCTURAL.adapter.example37;

public class RedocAdapter implements APIDocumentation {
    private RedocDoc redoc = new RedocDoc();
    public void generateDocs(String apiSpec) {
        redoc.redocGenerate(apiSpec);
    }
}
