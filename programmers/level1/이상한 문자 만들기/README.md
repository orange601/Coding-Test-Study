
## 이상한 문자 만들기 ##

### 문제 설명 ###
- 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 
- 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
- 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

### 입출력 예 ###
arr |	answer
---- | ----
[1,1,3,3,0,1,1] |	[1,3,0,1]
[4,4,4,3,3] |	[4,3]

price | money |	count |	result
---- | ---- | ---- | ----
3	| 20	| 4	| 10

s | return
"try hello world" | "TrY HeLlO WoRlD"

### 풀이 ###
````java
class Solution {
    public String solution(String s) {
        String answer = "";
		String[] ss = s.split("");
		int j = 0;
		for(int i = 0; i < ss.length; i++) {
			if(ss[i].equals(" ")) {
				j = 0;
			} else {
				j++;
			}
			if(j%2 == 0) {
				answer += ss[i].toLowerCase();
			} else {
				answer += ss[i].toUpperCase();
			}
		}
        return answer;
    }
}
````


### 다른 사람의 풀이 ###
````java
class Solution {
  public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
        }
      return answer;
  }
}
````
