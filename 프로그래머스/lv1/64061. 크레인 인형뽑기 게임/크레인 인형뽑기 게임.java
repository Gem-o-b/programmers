import java.util.ArrayList;

import java.util.List;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < moves.length ; i++) {
            for (int j = 0; j < board.length; j++) {
               
                if(board[j][moves[i]-1]!=0){
                    if(list.size()>0){
                      
                        if(board[j][moves[i]-1] == list.get(list.size()-1)){

                            list.remove(list.size()-1);
                            board[j][moves[i]-1]=0;
                            answer+=2;
                            break;
                        }else{

                            list.add(board[j][moves[i]-1] );
                            
                            board[j][moves[i]-1]=0;

                            break;
                        }
                    }else{

                        list.add(board[j][moves[i]-1] );
                        board[j][moves[i]-1]=0;
                        break;
                    }

                }
         
            }
          
        }



        return answer;
    }
}