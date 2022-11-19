class Solution {
    public int lengthOfLastWord(String s) {
          String trim = s.trim();
        int afterLastSpaceIndex = trim.lastIndexOf(' ') + 1;
        return trim.length() - afterLastSpaceIndex;
    }
}