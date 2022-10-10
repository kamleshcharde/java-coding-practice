class Solution {
    public int maxArea(int[] A) {
        int N = A.length;
        int ans = Integer.MIN_VALUE;
        int i=0, j=N-1;
        
        while(i <= j) {
            ans = Math.max(ans, (Math.min(A[i], A[j]) * (j-i)));
            
            if(A[i] < A[j]) {
                i++;
            } else {
                j--;
            }
        }
        
        return ans;
        
    }
}
