````java
class Solution {
    public long solution(long n) {
		String nn = String.valueOf(n);
		int[] tmp = new int[nn.length()];
		for(int i = 0; i < nn.length(); i++) {
			tmp[i] = Integer.parseInt(nn.substring(i, i+1));
		}
        
        for(int i = 0; i < tmp.length-1; i++) {
			for(int j = 0; j < tmp.length-1-i; j++) {
				if(tmp[j] < tmp[j+1]) {
					int temp = tmp[j];
					tmp[j] = tmp[j+1];
					tmp[j+1] = temp;
				}
			}
		}
        
        String aaa = "";
        for (int i = 0; i < tmp.length; i++) {
            aaa += tmp[i];
        }
        
        return Long.parseLong(aaa);
    }
}
````


````java
import java.util.*;

class Solution {
    public long solution(long n) {
        return Long.parseLong(String.valueOf(n).chars().mapToObj(ch -> (char) ch)
                .sorted(Comparator.reverseOrder())
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString());
    }
}
````
