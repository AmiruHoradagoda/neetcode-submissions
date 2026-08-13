class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>s_track = new HashMap<>();
        HashMap<Character,Integer>t_track = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(!s_track.containsKey(s.charAt(i))){
                s_track.put(s.charAt(i),1);
            }else{
                int temp = s_track.get(s.charAt(i));
                s_track.put(s.charAt(i),++temp); 
            }
            if(!t_track.containsKey(t.charAt(i))){
                t_track.put(t.charAt(i),1);
            }else{
                int temp = t_track.get(t.charAt(i));
                t_track.put(t.charAt(i),++temp); 
            }
            
        }
        for(var key : s_track.keySet()){
            // if(s_track.get(key)!=t_track.get(key)){
            //     return false;
            // }
            if(!s_track.get(key).equals(t_track.get(key))){
                return false;
            }
        }
        return true;

    }
}
