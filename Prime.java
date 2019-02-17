import java.util.*;

public class Prime {
	/*
	public int solution(int n){
		int answer = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 2; i <= n; i ++) arr.add(i);
		
		for(int i = 0; i < arr.size(); i ++){
			if(arr.get(i) == 0) continue;
			
			for(int j = i + arr.get(i); j < arr.size(); j += arr.get(i)){
				arr.add(j, 0);
				arr.remove(j + 1);
			}
			answer ++;
		}
		return answer;		
	}//*/
	
	
	public int solution(int n){
		int answer = 0;
		int[] arr = {};
		int i;
		
		arr[0] = arr[1] = 0;
		for(i = 2; i <= n; i ++){
			arr[i] = i;
		}
		
		for(i = 2; i <= n; i ++){
			if(arr[i] == 0) continue;
			for(int j = i + i; j <= n; j += i) arr[j] = 0;
			//answer ++;
		}
		
		for(i = 2; i <= n; i ++)
			if(arr[i] != 0) answer ++;
		
		return answer;		
	}
}
