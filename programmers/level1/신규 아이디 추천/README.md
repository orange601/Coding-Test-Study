## 신규 아이디 추천 ##

### 문제 설명 ###
  - 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
  - 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
  - 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
  - 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
  - 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
  - 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
     + 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
  - 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.

### 입출력 예 ###
no | new_id | result
---- | ---- | ---- 
예1 | "...!@BaT#*..y.abcdefghijklm" | "bat.y.abcdefghi"
예2 | "z-+.^." | "z--"
예3 | "=.=" | "aaa"


### 풀이 ###
````java
class Solution {
    public String solution(String new_id) {
        // 1. 대문자 > 소문자
        new_id = new_id.toLowerCase();
        // 2. 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        new_id = new_id.replaceAll("[^a-zA-Z0-9-_.]", "");
        // 3. 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        new_id = new_id.replaceAll("[.]{2,}", ".");
        // 4. 마침표(.)가 처음이나 끝에 위치한다면 제거
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        // 5. 빈 문자열이라면, new_id에 a를 대입
        if (new_id.equals("")){
            new_id += "a";
        }
        // 6. new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        // 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
        if(new_id.length() >= 16) {
            new_id = new_id.substring(0,15);
            new_id = new_id.replaceAll("[.]$","");
        }
        // 7. new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙인다.
        if(new_id.length() <= 2) {
            while(new_id.length() < 3) {
                new_id += new_id.charAt(new_id.length()-1);
            }
        }
        return new_id;
    }
}
````


### 다른 사람의 풀이 ###
````java
class Solution {
    public String solution(String new_id) {

        String s = new KAKAOID(new_id)
                .replaceToLowerCase()
                .filter()
                .toSingleDot()
                .noStartEndDot()
                .noBlank()
                .noGreaterThan16()
                .noLessThan2()
                .getResult();


        return s;
    }

    private static class KAKAOID {
        private String s;

        KAKAOID(String s) {
            this.s = s;
        }

        private KAKAOID replaceToLowerCase() {
            s = s.toLowerCase();
            return this;
        }

        private KAKAOID filter() {
            s = s.replaceAll("[^a-z0-9._-]", "");
            return this;
        }

        private KAKAOID toSingleDot() {
            s = s.replaceAll("[.]{2,}", ".");
            return this;
        }

        private KAKAOID noStartEndDot() {
            s = s.replaceAll("^[.]|[.]$", "");
            return this;
        }

        private KAKAOID noBlank() {
            s = s.isEmpty() ? "a" : s;
            return this;
        }

        private KAKAOID noGreaterThan16() {
            if (s.length() >= 16) {
                s = s.substring(0, 15);
            }
            s = s.replaceAll("[.]$", "");
            return this;
        }

        private KAKAOID noLessThan2() {
            StringBuilder sBuilder = new StringBuilder(s);
            while (sBuilder.length() <= 2) {
                sBuilder.append(sBuilder.charAt(sBuilder.length() - 1));
            }
            s = sBuilder.toString();
            return this;
        }

        private String getResult() {
            return s;
        }
    }
}
````
