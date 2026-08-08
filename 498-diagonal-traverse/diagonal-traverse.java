class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
       
       if(mat.length==0 || mat[0].length==0){
        return new int[0];
       }

       int row=mat.length,col=mat[0].length;
       int cou=row*col;
     
       int[] count=new int[cou];

       int k=0,i=0,j=0;
       boolean flag=true;

       while(i<row && j<col){
            if(flag){
                while(i>0 && j<col-1){
                  count[k++]=mat[i][j];
                  i--;
                  j++;
                }
                count[k++]=mat[i][j];
                if(j==col-1){
                    i++;
                }else{
                    j++;
                }

            }else{
                while(i<row-1 && j>0){
                    count[k++]=mat[i][j];
                    i++;
                    j--;
                }
                count[k++]=mat[i][j];

                if(i==row-1){
                    j++;

                }else{
                    i++;
                }
            }
            flag=!flag;
       }

       return count;
    }
}