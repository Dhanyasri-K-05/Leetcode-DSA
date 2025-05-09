class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();

            int rowcount = 0;
            int colcount = 0;
            int boxcount = 0;
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    rowcount++;
                    row.add(board[i][j]);
                }

                if (board[j][i] != '.') {
                    colcount++;
                    col.add(board[j][i]);
                }

            }

            if (rowcount != row.size())
                return false;
            if (colcount != col.size())
                return false;

        }

int setcount=0;
HashSet<Character> set=new HashSet<>();

        for(int i=0;i<board.length;i=i+3){
           
            for(int j=0;j<9;j=j+3){
                 if(i%3==0 && j%3==0){ 
                    set.clear();
                 setcount=0;}
            int l=0;
            while(l<3){
                int k=0;
            while(k<3){
                if(board[i+l][j+k]!='.')
                 {
                    setcount++;
                    set.add(board[i+l][j+k]);
                 
                 }
                 k++;



            }
          l++;

            }

            if(setcount!=set.size())return false;



            }

        }











        return true;

    }
}