package com.nskhoa.designpattern.STRUCTURAL.adapter.example40;

public class CloudFormationAdapter implements IaCTool {
    private CloudFormationTool cf = new CloudFormationTool();
    public void provisionInfrastructure(String config) {
        cf.cloudFormationProvision(config);
    }
}
