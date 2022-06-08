## 평균 구하기 ##

### 문제 설명 ###
- 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

### 입출력 예 ###
arr |	return
---- | ----
[1,2,3,4] |	2.5
[5,5] |	5


### 풀이 ###
````java
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int size = arr.length;
        for(int i = 0; i < size; i++){
            int num = arr[i];
            answer += num;
        }
        return answer/size;
    }
}
````


### 다른 풀이 참고 ###
````java
import java.util.Arrays;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int size = arr.length;
        for(int i = 0; i < size; i++){
            int num = arr[i];
            answer += num;
        }
        return Arrays.stream(array).average().orElse(0);
    }
}
````


