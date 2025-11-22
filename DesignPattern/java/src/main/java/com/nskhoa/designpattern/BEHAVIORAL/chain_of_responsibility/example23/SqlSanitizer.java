package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example23;

public class SqlSanitizer extends Sanitizer {
    @Override
    public void sanitize(Input input) {
        input.setData(input.getData().replaceAll("(['\";--])", ""));
        System.out.println("SQL sanitized: " + input.getData());
        if (nextSanitizer != null) nextSanitizer.sanitize(input);
    }
}
