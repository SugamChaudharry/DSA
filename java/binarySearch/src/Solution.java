class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);
        System.out.println(nums);
    }

    public static void rotate(int[] nums, int k) {
        if(k > nums.length){
            k = k - nums.length;
        }
        if(nums.length != k){
            int[] ans = new int[nums.length];
            for(int i = 0; i < nums.length; i++){
                if(i < k){
                    ans[i] = nums[nums.length - 1 - i];
                }else if(i == k){
                    for (int j = 0; j < k/2; j++){
                        int temp = ans[j];
                        ans[j] = ans[k-1-j];
                        ans[k-1-j] = temp;
                    }
                    ans[i] = nums[i-k];
                }else{
                    ans[i] = nums[i-k];
                }
                
            }
            for(int i = 0; i < ans.length; i++){
                nums[i] = ans[i];
            }
        }
    }
}