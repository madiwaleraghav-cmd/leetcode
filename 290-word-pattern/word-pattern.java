class Solution {
    public boolean wordPattern(String pattern, String s) {
        int i=0;

        while(s.charAt(i)==' '){
            i++;
        }
        
        StringBuilder sb=new StringBuilder();
        HashMap<Character,String> map=new HashMap<>();
        int start=0;
        
        for(int j=i;j<s.length();j++){

            if(start==pattern.length()){
                return false;
            }
           if(s.charAt(j)==' ' || j==s.length()-1){

            if(j==s.length()-1 && s.charAt(j)!=' '){
               sb.append(s.charAt(j));
            }

             
              if(map.containsKey(pattern.charAt(start))) {
               
                String s1=map.get(pattern.charAt(start));
               
                if(!s1.equals(sb.toString())){
                    return false;
                }
                
               }
               else if(map.containsValue(sb.toString())){
                return false;
               }
               map.put(pattern.charAt(start),sb.toString());
               sb.setLength(0);
               start++;

               
              
            }  
           else{
            sb.append(s.charAt(j));
           }
        }

        if(start!=pattern.length()){
            return false;
        }
        System.out.print(map);
        return true;
    }

}