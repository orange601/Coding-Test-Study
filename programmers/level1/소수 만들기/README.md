## 소수 구하기 ##

### 문제 설명 ###
- 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 
- 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
1. nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
2. nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.

### 입출력 예 ###
nums | result
---- | ----
[1,2,3,4] |	1
[1,2,7,6,4] | 4


### 풀이 ###
````java
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length; i++) {
          for(int j = i+1; j < nums.length; j++) {
            for(int k = j+1; k < nums.length; k++) {
              int sum = nums[i] + nums[j] + nums[k];
              int cnt = 0;
              for(int m = 1; m <= sum; m++) {
                if(sum % m == 0) {
                  cnt++;
                 }
					    }
					    if(cnt == 2) {
                answer++;
					    }
				  }
			  }
		  }
      return answer;
    }
}
````


### 다른 풀이 참고 ###
````java
import java.util.Arrays;

class Solution {



    public int solution(int[] nums) {
        int ans = 0;

        for(int i = 0; i < nums.length - 2; i ++){
            for(int j = i + 1; j < nums.length - 1; j ++){
                for(int k = j + 1; k < nums.length; k ++ ){
                    if(isPrime(nums[i] + nums[j] + nums[k])){
                        ans += 1;  
                    } 
                }
            }
        }
        return ans;
    }
    public Boolean isPrime(int num){
        int cnt = 0;
        for(int i = 1; i <= (int)Math.sqrt(num); i ++){ // sqrt => 제곱근(루트)
            if(num % i == 0) cnt += 1; 
        }
        return cnt == 1;
    }
}
````


