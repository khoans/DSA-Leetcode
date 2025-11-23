package com.nskhoa.designpattern.STRUCTURAL.adapter.example37;

public class APIDocumentationClient {
    private APIDocumentation docTool;

    public APIDocumentationClient(APIDocumentation docTool) {
        this.docTool = docTool;
    }

    public void createDocumentation(String apiSpec) {
        docTool.generateDocs(apiSpec);
    }

    public static void main(String[] args) {
        APIDocumentationClient swaggerClient = new APIDocumentationClient(new SwaggerAdapter());
        swaggerClient.createDocumentation("API Spec v1");

        APIDocumentationClient postmanClient = new APIDocumentationClient(new PostmanAdapter());
        postmanClient.createDocumentation("API Spec v2");

        APIDocumentationClient redocClient = new APIDocumentationClient(new RedocAdapter());
        redocClient.createDocumentation("API Spec v3");
    }
}
