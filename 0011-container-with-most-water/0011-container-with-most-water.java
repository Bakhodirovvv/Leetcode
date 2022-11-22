class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int result = 0;
        
        int area = 0;
        while (left < right) {
            area = (right -left) * Math.min(height[left], height[right]);
            result = Math.max(area, result);
            
            if (height[left] < height[right]) {
                left ++;
            } else {
                right --;
            }
        }
        return result;
    }   
}