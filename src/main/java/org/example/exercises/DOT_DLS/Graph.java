package org.example.exercises.DOT_DLS;

import java.util.Collection;
import java.util.Map;

public class Graph {

    private Collection<Node> nodes;
    private Collection<Edge> edges;
    private Map<String, String> attributes;

    public Graph() {
    }

    public Graph(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public Collection<Node> getNodes() {
        return this.nodes;
    }

    public void setNodes(String name) {
        this.nodes.add(new Node(name));
    }

    public void setNodes(String name, Map<String, String> attributes) {
        this.nodes.add(new Node(name, attributes));
    }

    public Collection<Edge> getEdges() {
        return this.edges;
    }

    public void setEdges(String start, String end) {
        this.edges.add(new Edge(start, end));
    }

    public void setEdges(String start, String end, Map<String, String> attributes) {
        this.edges.add(new Edge(start, end, attributes));
    }

    public Graph node(String name) {
        Graph graph = new Graph();
        graph.setNodes(name);
        return graph;
    }

    public Graph node(String name, Map<String, String> attributes) {
        Graph graph = new Graph();
        graph.setNodes(name, attributes);
        return graph;
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
