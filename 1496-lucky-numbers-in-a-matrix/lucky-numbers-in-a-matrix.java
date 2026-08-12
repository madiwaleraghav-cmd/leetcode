class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        List<Integer> lucky=new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            int rowmin=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<rowmin){
                    rowmin=matrix[i][j];
                    
                }
                
            }
            list.add(rowmin);
        }

        for(int i=0;i<matrix[0].length;i++){
            int colmax=Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i]>colmax){
                    colmax=matrix[j][i];
                }
            }
            if(list.contains(colmax)){
                lucky.add(colmax);
            }
        }
        System.out.print(list);
        return lucky;
    }
}