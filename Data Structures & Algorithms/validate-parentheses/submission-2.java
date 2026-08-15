
class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
        );

        Deque<Character> stack = new ArrayDeque<>();
        if(s.length()%2!=0){
            return false;
        }
        for(var ch :s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }else{
                if(stack.peek()==map.get(ch)){
                    stack.pop();
                }else{
                    return false;
                }
            }  
        }
        return stack.isEmpty()?true:false;

    }
}
