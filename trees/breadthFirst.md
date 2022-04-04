# Challenge Summary
<!-- Description of the challenge -->
This challenge asks me to create a method to traverse over a tree and return a list of its elements in breadth first order which goes level by level from left to right.
## Whiteboard Process
<!-- Embedded whiteboard image -->

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
in my code I am using a queue.  
I take the root of my tree and add it to my queue then while my queue is not empty I remove the queue's front node and add its left node if exists then its right if exists, and add the node's value to my list .   
after the queue gets empty I return the list. 
My algorithm takes O(n) for space complexity, and O(n) for time complexity.   

## Solution
<!-- Show how to run your code, and examples of it in action -->
To rum this method you have to make a new `BinaryTree` or a new `BinarySearchTree` and call the `.breadthFirst()` method.
And you can test my application using `./gradlew run` command. 