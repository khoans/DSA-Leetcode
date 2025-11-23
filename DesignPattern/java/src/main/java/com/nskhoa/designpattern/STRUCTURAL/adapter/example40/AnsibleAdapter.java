package com.nskhoa.designpattern.STRUCTURAL.adapter.example40;

public class AnsibleAdapter implements IaCTool {
    private AnsibleTool ansible = new AnsibleTool();
    public void provisionInfrastructure(String config) {
        ansible.ansibleProvision(config);
    }
}
