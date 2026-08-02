class Solution {
    public List<Integer> findAnagrams(String s, String p) {
     
      int[] pcount=new int[26];
      int[] scount=new int[26];
      ArrayList<Integer> list=new ArrayList<>();

      for(char c:p.toCharArray()){
        pcount[c-'a']++;
      } 

      for(int i=0;i<s.length();i++){

        scount[s.charAt(i)-'a']++;

        if(i>=p.length()){
            scount[s.charAt(i-p.length())-'a']--;
        }

        if(Arrays.equals(scount,pcount)){
          list.add(i-p.length()+1);
        }
      }
      return list;
    }
}