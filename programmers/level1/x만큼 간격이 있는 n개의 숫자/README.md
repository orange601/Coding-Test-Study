
## x만큼 간격이 있는 n개의 숫자 ##

### 문제 설명 ###
- 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
- 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

### 입출력 예 ###
x | n | answer
---- | ---- | ----
2 | 5 | [2,4,6,8,10]
4 | 3 | [4,8,12]
-4 | 2 | [-4, -8]

### 풀이 ###
````java
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
		long temp = 0;
		for(int i = 0; i < n; i++) {
			temp += x;
			answer[i] = temp;
		}
        return answer;
    }
}
````


### 다른 사람의 풀이 ###
````java
class Solution {
  public long[] solution(long x, int n) {
      long[] answer = new long[n];
      for(int i = 0; i < n; i++){
          answer[i] = x * (i + 1);
      }
      return answer;
  }
}
````
