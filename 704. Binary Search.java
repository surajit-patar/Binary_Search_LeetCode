class Solution {
    public int search(int[] nums, int target) {
        int num = find(nums,0,nums.length-1,target);
        return num;
    }
    static int find(int nums[],int l,int h, int t){
        if(l>h){
            return -1;
        }
        int mid = (l+h)/2;
        if(t==nums[mid]) return mid;
        else if(nums[mid]>t) return find(nums,l,mid-1,t);
        else return find(nums, mid+1, h, t);
    }
}
