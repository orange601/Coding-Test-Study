## 정수 제곱근 판별 ##

### 문제 설명 ###
- 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
- n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

### 입출력 예 ###
n | return
---- | ----
121 | 144
3 | -1

### 풀이 ###
````java
class Solution {
    public long solution(long n) {
      long answer = 0;
	    for(long i = 0; i * i <= n; i++){ // i * i 는 제곱수 (정수제곱수)
	        if(i * i == n){
	            answer =(i+1)*(i+1);
	        }else
	            answer =-1;
	    }
        return answer;
    }
}
````


### 다른 사람의 풀이 ###
````java
class Solution {
  public long solution(long n) {
      if (Math.pow((int)Math.sqrt(n), 2) == n) { // pow 제곱
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
  }
}
````
