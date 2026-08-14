class Solution {
    public int scoreOfString(String s) {
        int left = 0;
        int right = 1;
        int sum=0;
        char[] charArray = s.toCharArray();
        while(left<=right && right<=s.length()-1){
            sum += Math.abs(charArray[right]-charArray[left]);
            left=right;
            right++;
        }
        return sum;
    }
}