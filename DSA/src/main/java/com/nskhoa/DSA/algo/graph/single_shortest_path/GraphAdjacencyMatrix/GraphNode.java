package com.nskhoa.DSA.algo.graph.single_shortest_path.GraphAdjacencyMatrix;

public class GraphNode {
  public String name;
  public int index;
  public boolean isVisited = false;
  public GraphNode parent;

  public GraphNode(String name, int index) {
    this.name = name;
    this.index = index;
  }
}
