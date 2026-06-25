
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            // Calculate the width between the two vertical lines
            int width = right - left;

            // The water height is limited by the shorter line
            int currentHeight = Math.min(height[left], height[right]);

            // Calculate current water capacity
            int currentWater = width * currentHeight;

            // Track the maximum water found so far
            maxWater = Math.max(maxWater, currentWater);

            // Move the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    void main(){

    }