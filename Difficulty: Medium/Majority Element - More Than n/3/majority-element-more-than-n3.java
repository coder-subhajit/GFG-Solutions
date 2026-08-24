import java.util.*;
class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        int element1=0;
        int element2=0;
        int count1=0;
        int count2=0;
        
        for(int num : arr){
            if(num==element1){
                count1++;
            }else if(num==element2){
                count2++;
            }else if(count1==0&&num!=element2){
                element1=num;
                count1=1;
            }else if(count2==0&&num!=element1){
                element2=num;
                count2=1;
            }else{
                count1--;
                count2--;
            }
        } 
        count1=0;
        count2=0;
        for(int num : arr){
            if(num==element1){
                count1++;
            }else if(num==element2){
                count2++;
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        if(count1>arr.length/3){
            ans.add(element1);
        }if(element1!=element2&&count2>arr.length/3){
            ans.add(element2);
        } Collections.sort(ans);
        return ans;
}
}