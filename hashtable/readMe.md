# Hashtables
<!-- Short summary or background information -->
A hash table is a data structure that stores a key linked to a value (in a Bucket ) in a certain index in the memory and returns their index, but sometimes multiple values buckets may have the same index which called a collision and can be fixed using linked lists , the first value in the index will point to the next value and so on.

## Challenge
<!-- Description of the challenge -->
This challenge asks us to implement a hash table names HashMap from scratch include the HashNode and set , get , contains, keys and hash functions. 


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
For implementing the HashMap I created an ArrayList with number of empty buckets inside it , after adding 70% of available space in the buckets number of buckets will be duplicated.
inside each bucket I implemented a linkedList to handle collisions in O(1) by adding the new node to the 2nd place in the LinkedList.
I also implemented following methods :
- set : space complexity O(1) , speed complexity O(1) 
- get : space complexity O(1) , speed complexity O(n) n : length of the LinkedList inside the bucket.  
- contains : space complexity O(1) , speed complexity O(n) n : length of the LinkedList inside the bucket.
- keys : space complexity O(m) , speed complexity O(m) m: length of all elements inside the arrayList (buckets) and elements inside these linkedLists
- hash : space complexity O(1) , speed complexity O(1) 

## API
<!-- Description of each method publicly available in each of your hashtable -->
- set : to add a key and value to our HashMap.
- get : to get a value for a certain key.
- contains : to check if the linked list contains a certain key inside it.
- keys : to return all unique keys inside the HashMap
- hash : to return the bucket index in which a certain key is located in. 