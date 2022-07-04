## 정수 내림차순으로 배치하기 ##

### 문제 설명 ###
  - 함수 solution은 정수 n을 매개변수로 입력받습니다. 
  - n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
  - 예를들어 n이 118372면 873211을 리턴하면 됩니다.


### 입출력 예 ###
n | return
---- | ---- 
118372 | 873211


### 풀이 ###
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


### 다른 사람의 풀이 ###
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

