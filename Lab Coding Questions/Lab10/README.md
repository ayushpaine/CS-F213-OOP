Write code a class **CarRoof** having a method 
int minRoofSize(List  <Integer> cars, int k) 
  

There are many cars parked in the parking lot. The parking is a straight, very long line and has a parking slot for every single meter. There are n cars parked currently and you want to cover them from the rain by building a roof. The requirement is that at least k cars are covered by the roof. What is the minimum length of the roof that would cover k cars?
Example:
Input:  cars : [2 10 8 17]
k = 3
Output:
9   
Explanation:
There are 4 cars parked at slots 2,10,8 and 17 respectively and k = 3. Then, you build a roof of length 9 covering all parking sots from 2nd one to the 10th one, so covering 3 cars at slots 2,10 and 8. There is no shorter roof that can cover 3 cars, so the answer is 9.

Output format: Return  int : The length of the roof required OR Integer.MAX_VALUE

Write a Java class [public class CarRoof] that contains the following method and global variables:
Global Variables:
List cars; int k;
Methods:
public  int minRoofSize( List <Integer> cars, int k) 
Parameters:
cars: A List of Integers representing the positions of the cars.
k: int, The minimum amount of cars your roof should cover.

