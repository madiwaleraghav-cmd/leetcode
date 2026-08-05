class Solution {
    public String minWindow(String s, String t) {
        int[] smap=new int[256];
        int[] tmap=new int[256];

        for(char ch: t.toCharArray()){
            tmap[ch]++;
        }

        int right=0;
        String s1="";
        int min=Integer.MAX_VALUE;

        for(int i=0;i<s.length();i++){

            while(right<s.length() && !desire(smap,tmap)){
                smap[s.charAt(right)]++;

                right++;
            }

            if(desire(smap,tmap) && right-i+1<min){
               s1=s.substring(i,right);
               min=right-i+1;
            }

            smap[s.charAt(i)]--;
        }
        return s1;

        

       
    }
    private boolean desire(int[] smap,int[] tmap){
            for(int i=0;i<tmap.length;i++){
                if(tmap[i]>smap[i]){
                    return false;
                }
            }
            return true;
        }
}