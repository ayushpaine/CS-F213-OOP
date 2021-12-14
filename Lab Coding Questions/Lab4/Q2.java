public class Q2 {
    static int freqOfSubstring(String sub, String s) {
		int freq = 0;
		while(true) {
			int loc = s.indexOf(sub);
			if(loc == -1)
				break;
			freq++;
			s = s.substring(loc+1);
		}
		if(freq == 0)
			freq=-1;
		return freq;
	}
}
