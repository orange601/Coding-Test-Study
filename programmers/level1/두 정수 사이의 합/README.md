## 두 정수 사이의 합 ##

### 문제 설명 ###
- 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
- 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

### 입출력 예 ###
a |	b	| return
---- | ---- | ---- 
3	| 5	| 12
3	| 3	| 3
5	| 3	| 12



### 풀이 ###
````java
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
		if(a == b) {
			answer = a;
		} 
		
		int start = 0;
		int end = 0;
		if(a < b) {
			start = a;
			end = b;
		} else {
			start = b;
			end = a;
		}
		
		long sum = 0;
		for(;start <= end; start++) {
			sum += start;
		}
		
		answer = sum;
        return answer;
    }
}
````


### 다른 풀이 참고 ###
````java
class Solution {

    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}
````

### 설명 ###
- 등차수열의 합을 이용한 풀이
- 등차수열의 합 = n(a + L) / 2 
- 항의개수 n, 첫째항 a, 마지막항 L


## 내가 풀었던 방식으로 풀기위해선 ##
### 첫번째 예 ###
````java
class Solution {
  public long solution(int a, int b) {
      long answer = 0;
      for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) 
          answer += i;

      return answer;
  }
}
````
### 두번째 예 ###
````java
class Solution {
  public long solution(int a, int b) {
      long answer = 0;

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start; i <= end; i++) {
            answer += i;
        }

        return answer;
  }
}
````
