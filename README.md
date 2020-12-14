# CodeChallenges
A collection of Java 8 solutions to coding challenges utilizing algorithms and data structures. 
- - - -

# Jumping Stairs (AKA Triple Step)
**A child is running up a staircase with n steps and can hop either:**
* **1 step**
* **2 steps**
* **3 steps**
          
**Implement a method to count how many possible ways the child can run up the staircase.**

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
**Given a sorted array A of distinct integers, write a method to find a magic index, if one exists, in array A.**

***A magic index occurs when a value of an array matches its index. For example, if we have an array of integers, A
, and A[5] == 5, then 5 is a magic index of A.*** 

This problem has an easy brute force solution, if you search through the whole array for values that match the index. However, there is a better solution if you use the fact that it is a sorted array of unique values. This solution invloves dividing the array in half to find a mid-point value, which is compared to its index value. If it is less than its index value, then the right half of the array is recursivley searched, otherwise the left half is recursively searched. 

[Solution](https://github.com/DustinVK/CodeChallenges/blob/main/src/vankrimpen/dustin/MagicIndex.java "Solution Code") 

Screenshot:

![alt text](https://github.com/DustinVK/CodeChallenges/blob/main/Screenshots/MagicIndex-Screenshot.PNG?raw=true)


- - - -

# Paint Fill
**Implement the "paint fill" function that one might find in an image editing program. Given a screen (represented by a two-dimensional array of colors), a point, and a new color, fill in the surrounding area until the color changes from the original color.**

The solution to this problem is simply a matter of recursively calling a paint fill method on given coordinate's potential neighbors until there is no more screen, or a different color fromm the original is reached. 

[Solution](https://github.com/DustinVK/CodeChallenges/blob/main/src/vankrimpen/dustin/PaintFill.java "Solution Code") 

Screenshot:

![alt text](https://github.com/DustinVK/CodeChallenges/blob/main/Screenshots/PaintFill-Screenshot.PNG?raw=true)

- - - -

# Permutations
** Given two strings, write a method to decide if one is a permutation of the other.**

Method A sorts the characters of each string and then compares the two to check if they are equal.

Method B maps each character in the first string to its frequency. It then checks each character in the second string returning false if its frequency is 0, or else subtrracting one from its frequency. 

Both methods first check that the string lengths are equal before proceeding. 

My solution also compares performance of the two methods. 

[Solution](https://github.com/DustinVK/CodeChallenges/blob/main/src/vankrimpen/dustin/Permutations.java "Solution Code") 

Screenshot:

![alt text](https://github.com/DustinVK/CodeChallenges/blob/main/Screenshots/Permutations-ScreenShot.PNG?raw=true)

- - - -

# Unique Characters
**A) Implement an algorithm to determine if a string has all unique characters. B) What if you cannot use additional data structures?**

For A), I used a BitSet to keep track of whether a character has appeared or not. 

For B), I sorted the characters, then iterated through them checking if the previous character was equal to the next. 


[Solution](https://github.com/DustinVK/CodeChallenges/blob/main/src/vankrimpen/dustin/UniqueCharacters.java "Solution Code") 

Screenshot:

![alt text](https://github.com/DustinVK/CodeChallenges/blob/main/Screenshots/UniqueCharacters-Screenshot.PNG?raw=true)

- - - -

# Zero Matrix 
**Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.**

The solution that I wrote for this problem uses to arrays to keep track of the rows and columns to be set to zero. The original matrix is iterated through, with zero values having their rows and columns added to the track-keeping arrays. Afterwards, the track-keeping array values are used to set zero values in the original matrix,


[Solution](https://github.com/DustinVK/CodeChallenges/blob/main/src/vankrimpen/dustin/ZeroMatrix.java "Solution Code") 

Screenshot:

![alt text](https://github.com/DustinVK/CodeChallenges/blob/main/Screenshots/ZeroMatrix-Screenshot.PNG?raw=true)

- - - -
