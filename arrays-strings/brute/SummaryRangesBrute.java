public List<String> summaryRanges(int[] nums) {
    List<String> result = new ArrayList<>();
    boolean[] visited = new boolean[nums.length];

    for (int i = 0; i < nums.length; i++) {
        if (visited[i]) continue;

        int start = nums[i];
        int end = nums[i];

        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] == nums[j - 1] + 1) {
                end = nums[j];
                visited[j] = true;
            } else {
                break;
            }
        }

        if (start == end) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + end);
        }
    }
    return result;
}

void main() {
    System.out.println(summaryRanges(new int[]{0,1,2,4,5,7})); 
    System.out.println(summaryRanges(new int[]{0,2,3,4,6,8,9}));

}