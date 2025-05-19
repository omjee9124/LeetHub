class Solution {
    public String triangleType(int[] nums) {
        //check if it is a rectangle or not
        String n = "none";
        if(!(nums[0] + nums[1] > nums[2]) || !(nums[1] + nums[2] > nums[0] )|| !(nums[0]+ nums[2] > nums[1])){
        return n;

        }
        else{
           String a = "equilateral";
        String b = "isosceles";
        String c = "scalene";
        if(nums[0] == nums[1] && nums[0] == nums[2]){
            return a;
        }else if(nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]){
            return b;
        }else{
            return c;
        }
        }
        
    }
}