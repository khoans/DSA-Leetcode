package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example23;

// Concrete Handlers
public class HtmlSanitizer extends Sanitizer {
    @Override
    public void sanitize(Input input) {
        input.setData(input.getData().replaceAll("<[^>]*>", ""));
        System.out.println("HTML sanitized: " + input.getData());
        if (nextSanitizer != null) nextSanitizer.sanitize(input);
    }
}
