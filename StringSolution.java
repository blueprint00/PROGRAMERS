//package compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class StringSolution{
	/*
	public static void main(String args[]){
		class nameLength implements Comparator<String>{
			@Override
			public int compare(String arg0, String arg1) {
					if(arg0.length() > arg1.length())
						return 1;
					else if(arg0.length() < arg1.length())
						return -1;
					else
						return 0;
			}
		}
		
		String[] temp = new String[]{"a","b","c","d","e","ab","aaaaaa"};
		Arrays.sort(temp, new nameLength());
		for(String k : temp)
			System.out.print(k+" "); // a b c d e ab aaaaaa 
	}//*/
	//*
	public static void main(String[] args){
		
		String[] sen = new String[]{"sun", "bed", "car"};
		String[] answer = {};
		Solution sol = new Solution();
		
		answer = sol.solution(sen, 1);
		for(String k : answer) System.out.print(k + " ");
		
	}
	
	/*
	class NameSort implements Comparator<String>{
		public int compare(String arg0, String arg1){
			if(arg0.compareTo(arg1)>0) return 1;
			else if(arg0.compareTo(arg1) <0) return -1;
			else return 0;
		}
	}//*/
}

class Solution{
	public String[] solution(String[] strings, int n) {
		String[] answer = {};	
		String tmp;
		
		//*Bubble Sort
		for(int i = 0; i < strings.length - 1; i ++){
			for(int j = 0; j < strings.length - 1 - i; j ++){
				if(strings[j].substring(n, n + 1).compareTo(strings[j + 1].substring(n, n + 1)) > 0){
					tmp = strings[j];
					strings[j] = strings[j + 1];
					strings[j + 1] = tmp; 
					if(strings[j].substring(n,  n + 1).compareTo(strings[j + 1].substring(n,  n + 1)) > 0){
						tmp = strings[j];
						strings[j] = strings[j +
						                     1];
						strings[j + 1] = tmp; 
					}
				} else if(strings[j].substring(n, n + 1).compareTo(strings[j + 1].substring(n, n + 1)) == 0){
					if(strings[j].compareTo(strings[j + 1]) > 0){
						tmp = strings[j];
						strings[j] = strings[j + 1];
						strings[j + 1] = tmp;
					}
				}
			}
		}
		return strings;			
	}
}


/*Select Sort
int[] a = {15, 11, 1, 3, 8};
int temp; // 최솟값 저장
int idx = 0; // 최솟값의 인덱스
		
for(int i = 0; i < a.length; i++){
	temp = a[i];
	for(int j = i; j < a.length; j++){
		if(temp >= a[j]){
			temp = a[j];
			idx = j;
		} // 최솟값 찾기
	}
	temp = a[idx];
	a[idx] = a[i];
	a[i] = temp; // 찾은 최솟값과 지정 값 바꿔주기
}
for(int i = 0; i < a.length; i ++) System.out.println(a[i]);//*/

