class Solution {
    public int searchInsert(int[] arr, int m) {
        int ind = find(arr,0,arr.length-1,m,arr.length);
        return ind;
    }
    static int find(int a[],int l,int h,int t,int ans){
        if(l>h) return ans;
        int mid=(l+h)/2;
        if(a[mid]==t) return mid;
        else if(a[mid]>t) return find(a, l, mid-1, t, mid);
        else return find(a, mid+1, h, t, ans);
    }
}
