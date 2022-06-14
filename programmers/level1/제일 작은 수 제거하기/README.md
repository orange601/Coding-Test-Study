## 제일 작은 수 제거하기 ##

### 문제 설명 ###
- 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
- 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
- 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

### 입출력 예 ###
arr |	return
---- | ----
[4,3,2,1] |	[4,3,2]
[10] |	[-1]

### 풀이 ###
````java
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = null;
        
        if(arr.length <= 1) {
        	return new int[]{-1};
        }
        
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
        	if(i == 0) {
        		temp = arr[i];
        	}
        	
        	if(arr[i] < temp) {
        		temp = arr[i];
        	}
        }
        
        answer = new int[arr.length-1];
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] > temp) {
        		answer[j] = arr[i];
        		j++;
        	}
        }


      return answer;
    }
}
````


### 다른 사람의 풀이 ###
````java
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

class Solution {
  public int[] solution(int[] arr) {
      if (arr.length <= 1) return new int[]{ -1 };
      int min = Arrays.stream(arr).min().getAsInt();
      return Arrays.stream(arr).filter(i -> i != min).toArray();
  }
}
````


