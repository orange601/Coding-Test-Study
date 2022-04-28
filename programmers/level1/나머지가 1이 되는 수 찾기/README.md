## 나머지가 1이 되는 수 찾기 ##

### 문제 설명 ###
- 자연수 n이 매개변수로 주어집니다. 
- n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요. 
- 답이 항상 존재함은 증명될 수 있습니다.

### 입출력 예 ###
n |	result
---- | ----
10 | 3
12 | 11

### 풀이 ###
````java
class Solution {
    public int solution(int n) {
        int answer = 0;
		for(int i = 2; i < n; i++) {
			int remainder = n%i;
			if(remainder == 1) {
				answer = i;
				break;
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
