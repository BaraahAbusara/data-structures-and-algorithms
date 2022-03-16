# Stacks and Queues
<!-- Short summary or background information -->
## Stack
***
Stack is a data structure that is made of group of nodes pointing to the next node only.
Stack uses the idea of *First In Last Out **FILO*** which means that the first element enters the stack will be the last one to get out of it.
Methods available for stacks :
- Push.
- Pop.
- Peek.
- IsEmpty.

![Stack](https://cdn.programiz.com/sites/tutorial2program/files/stack.png)

## Queue
***
Queue is a data structure that is made just like a queue on a counter who comes first will be served first *First In First Out **FIFO*** .

Methods available for queues :
- Enqueue.
- Dequeue.
- Peek.
- IsEmpty.

![Queue](https://i0.wp.com/learnersbucket.com/wp-content/uploads/2019/01/Queue-2-1.png?fit=768%2C400&ssl=1)
## Challenge
<!-- Description of the challenge -->
Our challenge is to implement Stacks and Queues and their methods using OOP logic.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### Stacks methods :
- Push time :O(1) , memory :O(1) : we initialize one new node and add it to the stack in one move.
- Pop time :O(1) , memory :O(1) : we remove one existing node and return it in one move.
- Peek time :O(1) , memory :O(1) : we return an existing node in one move.
- IsEmpty time :O(1) , memory :O(1) : we return if the stack isEmpty in one move.
### Queues methods:
- Enqueue time :O(1) , memory :O(1) : we initialize one new node and add it to the queue in one move.
- Dequeue time :O(1) , memory :O(1) : we remove one existing node and return it in one move.
- Peek time :O(1) , memory :O(1) : we return an existing node in one move.
- IsEmpty time :O(1) , memory :O(1) : we return if the queue isEmpty in one move.

## API
<!-- Description of each method publicly available to your Stack and Queue-->
### Stacks methods :
-[x] Push : it pushes the new node to the beginning of the stack.  
-[x] Pop : it removes the first node of the stack.  
-[x] Peek : it returns the value of the first element in the stack.  
-[x] IsEmpty : it returns a boolean telling us if the stack is empty or not.  
### Queues methods:
-[x] Enqueue : it pushes the new node to the end of the queue.  
-[x] Dequeue : it removes the first node of the queue.  
-[x] Peek : it returns the value of the first element in the queue.  
-[x] IsEmpty : it returns a boolean telling us if the queue is empty or not.  
