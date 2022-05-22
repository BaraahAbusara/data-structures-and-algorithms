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
- set : space complexity O(1) since we find the index of bucket we will add to it in O(1) using hashing , speed complexity O(1) since we add either to the head of the linked list if it was an empty bucket or to the second place without looping. 
-> in case of filling 70% of the hashmap space complexity is going to be O(n) and  speed complexity is going to be O(n) only for that round because we will initialize a new hashmap with double te length ,and we will loop over it to add elements to the new hashmap.  
- get : space complexity O(1) since we get it directly by hashing the key and find the bucket then loop over the n elements inside the linked list in tht bucket with no extra memory used , speed complexity O(n) n : length of the LinkedList inside the bucket.
- contains : space complexity O(1) since we don't declare new elements, speed complexity O(n) n : length of the LinkedList inside the bucket we will loop over to check the existence of that element.
- keys : space complexity O(m) since we declare a new array list to add keys to it , speed complexity O(m) m: length of all elements inside the arrayList (buckets) and elements inside these linkedLists
- hash : space complexity O(1) no new elements are declared , speed complexity O(1) no loops were created.  
- getSize : space complexity O(1) no new elements are declared , speed complexity O(1) no loops were created.
- isEmpty : space complexity O(1) no new elements are declared , speed complexity O(1) no loops were created.

## API
<!-- Description of each method publicly available in each of your hashtable -->
- set : to add a key and value to our HashMap.
- get : to get a value for a certain key.
- contains : to check if the linked list contains a certain key inside it.
- keys : to return all unique keys inside the HashMap
- hash : to return the bucket index in which a certain key is located in. 
- getSize : returns the size of the hashmap. 
- isEmpty : returns a boolean if the hashmap is empty or not 