package com.nskhoa.designpattern.STRUCTURAL.adapter.example40;

public class Client {
    private IaCTool iaCTool;
    public Client(IaCTool iaCTool) {
        this.iaCTool = iaCTool;
    }
    public void deploy(String config) {
        iaCTool.provisionInfrastructure(config);
    }

    public static void main(String[] args) {
        IaCTool terraform = new TerraformAdapter();
        IaCTool ansible = new AnsibleAdapter();
        IaCTool cloudFormation = new CloudFormationAdapter();

        Client terraformClient = new Client(terraform);
        Client ansibleClient = new Client(ansible);
        Client cfClient = new Client(cloudFormation);

        terraformClient.deploy("Terraform Config");
        ansibleClient.deploy("Ansible Config");
        cfClient.deploy("CloudFormation Config");
    }
}
