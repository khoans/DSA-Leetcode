package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example46;

public class Runner {
    public static void main(String[] args) {
        GraphAbstractFactory factory = new Neo4jFactory();
        Node node = factory.createNode();
        node.addProperty("name");

        Edge edge = factory.createEdge();
        edge.connect("NodeB");
    }
}
