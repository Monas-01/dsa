public boolean containsDuplicate(int[] nums) {
    HashMap<Integer,Integer> hashMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        hashMap.put(nums[i],i );
    }
    if (hashMap.size()==nums.length) return false;

    else return true;
}

void main(){

}