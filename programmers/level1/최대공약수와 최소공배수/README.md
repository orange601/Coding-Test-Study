
## 최대공약수와 최소공배수 ##

### 문제 설명 ###
- 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
- 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
- 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

### 입출력 예 ###
arr |	answer
---- | ----
[1,1,3,3,0,1,1] |	[1,3,0,1]
[4,4,4,3,3] |	[4,3]

price | money |	count |	result
---- | ---- | ---- | ----
3	| 20	| 4	| 10

n |	m |	return
---- | ---- | ----
3 |	12 |	[3, 12]
2 |	5 |	[1, 10]

### 풀이 ###
````java
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int aa = gcd(n, m);
        answer[0] = aa;
        
        int bb = lcm(n, m);
        answer[1] = bb;
        return answer;
    }
    
    static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	
	static int lcm(int a, int b){
	    return a * b / gcd(a,b);
	}
}
````


### 다른 사람의 풀이1 ###
````java
import java.util.Arrays;
class Solution {
    public int[] solution(int n, int m) {
        return gcdlcm(n, m);
    }
    
    static int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
        answer[0] = gcd(a,b);
        answer[1] = (a*b)/answer[0];
        return answer;
    }

   public static int gcd(int p, int q) {
       if (q == 0) return p;
       return gcd(q, p%q);
   }
}
````
