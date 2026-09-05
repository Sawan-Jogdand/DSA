class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n*n;

        int[] count = new int[total + 1];

        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                int value=grid[i][j];
                count[value]++;
            }
        }
        int repeate = 0;
        int missing = 0;

        for(int value =1; value <= total; value++){
            if(count[value] == 2){
                repeate = value;
            }
            if(count[value] == 0){
                missing = value;
            }
        }
        return new int[]{repeate, missing};
    }
}