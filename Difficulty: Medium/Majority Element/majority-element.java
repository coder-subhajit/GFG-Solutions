class Solution {
    int majorityElement(int arr[]) {
        // code here
        int count=0;
        int element=0;
        for(int num : arr){
            if(count==0){
                element=num;
            }if(num==element){
                count++;
            }else{
                count--;
            }
        }
        count=0;
        for(int num : arr){
            if(num==element){
                count++;
            }if(count>arr.length/2){
                return element;
            }
        } return -1;
    }
}