# Graphs
<!-- Short summary or background information -->
A graph is a non-linear data structure that consists of vertices and edges that connects these vertices together.
graphs can be :
- directed or undirected 
- weighted or unweighted 
- cycled or acycled

## Challenge
<!-- Description of the challenge -->
This challenge asks to implement graph with following methods :
- add node 
- add edge 
- get nodes 
- get neighbors
- size

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- add node , space complexity : O(1) , time complexity : O(1) . 
- add edge , space complexity : O(1) , time complexity : O(1) .
- get nodes , space complexity : O(n) : n is number of vertices in the graph , time complexity : O(n) : since the algorithm loops over all n vertices .
- get neighbors , space complexity : O(m) : m is number of vertices connected to the node , time complexity : O(1) .
- size , space complexity : O(1) , time complexity : O(1) .

## API
<!-- Description of each method publicly available in your Graph -->
My Graph has the following methods :
- add node : adds a vertex to the graph
- add edge : adds an edge between two vertices 
- get nodes : returns list of vertices inside the graph
- get neighbors : returns the list of vertices connected to a certain vertex.
- size : returns number of vertices inside the graph.