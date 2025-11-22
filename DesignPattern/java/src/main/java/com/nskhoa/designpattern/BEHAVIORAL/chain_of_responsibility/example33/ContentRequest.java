package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example33;

// Request class
public class ContentRequest {
    private String url;
    private boolean cached;
    private boolean compressed;

    public ContentRequest(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public boolean isCached() {
        return cached;
    }

    public void setCached(boolean cached) {
        this.cached = cached;
    }

    public boolean isCompressed() {
        return compressed;
    }

    public void setCompressed(boolean compressed) {
        this.compressed = compressed;
    }
}
