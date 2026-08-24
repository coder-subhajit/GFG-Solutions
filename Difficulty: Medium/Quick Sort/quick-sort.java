class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
        //partiton index
        int partInd=partition(arr,low,high);
        quickSort(arr,low,partInd);
        quickSort(arr,partInd+1,high);
        partition(arr,low,high);
    }
}    


    private int partition(int[] arr, int low, int high) {
        // code here
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(true){
        //Move the pointers left to right    
        while(arr[i]<pivot){
            i++;
        }  
        //Move the pointers right to left
        while(arr[j]>pivot){
            j--;
        }
        //pointers crossed
        if(i>=j){
            return j;
        }
        //swap arr[i] and arr[j]
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        }
    }
}