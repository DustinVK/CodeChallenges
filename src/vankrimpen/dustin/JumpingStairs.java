package vankrimpen.dustin;

/*
 * Triple Step: 
 * 
 * A child is running up a staircase with n steps and can hop either:
 * 		* 1 step 
 * 		* 2 steps
 * 		* 3 steps at a time
 * 
 * Implement a method to count how many possible ways the child can run up the staircase
 * 
 */

public class JumpingStairs {
	
	 public static void main(String[] args) {
		 int stairs = 20;
		 
		 // Create a table showing possible solutions up to the given number of stairs 
		 System.out.println("Stairs\t|\tSolutions");
		 for(int i = 1; i < stairs+1;i++) {
			 long ways = tripleStep(i);
			 System.out.println("-------------------------");
			 	System.out.printf("%d",i);
			 	System.out.printf("\t|\t%d\n",ways);
		    	//System.out.printf("Stairs in staircase: %d  Number of solutions: %d\n", i, ways);
		 }
	  }
		
	
	// initial tripleStep call optimized using memoization to avoid repeating previously calculated values
	public static long tripleStep(int n) {
		long[] map = new long[n+1]; // map to store calculated values 
		return tripleStep(n, map);
	}
	
	// tripleStep recursively looks through each possible step to sum the number of all possible solutions 
	public static long tripleStep(int n, long[] map) {
		// first check & return if the value is already stored in map 
		if(n >= 0 && map[n] != 0) {
			return map[n];
		}
		
		//base cases 
		// if there are 1 steps left then there is 1 possible way to finish (return 1) 
		if (n == 1) {
			map[n] = 1;
			return 1;
		}
		// if there are two steps left for the staircase then there are 2 possible ways to finish (return 2)  
		if(n == 2) {
			map[n] = 2;
			return 2;
		}
		// if there are 3 steps left then there are 4 possible ways to finish (return 4) 
		if(n == 3) {
			map[n] = 4;
			return 4;
		}
		
		// recursively call tripleStep for each possible move if base cases are not yet reached 
		long i = tripleStep(n-1, map);
		i += tripleStep(n-2, map);
		i += tripleStep(n-3, map);
		map[n] = i;
		return i;
	}
	
}
