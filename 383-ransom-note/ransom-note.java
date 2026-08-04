class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
           HashMap<Character,Integer> map2=new HashMap<>();
           int count=0;

        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);

            map2.put(ch,map2.getOrDefault(ch,0)+1);

            if(map.containsKey(ch)){
                if(map2.get(ch)<=map.get(ch)){
                    count++;
                }
            }

            if(count==ransomNote.length()){
                return true;
            }
        }
        System.out.print(map2);
        return false;
    }
}