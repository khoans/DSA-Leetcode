package com.nskhoa.designpattern.STRUCTURAL.facade.example15;

class FinanceManager {
    void manageFinance() { System.out.println("Managing finances"); }
}
class HRManager {
    void handleHR() { System.out.println("Managing human resources"); }
}
class SupplyChainManager {
    void manageSupplyChain() { System.out.println("Managing supply chain"); }
}

class ERPFacade {
    private FinanceManager finance = new FinanceManager();
    private HRManager hr = new HRManager();
    private SupplyChainManager supplyChain = new SupplyChainManager();

    void operateERP() {
        finance.manageFinance();
        hr.handleHR();
        supplyChain.manageSupplyChain();
    }
}

public class Client {
    public static void main(String[] args) {
        ERPFacade erp = new ERPFacade();
        erp.operateERP();
    }
}
