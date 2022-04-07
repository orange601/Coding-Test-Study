## 1. 두 개 뽑아서 더하기 ##

### 문제 설명 ###
  - numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

### 제한사항 ###
  - numbers의 길이는 2 이상 100 이하입니다.
  - numbers의 모든 수는 0 이상 100 이하입니다.

### point ###
  - 서로 다른 인덱스 -> 같은 원소 연산 X
  - 만들 수 있는 모든 수 -> 중복제거
  - 오름차순 -> 정렬

### 풀이 ###

````java

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> sums = new ArrayList<>();
        
        for(int i = 0; i < numbers.length -1; i++) {
          for(int j = i + 1; j < numbers.length; j++) {
            int sum = numbers[i] + numbers[j];
            if(!sums.contains(sum)) {
              sums.add(sum);
            }
          }
        }
        
        Collections.sort(sums);
        
        int answer[] = new int[sums.size()];
        for(int i = 0; i < sums.size(); i++){
            answer[i] = sums.get(i);
        }
        
        return answer;
    }
}

````

### 문제로 보이는 것들 ###

1. Collections.sort를 통한 정렬
    - 성능이슈는 없을까
      > 편의를 위해 라이브러리를 통한 sort 기능을 사용하기 위해서는 2가지가 생각나는데 Collections.sort와 Arrays.sort 이다.
      > Arrays.sort()는 Dual-Pivot Quicksort를 사용
      > Collections.sort()는 merge sort와 insert sort를 합친 timsort를 사용
      > Quick sort는 배열에서 좋은 성능을 보이지만 stable하지 않아서 stable이 필요한 Object에는 Collections.sort()가 많이 쓰인다고 .
      > Collections.sort 레거시로 합병정렬과 Tim 정렬을 사용, Tim 정렬은 삽입(Insertion) 정렬과 합병(Merge) 정렬을 결합하여 만든 정렬
      > Tim sort에 대해 알아보자 : https://d2.naver.com/helloworld/0315536

    - 다른 정렬을 사용하면 어떨까




2. ArrayList를 굳이 사용해야되나
    - 다른 자료구조는 없을까? LinkedList, TreeSet 등등

### 다른 사람의 풀이 확인 후 다시풀이 ###

````java

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> sums = new ArrayList<>();
        
        for(int i = 0; i < numbers.length -1; i++) {
          for(int j = i + 1; j < numbers.length; j++) {
            int sum = numbers[i] + numbers[j];
            if(!sums.contains(sum)) {
              sums.add(sum);
            }
          }
        }
        
        Collections.sort(sums);
        
        int answer[] = new int[sums.size()];
        for(int i = 0; i < sums.size(); i++){
            answer[i] = sums.get(i);
        }
        
        return answer;
    }
}

````
