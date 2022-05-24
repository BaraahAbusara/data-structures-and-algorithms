package graph.structure;

import graph.data.Vertex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<Vertex, List<Vertex>> adjVertices;
    int size =0 ;
    public Graph() {
    }

    public void addNode(String data) {
        Vertex vertex = new Vertex(data);
        adjVertices.putIfAbsent(vertex,new ArrayList<>());
        size++;
    }

    public void addEdge(String data1,String data2){
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);

        adjVertices.get(vertex1).add(vertex2);
        adjVertices.get(vertex2).add(vertex1);
    }

    public int size ()
    {
        return size ;
    }

    public ArrayList<Vertex> getNodes (){
        ArrayList<Vertex> nodes = new ArrayList<>();
        for (Object vertex : adjVertices.keySet()){
            nodes.addAll(adjVertices.get(vertex));
        }

        return nodes;
    }


    public ArrayList<Vertex> getNeighbors (Vertex vertex){
        ArrayList<Vertex> neighbors = new ArrayList<>() ;
        neighbors.addAll(adjVertices.get(vertex));

        return neighbors;
    }



}
