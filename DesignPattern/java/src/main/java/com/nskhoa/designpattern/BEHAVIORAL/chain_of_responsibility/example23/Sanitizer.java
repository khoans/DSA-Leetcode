package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example23;

// Abstract Handler
public abstract class Sanitizer {
    protected Sanitizer nextSanitizer;

    public void setNextSanitizer(Sanitizer nextSanitizer) {
        this.nextSanitizer = nextSanitizer;
    }

    public abstract void sanitize(Input input);
}
