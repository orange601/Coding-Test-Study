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
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(6, 1);
        map.put(5, 2);
        map.put(4, 3);
        map.put(3, 4);
        map.put(2, 5);
        map.put(1, 6);
        map.put(0, 6);

        int maxcnt = 0;
        int minicnt = 0;
        for(int i = 0; i < lottos.length; i++) {
            int num = lottos[i];
            // 0 개수
            if(num <= 0) {
                maxcnt++;
            }
            for(int j = 0; j < win_nums.length; j++) {
                int win = win_nums[j];
                if(num == win) {
                    maxcnt++;
                    minicnt++;
                }
            }
        }


        int[] answer = {map.get(maxcnt), map.get(minicnt)};
        return answer;
    }
}
````


### 다른 풀이 참조 ###
````java
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {	
	int maxcnt = 0;
	int minicnt = 0;
	for(int num : lottos) {
		if(num <= 0) {
			maxcnt++;
		}
			
		for(int win : win_nums) {
			if(num == win) {
				maxcnt++;
				minicnt++;
			}
		}
	}
		
	int standard = 7;
	int[] answer = {standard- maxcnt, Math.min(standard - minicnt, 6)};
        return answer;
    }
}
````
