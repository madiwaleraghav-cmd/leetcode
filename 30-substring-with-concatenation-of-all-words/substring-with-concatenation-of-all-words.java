import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        if (s == null || words == null || words.length == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        if (s.length() < totalLen) {
            return result;
        }

        // Stores how many times each word should appear
        HashMap<String, Integer> required = new HashMap<>();

        for (String word : words) {
            required.put(word, required.getOrDefault(word, 0) + 1);
        }

        /*
         * We have to check wordLen different starting positions.
         *
         * Example wordLen = 3:
         * start = 0 -> positions 0,3,6,9...
         * start = 1 -> positions 1,4,7,10...
         * start = 2 -> positions 2,5,8,11...
         */
        for (int start = 0; start < wordLen; start++) {

            int left = start;
            int right = start;

            int count = 0;

            // Words currently present inside our sliding window
            HashMap<String, Integer> current = new HashMap<>();

            while (right + wordLen <= s.length()) {

                // Take one word from s
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                // If this word is not present in words[]
                if (!required.containsKey(word)) {

                    current.clear();
                    count = 0;
                    left = right;

                    continue;
                }

                // Add word to current window
                current.put(word, current.getOrDefault(word, 0) + 1);
                count++;

                /*
                 * If a word appears more times than required,
                 * remove words from the left until valid again.
                 */
                while (current.get(word) > required.get(word)) {

                    String leftWord = s.substring(left, left + wordLen);

                    current.put(
                        leftWord,
                        current.get(leftWord) - 1
                    );

                    left += wordLen;
                    count--;
                }

                /*
                 * If window contains exactly all words,
                 * we found an answer.
                 */
                if (count == wordCount) {

                    result.add(left);

                    // Move left forward to search for next answer
                    String leftWord = s.substring(left, left + wordLen);

                    current.put(
                        leftWord,
                        current.get(leftWord) - 1
                    );

                    left += wordLen;
                    count--;
                }
            }
        }

        return result;
    }
}