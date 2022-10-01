class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
   List<Integer> l = new ArrayList();
        
        int idx = binarySearch(arr,x);
        
        int i = idx-1;
        int j = idx+1;
      
       
        l.add(arr[idx]);
        int n = arr.length;
        while((i >= 0 || j < arr.length) &&  k > 1){
            
            if(i >= 0 && j < n){
                
                if(Math.abs(x-arr[i]) > Math.abs(x-arr[j])){
                    l.add(arr[j]);
                   
                    k--;
                    j++;
                }else if(Math.abs(x-arr[i]) < Math.abs(x-arr[j])){
                    
                    l.add(arr[i]);
                    k--;
                    i--;
                }else{
                    
                   l.add(arr[i]);
                    i--;
                    k--;
                }
            }else if(j < n){
                l.add(arr[j]);
                k--;
                j++;
            }else if( i >= 0){
                l.add(arr[i]);
                k--;
                i--;
            }
        }
        Collections.sort(l);
        return l;
        
        
        
    }
    
    private int binarySearch(int[] arr, int x){
        
        
        int l = 0;
        int h = arr.length-1;
        int min = Integer.MAX_VALUE;
        int idx = Integer.MAX_VALUE;
        while(l <= h){
            
            int mid = (h+l)/2;
           
            if(min >= Math.abs(arr[mid] - x)){
                if(min == Math.abs(x-arr[mid])){
                    idx = Math.min(idx,mid);
                }else{
                    idx = mid;
                }
                
                min = Math.abs(x-arr[mid]);
            }
            if(arr[mid] < x){
                l = mid+1;
            }else if(arr[mid] > x){
                h = mid-1;
            }else{
                return mid;
            }
            
        }
        
        return idx;
    }
}
