class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

     int le=matrix[0].length-1;
      int i=0,j=0,rl=matrix.length-1;

      while(i<=rl){

        if(i<0){
            return false;
        }

        int mid=i+(rl-i)/2;

        if(target==matrix[mid][0]){

            return true;
        }

        if(target<matrix[mid][0]){
            rl=mid-1;
        }else{
            if(target<=matrix[mid][le]){
                i=mid;
                break;
            }
            i=mid+1;
        }
      }

      

       if(i==matrix.length){
        return false;
       }

       while(j<=le){

        int mid=j+(le-j)/2;

        if(target==matrix[i][mid]){
            return true;
        }

        if(target<matrix[i][mid]){
            le=mid-1;
        }else{
            j=mid+1;
        }
       } 
       System.out.print(i+","+j);
       return false;
    }
}