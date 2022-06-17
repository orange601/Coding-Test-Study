## 자릿수 더하기 ##

### 문제 설명 ###
- 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
- 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

### 입출력 예 ###
N	| answer
---- | ----
123 |	6
987 |	24

### 풀이 ###
````java
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = String.valueOf(n);
        for(int i = 0; i < num.length(); i++){
            answer += Integer.parseInt(num.substring(i, i+1));            
        }
        return answer;
    }
}
````


### 다른 사람의 풀이 ###
````java
import java.util.*;
public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n > 0){
            answer += n%10; // 나머지가 차례로 3, 2, 1 이 나옴
            if(n < 10)
                break;

            n = n/10; // 차례로 12, 1 이 나옴
        }
        return answer;
    }
}
````
