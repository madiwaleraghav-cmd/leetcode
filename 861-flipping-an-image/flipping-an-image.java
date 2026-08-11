class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        

        for(int x=0;x<image.length;x++){
            int i=0;
            int j=image[x].length-1;

            while(i<=j){
                if(image[x][i]==1){
                    image[x][i]=0;
                }else{
                    image[x][i]=1;
                }
                if(i==j){
                    i++;
                    j--;
                    continue;
                }

                if(image[x][j]==1){
                    image[x][j]=0;
                }else{
                    image[x][j]=1;
                }

                int temp=image[x][i];
                image[x][i]=image[x][j];
                image[x][j]=temp;
                i++;
                j--;
            }
        }
     return image;   
    }
}