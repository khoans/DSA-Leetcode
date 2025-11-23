package com.nskhoa.designpattern.BEHAVIORAL.iterator.example10;

public class DfsIterator implements MyIterator<GraphNode> {
    private final GraphNode[] stack = new GraphNode[100];
    private int top = -1;
    private final GraphNode[] visited = new GraphNode[100];
    private int visitedCount = 0;

    DfsIterator(GraphNode start) {
        push(start);
    }

    private void push(GraphNode n) {
        stack[++top] = n;
    }

    private GraphNode pop() {
        return stack[top--];
    }

    private boolean wasVisited(GraphNode n) {
        for (int i = 0; i < visitedCount; i++) {
            if (visited[i] == n) {
                return true;
            }
        } return false;
    }

    public boolean hasNext() {
        while (top >= 0 && wasVisited(stack[top])) {
            pop();
        } return top >= 0;
    }

    public GraphNode next() {
        GraphNode node = pop(); visited[visitedCount++] = node; GraphNode[] neighbors = node.getNeighbors();
        for (int i = neighbors.length - 1; i >= 0; i--) {
            if (!wasVisited(neighbors[i])) {
                push(neighbors[i]);
            }
        } return node;
    }
}
