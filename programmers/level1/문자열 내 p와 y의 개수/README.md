### 문제 설명 ###
- 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. 
- s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 
- 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
- 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

### 입출력 예 ###
s |	answer
---- | ----
"pPoooyY" | true
"Pyy" |	false

### 풀이 ###
````java
class Solution {
    boolean solution(String s) {
        
        boolean answer = false;
        int pcnt = 0;
        int scnt = 0;
        for(int i = 0; i <= s.length()-1; i++){
            String aa = s.substring(i, i+1);
            if(aa.contains("p") || aa.contains("P")){
                pcnt++;
            }        
        
            if(aa.contains("y") || aa.contains("Y")){
                scnt++;
            }
        }        
        
        if(pcnt == scnt){
            answer = true;
        }   
        return answer;
    }
}
````


### 다른 풀이 참고 ###
````java
class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();
        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}
````
