class Solution {
    public int removeDuplicates(int[] nums) {
       List<Integer>list=new ArrayList<>();
        int r=0;
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        List<Integer> collect = list.stream().distinct().toList();
        for (Integer integer : collect) {
            nums[r++]=integer;
        }
        return collect.size();
    }
}