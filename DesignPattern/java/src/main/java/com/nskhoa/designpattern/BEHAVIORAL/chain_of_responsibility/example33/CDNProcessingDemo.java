package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example33;

// Client runner
public class CDNProcessingDemo {
    public static void main(String[] args) {
        CDNHandler cache = new CachingHandler();
        CDNHandler compress = new CompressionHandler();
        CDNHandler delivery = new DeliveryHandler();

        cache.setNextHandler(compress);
        compress.setNextHandler(delivery);

        ContentRequest request = new ContentRequest("/images/logo.png");
        cache.handle(request);
    }
}

