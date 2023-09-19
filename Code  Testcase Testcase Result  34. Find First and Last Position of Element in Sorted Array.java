class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        // int up;
        int lb = findl(nums,0,nums.length-1,target,nums.length);
        if(lb==nums.length || nums[lb]!=target){
            res[0]=-1;
            res[1]=-1;
            return res;
        }
        int up= findu(nums,0,nums.length-1,target,nums.length);

        res[0]=lb;
        res[1]=up-1;
    return res;
    }
    static int findl(int a[],int l,int h,int t,int ans){
        if(l>h) return ans;
        int mid=(l+h)/2;
        if(a[mid]>=t){
            return findl(a,l,mid-1,t,mid);
        }
        else return findl(a,mid+1,h,t,ans);
    }
    static int findu(int a[],int l,int h,int t,int ans){
        if(l>h) return ans;
        int mid=(l+h)/2;
        if(a[mid]>t){
            return findu(a,l,mid-1,t,mid);
        }
        else return findu(a,mid+1,h,t,ans);
    }
}
