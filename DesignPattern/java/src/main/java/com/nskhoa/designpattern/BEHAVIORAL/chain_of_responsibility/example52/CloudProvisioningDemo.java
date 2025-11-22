package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example52;

public class CloudProvisioningDemo {
    public static void main(String[] args) {
        ProvisioningHandler quotaValidator = new QuotaValidator();
        ProvisioningHandler allocator = new ResourceAllocator();
        ProvisioningHandler configurator = new SettingsConfigurator();

        quotaValidator.setNextHandler(allocator);
        allocator.setNextHandler(configurator);

        ResourceRequest request = new ResourceRequest(8, 32);
        quotaValidator.provision(request);
    }
}
