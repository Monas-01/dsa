public static String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);
    String firstStr = strs[0];
    String lastStr = strs[strs.length-1];
    int index =0;

    while (index < firstStr.length()) {
        if (firstStr.charAt(index) == lastStr.charAt(index)) {
            index++;
        }
        else {
            break;
        }
    }
    return index==0 ?"": firstStr.substring(0,index);
}

void main(){
    System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
}