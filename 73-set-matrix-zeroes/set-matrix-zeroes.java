class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rset=new HashSet<>();
          HashSet<Integer> cset=new HashSet<>();

          for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rset.add(i);
                    cset.add(j);
                }
            }
          }

          for(int i:rset){
            int row=i;
            int tcol=0;

            while(tcol<matrix[0].length){
                matrix[row][tcol]=0;
                tcol++;
            }

          }

          for(int j:cset){
             int col=j;
             int trow=0;

             while(trow<matrix.length){
                matrix[trow][col]=0;
                trow++;
             }
          }

    }
}