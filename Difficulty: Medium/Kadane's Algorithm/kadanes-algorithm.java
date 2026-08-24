class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int currentSum=arr[0];
        int maxSum=arr[0];
        for(int i=1;i<arr.length;i++){
            currentSum=Math.max(arr[i],currentSum+arr[i]);
            maxSum=Math.max(maxSum,currentSum);
        } return maxSum;
    }
}
