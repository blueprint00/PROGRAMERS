import java.util.ArrayList;

public class NSolution {
	
	public static void main(String[] args){
		System.out.println(solution(5,12));
	}
	
	public static int solution(int N, int number) {
		/*
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		int tmp = 0;
		int cnt = 0;
		String tmpStr = "";
		
		int answer = 0;
		return answer;
		*/
		
		int answer = 0;
		
		
		return answer;
	}
	public int sol(int N, int n){
		if(n == 0) return 0;
		
		int por, rest;
		
		
		por = n / N; 
		rest = n % N;
		
		return sol(N, por) + sol(N, rest);
	}
}
