class Solution {
    public boolean search(int[] a, int t) {
        int l=0,h=a.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(a[mid]==t) return true;
            if(a[l]==a[mid] && a[mid]==a[h]){
                l++;
                h--;
                continue;
            }
            if(a[l]<=a[mid]){
                if(t>=a[l] && t<=a[mid]){
                    h=mid-1;
                }
                else l=mid+1;
            }
            else {
                if(a[mid]<=t && t<=a[h]){
                    l=mid+1;
                }
                else h=mid-1;
            }
        }
        return false;
    }
}
