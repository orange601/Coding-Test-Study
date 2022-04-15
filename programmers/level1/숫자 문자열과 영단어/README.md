
## 숫자 문자열과 영단어 ##

### 문제 설명 ###
  - 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
  - 1 ≤ s의 길이 ≤ 50
  - s가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않습니다.

### 입출력 예 ###
s | result
---- | ---- 
"one4seveneight" | 1478
"23four5six7" | 234567
"2three45sixseven" | 234567
"123" | 123


### 풀이 ###
````java
class Solution {
    static String[] txtnos = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public int solution(String s) {
        for(String txtno : txtnos) {
            if(s.contains(txtno)) {
                s = s.replace(txtno, convertTextToNum(txtno));
            }
        }
        return Integer.parseInt(s);
    }

    static String convertTextToNum(String text) {
        String result = "";
        for(int i = 0; i < txtnos.length; i++) {
            if(text.equals(txtnos[i])) {
                result = String.valueOf(i);
                break;
            }
        }
        return result;
    }
}
````


### 다른 풀이 참조 ###
````java
class Solution {
    public int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}
````
