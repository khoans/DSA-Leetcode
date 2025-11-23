package com.nskhoa.designpattern.BEHAVIORAL.iterator.example10;

public class GraphNode {
    private final String label;
    private final GraphNode[] neighbors = new GraphNode[10];
    private int count = 0;

    GraphNode(String label) {
        this.label = label;
    }

    String getLabel() {
        return label;
    }

    void addNeighbor(GraphNode n) {
        if (count < neighbors.length) {
            neighbors[count++] = n;
        }
    }

    GraphNode[] getNeighbors() {
        GraphNode[] actual = new GraphNode[count]; for (int i = 0; i < count; i++) {
            actual[i] = neighbors[i];
        } return actual;
    }
}
