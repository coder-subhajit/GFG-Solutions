class Solution {
    static ArrayList<Integer> leaders(int nums[]) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        int maxRight=nums[nums.length-1];
        ans.add(maxRight);
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>=maxRight){
                ans.add(nums[i]);
                maxRight=nums[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
