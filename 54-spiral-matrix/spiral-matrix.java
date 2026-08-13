class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> list=new ArrayList<>();

       int rb=0,cb=0;
       int re=matrix.length-1,ce=matrix[0].length-1;


       while(rb<=re && cb<=ce){

          for(int j=cb;j<=ce;j++){
            list.add(matrix[rb][j]);
          }
          rb++;

          for(int j=rb;j<=re;j++){
            list.add(matrix[j][ce]);
          }
          ce--;

          if(rb<=re){
            for(int j=ce;j>=cb;j--){
                list.add(matrix[re][j]);
            }
           
          }
          re--;

          if(cb<=ce){
            for(int j=re;j>=rb;j--){
                list.add(matrix[j][cb]);
            }
           
          }
          cb++;
       }

      return list;  
    }
}