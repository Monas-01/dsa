public  static String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";

    String prefix = strs[0];

    for (int i = 1; i < strs.length; i++) {
        String current = strs[i];
        int j = 0;

        while (j < prefix.length() && j < current.length() && prefix.charAt(j) == current.charAt(j)) {
            j++;
        }

        prefix = prefix.substring(0, j);

        if (prefix.isEmpty()) return "";
    }

    return prefix;
}

void main(){
    System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
}