class Solution {
    int missingNum(int arr[]) {
       int XorResult=0;
       
       for(int i=1;i<=arr.length+1;i++){
           XorResult^=i;
       }
       for(int num : arr){
           XorResult^=num;
       }
       return XorResult;
    }
}