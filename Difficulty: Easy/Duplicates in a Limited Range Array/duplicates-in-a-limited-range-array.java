class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int index=Math.abs(arr[i])-1;
            if(arr[index]<0){
                ans.add(index+1);
            }
                arr[index]=-arr[index];
        }return ans;
        
    }
}