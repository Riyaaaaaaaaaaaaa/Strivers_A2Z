class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {
        // Your code goes here
        int max = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            if(max < nums[i]) {
                max = nums [i];
            }
        }
        int[] hash = new int[max + 1]; 
        for(int i = 0 ; i < nums.length ; i++) {
            hash[nums[i]]++;
        }
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i <= max; i++) {
            if (hash[i] > 0) {
                List<Integer> pair = new ArrayList<>();
                pair.add(i);          // number
                pair.add(hash[i]);    // frequency
                result.add(pair);
            }
        }
        return result;
    }
}
