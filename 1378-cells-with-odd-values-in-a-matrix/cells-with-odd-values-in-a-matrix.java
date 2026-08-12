class Solution {
    public int oddCells(int m, int n, int[][] indices) {
     int[][] mat=new int[m][n];
    int Arow=m;
    int Acol=n;
         for(int i=0;i<indices.length;i++){

            int row=indices[i][0];
            int col=indices[i][1];
            int k=0;
            while(k<Acol){
              mat[row][k]++;
              k++;
            }

            int l=0;

            while(l<Arow){
                mat[l][col]++;
                l++;
            }
         }

         int count=0;

         for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]%2==1){
                    count++;
                }
            }
         }
      return count;   
    }
}