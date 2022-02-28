# array-binary-search
<!-- Description of the challenge -->
The challenge  asks us to look for an element inside a sorted array and return its index , and return -1 if not found using `binary search` algorithm.
## Whiteboard Process
<!-- Embedded whiteboard image -->
![array-binary-search algorithm whiteboard](./array-binary-search.jpg)
## Approach & Efficiency
<!-- What approach did you take? Discuss Why. What is the Big O space/time for this approach? -->
Binary search is a very known algorithm to search over an element in a sorted array fast since it takes complexity of O(log(n)).
How does binary search work? 
we will have 3 main values which are low value pointing on the lower boundry of the range we are searching in , and high value for the higher boundry and mid for the middle index between low and high. 
each time and while low is still less than high we check the mid value , if it is the element we are looking for , we found it !
otherwise, if the element is bigger than the mid element then we don't need to look for it in the left side since the array is sorted and all elements on the left are smaller than the midlle index , so we make the low bound equals mid index+1 because we already checked the mid index. and the same if it was smaller than the mid index , all elements to the right will be bigger than the mid element and we don't have to check for than since the array is sorted so we make the high bound equals mid index-1.
we keep doing that untill we either find the element inside the mid or low becomes bigger than high then we know that the element doesn't exist in the array. 

