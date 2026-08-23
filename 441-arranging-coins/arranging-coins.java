class Solution {
    public int arrangeCoins(int n) {


       int num=0;
       int coin=1;

       while(n>=1){

         if(coin<=n){
            n=n-coin;
            coin++;
            num++;
         }else{
            break;
         }
       }
       return num; 
    }
}