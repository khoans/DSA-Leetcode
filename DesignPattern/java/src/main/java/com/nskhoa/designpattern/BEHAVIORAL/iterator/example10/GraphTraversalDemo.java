package com.nskhoa.designpattern.BEHAVIORAL.iterator.example10;

public class GraphTraversalDemo {
    public static void main(String[] args) {
        GraphNode a = new GraphNode("A"); GraphNode b = new GraphNode("B"); GraphNode c = new GraphNode("C");
        GraphNode d = new GraphNode("D");

        a.addNeighbor(b); a.addNeighbor(c); b.addNeighbor(d);

        MyIterator<GraphNode> dfs = new DfsIterator(a); while (dfs.hasNext()) {
            GraphNode n = dfs.next(); System.out.println("Visited: " + n.getLabel());
        }
    }
}

