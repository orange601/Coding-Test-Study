## 로또의 최고 순위와 최저 순위 ##

### 문제 설명 ###
  - 로또를 구매한 민우는 당첨 번호 발표일을 학수고대하고 있었습니다. 하지만, 민우의 동생이 로또에 낙서를 하여, 일부 번호를 알아볼 수 없게 되었습니다. 당첨 번호 발표 후, 민우는 자신이 구매했던 로또로 당첨이 가능했던 최고 순위와 최저 순위를 알아보고 싶어 졌습니다.
  - 알아볼 수 없는 번호를 0으로 표기하기로 하고, 민우가 구매한 로또 번호 6개가 44, 1, 0, 0, 31 25라고 가정해보겠습니다. 당첨 번호 6개가 31, 10, 45, 1, 6, 19라면, 당첨 가능한 최고 순위와 최저 순위의 한 예는 아래와 같습니다.

### 입출력 예 ###
lottos | win_nums | result
---- | ---- | ---- 
[44, 1, 0, 0, 31, 25] | [31, 10, 45, 1, 6, 19] | [3, 5]
[0, 0, 0, 0, 0, 0] | [38, 19, 20, 40, 15, 25] | [1, 6]
[45, 4, 35, 20, 3, 9] | [20, 9, 3, 45, 4, 35] | [1, 1]


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
