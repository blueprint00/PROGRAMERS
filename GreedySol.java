
public class GreedySol {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] cnt = new int[n];
        int idxR = 0, idxL = 0;
        int idx = 0;
        
        for(int i = 0; i < n; i ++) cnt[i] = 1;
        
        for(int i = 0; i < n; i ++){
        	if(i + 1 == reserve[idxR]){
        		cnt[i] ++;
        		idxR ++; if(idxR == reserve.length) break;
        	}
    	}
        for(int i = 0; i < n; i ++){
        	if(i + 1 == lost[idxL]){
        		cnt[i] --;
        		idxL ++; if(idxL == lost.length) break;
        	}
        } //ÃÊ±âÈ­
        
        for(int i = 0; i < n; i ++){
        	System.out.print(cnt[i]); 
        }System.out.println("");
        
        /*
        for(int i = 0; i < n; i ++){
        	if(i == 0) {
        		if(cnt[i] == 2){
        			if(cnt[i + 1] == 0){
        				cnt[i] --;
        				cnt[i + 1] ++;
        			}
        		} 
        	} else if(i == n - 1){
        		if(cnt[i] == 2){
        			if(cnt[i - 1] == 0){
        				cnt[i] --;
        				cnt[i - 1] ++;
        			} 
        		}
        	} else {
        		if(cnt[i] == 2){
        			if(cnt[i - 1] == 0){
        				cnt[i] --;
        				cnt[i - 1] ++;
        			} else if(cnt[i + 1] == 0){
        				cnt[i] --;
        				cnt[i + 1] ++;
        			}
        		}
        	}
        }
        for(int i = 0; i < n; i ++)
        	if(cnt[i] != 0) answer ++;*/
        
        
        //answer = n - lost.length;
        //System.out.println(answer);
        /*
        for(int i = 0; i < lost.length; i ++){
         
        	idx = lost[i] - 1;
            
            if(cnt[idx - 1] == 2){
            	cnt[idx - 1] = 1;
            	answer ++;
            }else if(cnt[idx + 1] == 2){
            	cnt[idx + 1] = 1;
            	answer ++;
            } System.out.print(answer);
        }System.out.println("");//*/
        
        for(int i = 0; i < lost.length; i ++){
        	idx = lost[i] - 1;
        	boolean b1 = true, b2 = true;
            if(idx - 1 < 0) b1 = false;
            if(idx + 1 >= n) b2 = false;
            if(b1){
	            if(cnt[idx - 1] == 2){
	            	cnt[idx - 1] = 1;
	            	cnt[idx] = 1;
	            	//answer ++;   	
	            }
            }
            if(b2){
	            if(cnt[idx + 1] == 2){
	            	if(cnt[idx] == 0){ // cnt[idx] != 2
	    	            cnt[idx + 1] = 1;
	    	            cnt[idx] = 1;
	    	            //answer ++;
		            }
	            } //System.out.print(answer);
	        }//System.out.println("");
        }
        for(int i = 0; i < n; i ++) if(cnt[i] > 0) answer ++;
        for(int i = 0; i < n; i ++) System.out.print(cnt[i]); System.out.println("");
        
        return answer;
    }
    public static void main(String[]args){
    	int[] lost = {2, 4, 5, 10, 13}; //{2, 6, 8, 9};//
    	int[] reserve = {3, 12, 14};//{3, 7, 9};//, 10};// 
    	System.out.println(solution(14, lost, reserve));
    }
}
