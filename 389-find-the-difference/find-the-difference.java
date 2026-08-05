class Solution {
    public char findTheDifference(String s, String t) {
       int[] shash=new int[26];
      

       for(char ch:s.toCharArray()){
        shash[ch-'a']++;
       }
       char ch1=t.charAt(0);
       for(char ch:t.toCharArray()){
        shash[ch-'a']--;

        if(shash[ch-'a']<0){
          ch1=ch;
        }
       } 
       
    return ch1;
    }
}