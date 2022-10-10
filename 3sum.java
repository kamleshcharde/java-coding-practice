class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        // intialize variables
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> triplet = new ArrayList<Integer>();
        int sum = 0;
        
        // sort input num array and setup two pointers to traverse it
        Arrays.sort(nums);
        int a = 0;
        int b = 0;
        System.out.println("sorted :" + Arrays.toString(nums));
            
        // iterate through array using the first integer of a triplet
        for (int i = 0; i < nums.length - 2; i++) {
            
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {

                // reset pointers
                a = i + 1;
                b = nums.length - 1;

                // move pointers while checking for zero-sums
                while (a < b) {

                    sum = nums[i] + nums[a] + nums[b];
                    //System.out.println("sum: " + sum + ", i: " + i + ", a: " + a + ", b: " + b);

                    if (sum == 0) {
                        list.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[a], nums[b])));
                        //System.out.println("match");

                        while(a < b && nums[a] == nums[a + 1]) a++;
                        while(a < b && nums[b] == nums[b - 1]) b--;
                    }
                    if (sum <= 0) a++;
                    if (sum > 0) b--;
                }
            }
        }
        
        return list;
    }
}
