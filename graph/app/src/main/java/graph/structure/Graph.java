package graph.structure;

import graph.data.Node;
import graph.data.Vertex;

import java.util.*;

public class Graph {
    private Map<Vertex, List<Vertex>> adjVertices = new HashMap<>();
    int size =0 ;
    public Graph() {
    }

    public Vertex addNode(String data) {
        Vertex vertex = new Vertex(data);

        adjVertices.putIfAbsent(vertex,new ArrayList<>());
        size++;

        return vertex;
    }
    public Vertex addNode(String data, int weight) {
        Vertex vertex = new Vertex(data,weight);
        adjVertices.putIfAbsent(vertex,new ArrayList<>());
        size++;

        return vertex;
    }

    public void addEdge(String data1,String data2 , int weight){
        Vertex vertex1 = new Vertex(data1,weight);
        Vertex vertex2 = new Vertex(data2,weight);

        adjVertices.get(vertex1).add(vertex2);
        adjVertices.get(vertex2).add(vertex1);
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
        for (Vertex vertex : adjVertices.keySet()){
            nodes.add(vertex);
        }

        return nodes;
    }


    public ArrayList<Vertex> getNeighbors (Vertex vertex){
        ArrayList<Vertex> neighbors = new ArrayList<>() ;
        neighbors.addAll(adjVertices.get(vertex));

        return neighbors;
    }

    public ArrayList<Node<Vertex>> breadthFirst (Vertex v){
        ArrayList<Node<Vertex>> nodes = new ArrayList<>();
        Queue <Vertex> breadth = new Queue<Vertex>() ;
        Set <Vertex> visited = new HashSet<>();

        breadth.enqueue(v);
        visited.add(v);

        while (!breadth.isEmpty())
        {
            Node<Vertex> front = breadth.dequeue();
            nodes.add(front);
            System.out.println(adjVertices.get(front.value).toArray());
            for (int i=0 ; i<adjVertices.get(front.value).size();i++){
                if(!visited.contains(adjVertices.get(front.value).get(i))){
                    visited.add(adjVertices.get(front.value).get(i));
                    breadth.enqueue(adjVertices.get(front.value).get(i));
                }
            }

        }
        return nodes;
    }

    public Integer businessTrip (Graph graph , ArrayList<String> cities ){
        if(cities.size()<this.size)
            return null;

        int cost ;
        if(graph.size < cities.size())
            return null;

        //implementation

        return cost; 

    }

}
