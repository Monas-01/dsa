public static int findClosestNumber(int[] nums) {
int result = Integer.MAX_VALUE;
    for (int i : nums) {
        if (Math.abs(i) < Math.abs(result) || i==Math.abs(result)){
            result=i;
        }
    }
    return result;
}
void main() {
    int[] nums ={-4,-2,1,-1,4,8};
    int result = findClosestNumber(nums);
    System.out.println("The closest distance to 0 is: "+result);
}

// Time complexity: BigO(n)