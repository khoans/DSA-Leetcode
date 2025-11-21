package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example46;

public class Neo4jFactory implements GraphAbstractFactory {
    public Node createNode() {
        return new Neo4jNode();
    }

    public Edge createEdge() {
        return new Neo4jEdge();
    }
}
