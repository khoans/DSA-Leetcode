package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example46;

public class OrientDBFactory implements GraphAbstractFactory {
    public Node createNode() {
        return new OrientNode();
    }

    public Edge createEdge() {
        return new OrientEdge();
    }
}
