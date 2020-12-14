# CodeChallenges
A collection of solutions to coding challenges utilizing algorithms and data structures. 

- - - -

# Jumping Stairs (AKA Triple Step)
A child is running up a staircase with n steps and can hop either:
* 1 step
* 2 steps
* 3 steps 
          
Implement a method to count how many possible ways the child can run up the staircase.

To solve this problem I started with a simple recursive solution which called itself for each possible move (n-1, n-2, & n-3) until it got down to one of three possible base cases:
* 1 step left (return 1 possible solution)
* 2 steps left (return 2 possible solutions)
* 3 steps left (return 4 possible solution)

This starting solution worked, but the time complexity was not good. Since each call branches 3 times, the time complexity is about O(3^n). The main reason for this inefficiency is the amount of duplicated work being done. 

One way to prevent this duplicate work is to map each stair to it's solution number after it is calculated. If the stair has been mapped previously, then the calculated value is instantly pulled out from the map instead of creating more recursive calls. 

[Solution](https://github.com/DustinVK/CodeChallenges/blob/main/src/vankrimpen/dustin/JumpingStairs.java "Solution Code") 

Screenshot:

![alt text](https://github.com/DustinVK/CodeChallenges/blob/main/Screenshots/Jumping-Stairs-Screenshot.PNG?raw=true)


- - - -

# Magic Index
Given a sorted array A of distinct integers, write a method to find a magic index, if one exists, in array A.

*A magic index occurs when a value of an array matches its index. For example, if we have an array of integers, A
, and A[5] == 5, then 5 is a magic index of A.* 

This problem has an easy brute force solution, if you search through the whole array for values that match the index. However, there is a better solution if you use the fact that it is a sorted array of unique values. This solution invloves dividing the array in half to find a mid-point value, which is compared to its index value. If it is less than its index value, then the right half of the array is recursivley searched, otherwise the left half is recursively searched. 

[Solution](https://github.com/DustinVK/CodeChallenges/blob/main/src/vankrimpen/dustin/MagicIndex.java "Solution Code") 

Screenshot:

![alt text](https://github.com/DustinVK/CodeChallenges/blob/main/Screenshots/MagicIndex-Screenshot.PNG?raw=true)


- - - -

# Paint Fill
Implement the "paint fill" function that one might find in an image editing program. Given a screen (represented by a two-dimensional array of colors), a point, and a new color, fill in the surrounding area until the color changes from the original color.

The solution to this problem is simply a matter of recursively calling a paint fill method on given coordinate's potential neighbors until there is no more screen, or a different color fromm the original is reached. 

[Solution](https://github.com/DustinVK/CodeChallenges/blob/main/src/vankrimpen/dustin/PaintFill.java "Solution Code") 

Screenshot:

![alt text](https://github.com/DustinVK/CodeChallenges/blob/main/Screenshots/PaintFill-Screenshot.PNG?raw=true)

- - - -


