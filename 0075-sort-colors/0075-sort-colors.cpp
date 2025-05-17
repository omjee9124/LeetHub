class Solution {
public:
    void sortColors(vector<int>& nums) {
        int start = 0;
        int middle = 0;
        int last = nums.size() -1;

        while(middle <= last){
            switch (nums[middle]){
                case 0:
                    swap(nums[start++], nums[middle++]);
                    break;
                case 1:
                    middle++;
                    break;
                case 2:
                    swap(nums[middle], nums[last--]);
                    break;
            }
        }
    }
};