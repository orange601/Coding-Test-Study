## 수박수박수박수박수박수 ##

### 문제 설명 ###
- 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
- 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

### 입출력 예 ###
n |	return
---- | ----
3 | "수박수"
4 | "수박수박"


### 풀이 ###
````java
class Solution {
    public String solution(int n) {        
        String[] water = {"수", "박"};
        String answer = "";        
        for(int i = 0; i < n; i++){
            int a = i % 2;
            answer += water[a];
        }        
        return answer;
    }
}
````


### 다른 사람의 풀이 ###
````java
class Solution {
    public String solution(int n) {
        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }
}
````
