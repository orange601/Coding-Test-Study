## K번째수 (다시풀기 - 졸려서 집중못함) ##

### 문제 설명 ###
- 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
- 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
1. array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
2. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
3. 2에서 나온 배열의 3번째 숫자는 5입니다.

### 입출력 예 ###
array |	commands | return
---- | ---- | ---- 
[1, 5, 2, 6, 3, 7, 4] | [[2, 5, 3], [4, 4, 1], [1, 7, 3]] |	[5, 6, 3]


### 풀이 ###
````java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] array, int[][] commands) {
		List<Integer> list = new ArrayList<>();
		for(int[] command : commands) {
			for(int m = 0; m < command.length;) {
				int i = command[0];
				int j = command[1];
				int k = command[2];
				
				int[] answer = Arrays.copyOfRange(array, i-1, j);
				Arrays.sort(answer);
				list.add(answer[k-1]);
				break;
			}
		}
        return list;
    }
}
````


### 다른 풀이 참고 ###
````java
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
````
