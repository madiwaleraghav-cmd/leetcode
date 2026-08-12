class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if(r*c!=mat.length*mat[0].length){
            return mat;
        }
       int[][] matrix=new int[r][c];

        int putr=0; 
        int putc=0;
       for(int i=0;i<mat.length;i++){

        for(int j=0;j<mat[0].length;j++){
            
             if(putc<c){
                matrix[putr][putc]=mat[i][j];
                putc++;
                continue;
             }else{
                putr++;
                putc=0;
             }

             if(putr<r){
                matrix[putr][putc]=mat[i][j];
                putc++;
             }
            
            

             
        }

       }



    return matrix;
    }
}