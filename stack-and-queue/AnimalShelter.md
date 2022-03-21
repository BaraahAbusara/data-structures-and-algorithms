# Challenge Summary
<!-- Description of the challenge -->
This challenge asks us to create an animal shelter programme that we can add animals (only cats or dogs) to it and give these animals to adoption using FIFO approach.

## Whiteboard Process
<!-- Embedded whiteboard image -->

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
To add the animals I created a class named Animal that accepts only cats and dogs in the name.
and I created AnimalShelter class that contains queue of Animals with following methods:
- enqueue :memory -> O(1) , time -> O(1). 
- dequeue :memory -> O(1) , time -> O(n).
## Solution
To add the animals I created a class named Animal that accepts only cats and dogs in the name.
and I created AnimalShelter class that contains queue of Animals with following methods:
- For adding these animals I made Animals queue so every time I can enqueue into that queue which takes memory and time of O(1). 
- For dequeue I loop over the queue to find the preferred Animal to remove it from the queue and return it which takes O(n) time and O(1) memory.