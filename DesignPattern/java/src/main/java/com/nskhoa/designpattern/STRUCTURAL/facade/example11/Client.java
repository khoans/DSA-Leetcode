package com.nskhoa.designpattern.STRUCTURAL.facade.example11;

class ComputeService {
    void startInstance() {
        System.out.println("Starting instance");
    }
}

class StorageService {
    void createBucket() {
        System.out.println("Creating storage bucket");
    }
}

class NetworkService {
    void configureNetwork() {
        System.out.println("Configuring network");
    }
}

class CloudFacade {
    private ComputeService compute = new ComputeService();
    private StorageService storage = new StorageService();
    private NetworkService network = new NetworkService();

    void deployInfrastructure() {
        compute.startInstance();
        storage.createBucket();
        network.configureNetwork();
        System.out.println("Cloud infrastructure deployed.");
    }
}

public class Client {
    public static void main(String[] args) {
        CloudFacade cloudFacade = new CloudFacade();
        cloudFacade.deployInfrastructure();
    }
}
