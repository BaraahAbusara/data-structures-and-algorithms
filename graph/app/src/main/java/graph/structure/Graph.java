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

    public Integer businessTrip ( ArrayList<String> cities ){
        int cost =0;
        if(this.size < cities.size())
            return -1;

        //implementation
        for(int i=1 ; i<cities.size();i++){
            Integer curCost = dij(cities.get(i-1),cities.get(i));
            if(curCost!=-1)
                cost+=curCost;
            else
                return -1;
        }

        return cost;
    }

    public Integer dij (String c1, String c2){
        //---------------------------------------
        Queue <Vertex> breadth = new Queue<Vertex>() ;
        HashMap <Vertex,Integer> visited = new HashMap<Vertex, Integer>();
        Vertex v1 = new Vertex(c1);
        Vertex v2 = new Vertex(c2);
        breadth.enqueue(v1);
        visited.put(v1,0);

        while (!breadth.isEmpty())
        {
            Node<Vertex> front = breadth.dequeue();
            Vertex cur = new Vertex("");

            for (int i=0 ; i<adjVertices.get(front.value).size();i++){
                cur= adjVertices.get(front.value).get(i);
                if(!visited.containsKey(cur)){
                    visited.put(cur,visited.get(front.value)+cur.weight);
                    breadth.enqueue(adjVertices.get(front.value).get(i));
                }
                else
                {
                    if(visited.get(front.value)+cur.weight<visited.get(cur))
                        visited.put(cur,visited.get(front.value)+cur.weight);
                }
            }

        }
        return visited.getOrDefault(v2, -1);
    }





    public ArrayList<Vertex> depthFirst (Vertex v) {
        ArrayList<Vertex> nodesAns = new ArrayList<>();

            HashMap  <Vertex,Boolean> nodes = new HashMap<>();
            Stack<Vertex> stack = new Stack<>();
            stack.push(v);                                    //push root node to the stack
            Vertex a = new Vertex("");

            while(!stack.empty())
            {
                v = stack.peek();                       //extract the top element of the stack
                stack.pop();                            //remove the top element from the stack
                if(!nodes.containsKey(v))
                {
                    nodesAns.add(v);
                    nodes.put(v,true);
                }
                for (int i = 0; i < adjVertices.get(v).size(); i++)  //iterate through the linked list and then propagate to the next few nodes
                {
                    a = adjVertices.get(v).get(i);
                    if (!nodes.containsKey(a))                    //only push those nodes to the stack which aren't in it already
                    {
                        stack.push(a);                          //push the top element to the stack
                    }
                }
        }
        return nodesAns;
    }
    }
