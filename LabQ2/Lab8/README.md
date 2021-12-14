Give code for the class RoadLab8 (public) representing a road in a game. 
(In addition to all the code Implemented in Programming test 1 Q1)
The class RoadLab8 should implement the interface Comparable. Any two RoadLab8 objects r1 and r2 will be compared by the diffLevel []. With the calling object as road r1, The final integer comparison value will be obtained as Sum over all elements i {r1.diffLevel[i] -r2.diffLevel[i]}
Example if r1.difflevel has values 111111... and r2  has values 222222...
and the length of array is 10.
Sum will be 10*(1 - 2)
_________________Implemented in Programming test 1 Q1 __________
Has a constructor taking two Integer Arrays as argument
	 diffLevel [ ] difficulty level at given y position
	 obsPos [ ]   Obstacle position at given y position
	 * Assume the maximum size of the arrays is 10.

Methods:  
public Integer getDiffAt(int y, int t)  -  Takes two arguments  y and t
Returns the difficulty level at y position in the presence of obstacles, which given by the 
	  * It is obtained by adding the difficulty level at Y
	 *  to the value obtained by rotating to the left the two's complement 
	 *  binary representation of Obstacle position at Y by
	 *  specified number of bits corresponding to the 2nd argument t.
Example getDiffAt(5,3) will return
diffLevel [5 ] + Rotating to left by 3 positions the the twos complement  of obsPos[5]   
