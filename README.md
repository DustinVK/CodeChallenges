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

This starting solution worked, but the time complexity was not good. Since each call branches 3 times, the time complexity is about O(3^n). The main reason for this inefficiency is the amount of duplicated work being done. One way to prevent this duplicate work is to map each stair to it's solution number after it is calculated. If the stair has been mapped previously, then the calculated value can be instantly pulled out from the map, instead of creating more recursive calls. 

[Solution](https://github.com/DustinVK/CodeChallenges/blob/main/src/vankrimpen/dustin/JumpingStairs.java "Solution Code") 

Screenshot:

![alt text](https://github.com/DustinVK/CodeChallenges/blob/main/Screenshots/Jumping-Stairs-Screenshot.PNG?raw=true)
