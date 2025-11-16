package com.nskhoa.designpattern.CREATIONAL.singleton.example15;

public class ResourceManager {
    private static ResourceManager instance;

    private ResourceManager() {
        // Khởi tạo tài nguyên
        System.out.println("ResourceManager initialized");
    }

    public static synchronized ResourceManager getInstance() {
        if (instance == null) {
            instance = new ResourceManager();
        }
        return instance;
    }

    public void loadResource(String resourceName) {
        System.out.println("Loading resource: " + resourceName);
        // Logic tải tài nguyên
    }

    public void releaseResource(String resourceName) {
        System.out.println("Releasing resource: " + resourceName);
        // Logic giải phóng tài nguyên
    }

    public static void main(String[] args) {
        ResourceManager resourceManager = ResourceManager.getInstance();
        resourceManager.loadResource("Image1.png");
        resourceManager.releaseResource("Image1.png");
    }
}
