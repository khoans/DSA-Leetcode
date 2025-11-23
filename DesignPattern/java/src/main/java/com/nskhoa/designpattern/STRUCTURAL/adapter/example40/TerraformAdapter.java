package com.nskhoa.designpattern.STRUCTURAL.adapter.example40;

public class TerraformAdapter implements IaCTool {
    private TerraformTool terraform = new TerraformTool();
    public void provisionInfrastructure(String config) {
        terraform.terraformProvision(config);
    }
}
