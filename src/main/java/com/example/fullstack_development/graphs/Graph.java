package com.example.fullstack_development.graphs;

import java.util.ArrayList;

public class Graph {
    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;

    public Graph() {

    }

    public ArrayList<Vertex> getVertices() {
        return this.vertices;
    }

    public Vertex getVertexByValue(String value) {
        for(Vertex v: this.vertices) {
            if (v.getData() == value) {
                return v;
            }
        }

        return null;
    }

    public void print() {
        for(Vertex v: this.vertices) {
            v.print(isWeighted);
        }
    }

    public static void main(String[] args) {

    }
}

