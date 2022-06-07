## 약수의 합 ##

### 문제 설명 ###
- 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

### 입출력 예 ###
n |	return
---- | ----
12 | 28
5 |	6

### 풀이 ###
````java
class Solution {
    public int solution(int n) {
        int answer = 0;
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) {
				answer += i;
			}
		}
        return answer;
    }
}
````


### 다른 풀이 참고 ###
````java
class SumDivisor {
    public int sumDivisor(int num) {
        int answer = 0;
            for(int i = 1; i <= num/2; i++){
        if(num%i == 0) answer += i;
      }
        return answer+num;
    }
}
````
