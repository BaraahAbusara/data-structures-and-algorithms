# Challenge Summary
<!-- Description of the challenge -->
This challenge asks us to implement a method that tells us if a string has balanced brackets or not. 
*Example* : "(){}[({Hello})]" is balanced but "[){}" is not.
## Whiteboard Process
<!-- Embedded whiteboard image -->

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
For my code I looped over the input string and used a stack, if the current char from the string is a closing bracket
I check if the top of the stack is its opening , if so then I will pop the opening because I found its closing and I don't need it anymore.
otherwise if the top was not its opening bracket then the brackets are not balanced.
In another hand if the char was an opening bracket I add it to the stack , if not we will skip it. 
if this loop finished ,and we have no elements inside the stack it means that we have popped them all so it is a balanced string, and if it wasn't empty then we have openings with no closings then it is not balanced. 
My code's time complexity is O(n) where n is the length of the input string. 
My code's memory complexity is O(n) where I initialise a new stack and add the string chars to it. 



## Solution
<!-- Show how to run your code, and examples of it in action -->
To use my function you can simply call it in the app as follows:
`validateBrackets("add your test here {}()[][({})]");`
