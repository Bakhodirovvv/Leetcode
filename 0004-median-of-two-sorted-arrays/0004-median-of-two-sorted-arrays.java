class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double num=0;
        List<Integer> list=new ArrayList<>();

       for (int i : nums1) {
           list.add(i);
       }
       for (int i : nums2) {
           list.add(i);
       }
        Collections.sort(list);
    int  a=list.get((list.size()-1)/2);
    int b=list.get(list.size()/2);
    if((list.size())%2==0){
        return  (double) (a+b)/2;
    }else
    {return a;}
    }
}