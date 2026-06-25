public static List<List<String>> groupAnagrams(String[] strs) {
    boolean[] visited = new boolean[strs.length];
    List<List<String>> result = new ArrayList<>();

    for (int i = 0; i < strs.length; i++) {
        if (visited[i]) continue;

        List<String> group = new ArrayList<>();
        group.add(strs[i]);

        for (int j = i + 1; j < strs.length; j++) {
            if (!visited[j] && isAnagram(strs[i], strs[j])) {
                group.add(strs[j]);
                visited[j] = true;
            }
        }
        result.add(group);
    }
    return result;
}

// reusing isAnagram from last problem
public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    int[] count = new int[26];
    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
    }
    for (int c : count) if (c != 0) return false;
    return true;
}

void main(){

}