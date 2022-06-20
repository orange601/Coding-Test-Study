## 나누어 떨어지는 숫자 배열 ##

### 문제 설명 ###
- array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
- divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

### 입출력 예 ###
arr |	divisor |	return
---- | ---- | ----
[5, 9, 7, 10] |	5 |	[5, 10]
[2, 36, 1, 3]	| 1 |	[1, 2, 3, 36]
[3,2,6]	 | 10 |	[-1]

### 풀이 ###
````java
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i]%divisor == 0) {
        		list.add(arr[i]);
        	}
        }
        
        list.sort(Comparator.naturalOrder());
        int size = list.size();
        
        if( size == 0){
            return new int[]{-1};
        }
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}
````


### 다른 사람의 풀이 ###
````java
import java.util.Arrays;

class Solution {
  public int[] solution(int[] arr, int divisor) {
          int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
          if(answer.length == 0) answer = new int[] {-1};
          java.util.Arrays.sort(answer);
          return answer;
  }
}
````
