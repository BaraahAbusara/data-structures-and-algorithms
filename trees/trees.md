# Trees
<!-- Short summary or background information -->
From my readings about [trees](https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-15/resources/Trees.html) what I learnt is that :
- Trees are a non-linear data structure type that is made of a root node that has children , and these children can be roots as well and have children. 
- In binary trees every edge has maximum of two children (left node<=right node) .  
- To traverse through a binary tree you can using two categories :  
  - BFS : Breadth First Search ; Breadth first traversal iterates through the tree by going through each level of the tree node-by-node.
  - DFS : Depth First Search ; it goes in 3 methods :
    - Pre-order (root >> left >> right)
    - In-order (left >> root >> right)
    - Post-order (left >> right >> root)

- Nodes in trees can have more than 2 children , then we call them K-ary trees , where K is the maximum number of children for a node in the K-ary tree.
  - We can traverse through it using BFS just like in binary trees .
## Challenge
<!-- Description of the challenge -->
This challenge asks us to implement a binary tree that contains traversal methods (preOrder,inOrder and postOrder).
And extend it to a binary search tree class that contains adding and contains methods.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
To do so I implemented a BTNode that has a double value and a left and a right nodes. 
I used recursion to implement traversal methods 
## API
<!-- Description of each method publicly available in each of your trees -->
in my BinarySearchTree instance you can use the following methods:
- add(newValue)
- isEmptyTree()
- contains(value)
- preOrder(root,true)
- inOrder(root,true)
- postOrder(root,true)
and you can test my application using `./gradlew run` command.