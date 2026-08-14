class Solution {
    public boolean isPalindrome(String s) {
        List<Character>sList=new ArrayList<>();;
        for(var ch :s.toLowerCase().toCharArray()){
            if ((ch >= 'a' && ch <= 'z')||(ch >= '0' && ch <= '9') ){
                sList.add(ch);
            }
        }
        int l = 0;
        int r = sList.size()-1;
        while(l<=r){
            if(sList.get(l)!=sList.get(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
