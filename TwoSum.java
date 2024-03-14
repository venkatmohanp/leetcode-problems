class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resultSet = new int[2];
        for(int i = 0; i < nums.length; i++){
            int currentElement = nums[i];
            int valueToFind = target - currentElement;
           for(int j = i + 1; j < nums.length; j++){
                if(valueToFind == nums[j]){
                    resultSet[0] = i;
                    resultSet[1] = j;
                    return resultSet;
                }
           } 
        }
        return resultSet;
    }
}
