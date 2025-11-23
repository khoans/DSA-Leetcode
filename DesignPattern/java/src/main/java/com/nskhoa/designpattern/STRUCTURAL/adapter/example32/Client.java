package com.nskhoa.designpattern.STRUCTURAL.adapter.example32;

public class Client {
    private ConfigManager configManager;

    public Client(ConfigManager configManager) {
        this.configManager = configManager;
    }

    public void displayConfig(String key) {
        System.out.println("Config Value: " + configManager.getValue(key));
    }

    public static void main(String[] args) {
        ConfigManager consulConfig = new ConsulAdapter();
        ConfigManager etcdConfig = new EtcdAdapter();
        ConfigManager zkConfig = new ZookeeperAdapter();

        Client consulClient = new Client(consulConfig);
        Client etcdClient = new Client(etcdConfig);
        Client zkClient = new Client(zkConfig);

        consulClient.displayConfig("database_url");
        etcdClient.displayConfig("cache_size");
        zkClient.displayConfig("service_endpoint");
    }
}
