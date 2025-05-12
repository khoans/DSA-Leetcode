package com.nskhoa.DSA.algo.graph.floyd_warshall_algo;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedNode implements Comparable<WeightedNode> {
    public String name;
    private ArrayList<WeightedNode> neighbors = new ArrayList<>();
    private HashMap<WeightedNode, Integer> weightMap = new HashMap<>();
    public boolean isVisited = false;
    public WeightedNode parent;
    public int distance;
    public int index;

    public WeightedNode(String name, int index) {
        this.name = name;
        this.index = index;
        this.distance = Integer.MAX_VALUE;  // Initially, distance is set to infinity.
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(WeightedNode o) {
        return Integer.compare(this.distance, o.distance);
    }

    // Getter methods
    public ArrayList<WeightedNode> getNeighbors() {
        return neighbors;
    }

    public HashMap<WeightedNode, Integer> getWeightMap() {
        return weightMap;
    }

    public void addNeighbor(WeightedNode node, int weight) {
        neighbors.add(node);
        weightMap.put(node, weight);
    }
}
