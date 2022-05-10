## 나머지가 1이 되는 수 찾기 ##

### 문제 설명 ###
- 문자열 s의 길이가 4 혹은 6이고
- 숫자로만 구성돼있는지 확인해주는 함수 solution을 완성하세요. 
- 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

### 입출력 예 ###
s |	return
---- | ----
"a234" |	false
"1234" |	true


### 풀이 ###
````java
class Solution {
    public boolean solution(String s) {
		boolean answer = false;
        if(s.length() == 4 || s.length() == 6) {
			try {
				Integer.parseInt(s);
				answer = true;
			} catch (Exception e) {}
		}
        return answer;
    }
}
````


### 다른 풀이 참고 ###
````java
import java.util.*;

class Solution {
  public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
  }
}
````
