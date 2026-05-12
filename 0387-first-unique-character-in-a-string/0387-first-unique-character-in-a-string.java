class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] ch = s.trim().toCharArray();
        for (char c : ch) {
            if(hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        for (int i = 0; i< ch.length; i++) {
            System.out.println(ch[i] + " value is " + hm.get(ch[i]));
            if(hm.containsKey(ch[i]) && hm.get(ch[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}