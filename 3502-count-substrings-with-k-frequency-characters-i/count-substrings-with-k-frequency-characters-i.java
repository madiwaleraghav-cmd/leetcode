class Solution {
    public int numberOfSubstrings(String s, int k) {
        int count=0;

      HashMap<Character,Integer> map=new HashMap<>();

     int i=0,j=0;

     while(j<s.length()){

      char ch=s.charAt(j);

      map.put(ch,map.getOrDefault(ch,0)+1);

      while(map.get(ch)==k){
        count+=s.length()-j;
        map.put(s.charAt(i),map.get(s.charAt(i))-1);
        i++;
    
      }
      
      j++;



    
     }
     System.out.print(i);
     return count;
    }
}