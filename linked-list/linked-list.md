# Singly Linked List
Singly linked list is a class that has a value and a pointer that is pointing to the next element.
it has a pointer pointing to the head of the list to be able to loop over using its pointer and nextNode function.


## Challenge
<!-- Description of the challenge -->
The challenge asks us to create a linkedList class with a value and a pointer pointing to the next element and add :
- insert method .
- includes method : returns a true or false if it found/didn't find a certain value in the linkedList.
- toString: returns all elements of the linkedList in a certain format.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
My approach declares a linkedList in O(1) and insert to the beginning of the list in O(1) and prints its elements in o(n).

## API
<!-- Description of each method publicly available to your Linked List -->

My code is able to do following functionalities publicly: 

- [x] Can instantiate an empty linked list.
- [x] Can insert elements into the linked list.
- [x] The head property will properly point to the first node in the linked list.
- [x] Can properly insert multiple nodes into the linked list.
- [x] Will return true when finding a value within the linked list that exists using includes methodology.
- [x] Will return false when searching for a value in the linked list that does not exist using includes methodology.
- [x] Can properly return a collection of all the values that exist in the linked list using toString methodology.
