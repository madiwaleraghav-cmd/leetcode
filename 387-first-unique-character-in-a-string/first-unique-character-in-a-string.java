class Solution {
    public int firstUniqChar(String s) {
      int[] hash=new int[26];

      for(char ch:s.toCharArray()){
        hash[ch-'a']++;
      }

      for(int i=0;i<s.length();i++){
        int num=hash[s.charAt(i)-'a'];
        if(num==1){
            return i;
        }
      }
      return -1;  
    }
}