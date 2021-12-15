Give code for the class Road (public) representing a road in a game. 

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

(Give code for the classes  and the method(s) asked in the question ONLY. No additional code should be added. Any additional code main, System.out,  etc. will result in zero marks. Access specifiers have to be as specified. Convert between Integer and int properly. )
