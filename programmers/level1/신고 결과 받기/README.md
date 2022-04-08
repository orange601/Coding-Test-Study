## 신고 결과 받기 ##
	> 각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
	> 신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
	> 한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
	> k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
	> 유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.

````java
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] ret = new int[id_list.length];
        Map<String, Integer> index = new HashMap<>();
        Map<String, List<Integer>> list = new HashMap<>();
		
        for(int i=0 ; i<id_list.length ; i++) {
			index.put(id_list[i],i);
		}
        
        for(String rep : report) {
        	String[] ids = rep.split(" ");
        	String fromId=ids[0], toId=ids[1];
        	if(!list.containsKey(toId)) list.put(toId, new ArrayList<>());
        	List<Integer> tmp = list.get(toId);
        	if(!tmp.contains(index.get(fromId))) tmp.add(index.get(fromId));
        }
        
        for(int i=0 ; i<id_list.length ; i++) {
        	String id = id_list[i];
        	if(list.containsKey(id) && list.get(id).size()>=k) {
	        	for(int idx : list.get(id)) {
	        		ret[idx]++;
	        	}
        	}
        }
        
        return ret;
    }
}
````
