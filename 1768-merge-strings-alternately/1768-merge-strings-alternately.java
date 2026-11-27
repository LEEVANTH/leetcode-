class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        char[] arr = new char[len1 + len2];

        int i = 0, k = 0;

        while (i < len1 || i < len2) {
            if (i < len1) {
                arr[k++] = word1.charAt(i);
            }

            if (i < len2) {
                arr[k++] = word2.charAt(i);
            }

            i++;
        }

        return new String(arr);
    }
}