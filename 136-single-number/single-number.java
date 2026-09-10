class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int value : nums){
            count.put(value, count.getOrDefault(value, 0) + 1); 
        }
        for(int value : nums){
            if(count.get(value) == 1){
                return value;
            }
        }
        return 0;
    }
}