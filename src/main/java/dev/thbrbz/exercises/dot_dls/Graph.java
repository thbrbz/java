package dev.thbrbz.exercises.dot_dls;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Graph {
    private Collection<Node> nodes;
    private Collection<Edge> edges;
    private Map<String, String> attributes;

    public Graph() {
        this.nodes = new ArrayList<Node>();
        this.edges = new ArrayList<Edge>();
        this.attributes = new HashMap<String, String>();
    }

    public Graph(Map<String, String> attributes) {
        this.nodes = new ArrayList<Node>();
        this.edges = new ArrayList<Edge>();
        this.attributes = attributes;
    }

    public Collection<Node> getNodes() {
        return this.nodes;
    }

    public Collection<Edge> getEdges() {
        return this.edges;
    }

    public Graph node(String name) {
        this.nodes.add(new Node(name));
        return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
        this.nodes.add(new Node(name, attributes));
        return this;
    }

    public Graph edge(String start, String end) {
        this.edges.add(new Edge(start, end));
        return this;
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        this.edges.add(new Edge(start, end, attributes));
        return this;
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }
}
