class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=Integer.MIN_VALUE;

        for(int i=0;i<accounts.length;i++){
            int tsum=0;
            for(int j=0;j<accounts[0].length;j++){
                tsum+=accounts[i][j];
            }
            if(tsum>sum){
                sum=tsum;
            }
        }

        return sum;
    }
}