class Solution {
    public int diagonalSum(int[][] mat) {
        if(mat.length==1 && mat[0].length==1){
            return mat[0][0];
        }
       int sum=0;
        int row=mat.length;
        int col=mat[0].length;

        if(row!=col){
            return 0;
        }

        if(row*col%2==0){

            int i=0,y=0;
            
            while(i<row && y<col){
                 sum+=mat[i][y];
                 i++;
                 y++;
            }

            int k=mat[0].length-1,j=0;

            while(j<row && k>=0){
                sum+=mat[j][k];
                j++;
                k--;
            }

        }else{
          int i=0,y=0;
            
            while(i<row && y<col){
                 sum+=mat[i][y];
                 i++;
                 y++;
            }

            int k=mat[0].length-1,j=0;

            while(j<row && k>=0){
                sum+=mat[j][k];
                j++;
                k--;
            }
            int remove=mat.length/2;
           sum=sum-mat[remove][remove];

        }
        return sum;
    }
}