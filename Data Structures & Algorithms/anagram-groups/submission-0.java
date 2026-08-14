class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> track = new HashMap<>();

        for (String str : strs) {

            int[] key = new int[26];

            for (char ch : str.toCharArray()) {
                key[ch - 'a']++;
            }

            String mapKey = Arrays.toString(key);

            track.putIfAbsent(mapKey, new ArrayList<>());
            track.get(mapKey).add(str);
        }

        return new ArrayList<>(track.values());
    }
}