class Solution {
    public int countSubstrings(String s) {
          int count=0;

     for(int i=0;i<s.length();i++){

        if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
            int left=i;
            int right=i+1;

            while((left>=0 && right<s.length()) && (s.charAt(left)==s.charAt(right))){
                 
                
                
               count+=1;
                left--;
                right++;
            }

           
        }

            int left=i;
            int right=i;

            while((left>=0 && right<s.length()) && (s.charAt(left)==s.charAt(right))){
                 
            count++;
                left--;
                right++;
            }

            
        
     }   
      return count;
    }
}