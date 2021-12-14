import java.util.*;

public class CarRoof {
	
	List<Integer> cars; int k;
	
	public int minRoofSize( List <Integer> cars, int k) {
		int ans = Integer.MAX_VALUE;
		Collections.sort(cars);
		for(int i = 0;k+i-1 < cars.size();i++) {
			int temp = cars.get(k-1+i)-cars.get(i)+1;
			if(temp < ans) {
				ans = temp;
			}
		}
		
		return ans;
	}
}