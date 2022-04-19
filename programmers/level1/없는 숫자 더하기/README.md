## 없는 숫자 더하기 ##

### 문제 설명 ###
  - 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
  - numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

### 입출력 예 ###
numbers | result
---- | ---- 
[1,2,3,4,6,7,8,0] | 14
[0, 0, 0, 0, 0, 0] | [38, 19, 20, 40, 15, 25] | [1, 6]
[5,8,4,0,6,7,9] | 6


### 풀이 ###
````java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
	for(int number : numbers) {
		list.add(number);
	}
		
	int answer = 0;
	for(int i = 1; i < 10; i++) {
		if(!list.contains(i)) {
			answer += i;
		}
	}
        return answer;
    }
}
````


### 다른 풀이 참고 ###
````java
class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}
````
