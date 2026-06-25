public static boolean isSubsequence(String s, String t) {
    int j = 0;

    for (char c : s.toCharArray()) {
        while (j < t.length() && t.charAt(j) != c) {
            j++;
        }

        if (j == t.length()) {
            return false;
        }
        j++;
    }
    return true;
}
void main() {
    System.out.println(isSubsequence("ace", "abcde"));
    System.out.println(isSubsequence("aec", "abcde"));

}
