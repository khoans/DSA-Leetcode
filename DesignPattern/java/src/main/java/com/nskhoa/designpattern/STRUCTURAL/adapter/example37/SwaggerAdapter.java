package com.nskhoa.designpattern.STRUCTURAL.adapter.example37;

public class SwaggerAdapter implements APIDocumentation {
    private SwaggerDoc swagger = new SwaggerDoc();
    public void generateDocs(String apiSpec) {
        swagger.swaggerGenerate(apiSpec);
    }
}
