public static int maxArea(int[] height) {
    int maxWater = 0;

    for (int i = 0; i < height.length; i++) {
        for (int j = i + 1; j < height.length; j++) {
            int width = j - i;
            int h = Math.min(height[i], height[j]); // water limited by shorter line
            int area = width * h;
            if (area > maxWater) {
                maxWater = area;
            }
        }
    }
    return maxWater;
}

void main() {
    System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7})); // 49
    System.out.println(maxArea(new int[]{1,1}));                // 1
}