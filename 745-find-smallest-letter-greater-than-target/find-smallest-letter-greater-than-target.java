class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        

        if(letters[letters.length-1]-'a'<=target-'a'){
            return letters[0];
        }
        char ch=target;
        int low=0;
        int high=letters.length-1;


        while(low<=high){

            int mid=low+(high-low)/2;

            int code=letters[mid]-'a';

            if(code>target-'a'){
                ch=letters[mid];
                high=mid-1;
            }else{
                low=mid+1;
            }


            
        }
        return ch;
    }
}