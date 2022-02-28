# array-insert-shift
<!-- Description of the challenge -->
The challenge asks us to create `array-insert-shift` method to add an element to the middle of the given array.
## Whiteboard Process
<!-- Embedded whiteboard image -->
![array-insert-shift algorithm whiteboard](./array-insert-shift.jpg)
## Approach & Efficiency
<!-- What approach did you take? Discuss Why. What is the Big O space/time for this approach? -->
I took the approach to simply loop over the input array and check if my index is less than the middle index rounded up I will add the element in the array to the answer array.  
when I find the middle index I add the new element then the first bigger element by increasing the value of the loop counter.
after that I add the remaining elements from the input array of index index-1 to the answer array of index index.  
