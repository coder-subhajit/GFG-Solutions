class Solution {
    public static void mergeSort(int arr[], int low, int high) {
    //base case
    if(low>=high){
        return;
    }
    int mid=low+(high-low)/2;
    //sort the first half
    mergeSort(arr,low,mid);
    //sort the first right
    mergeSort(arr,mid+1,high);
    
    merge(arr,low,mid,high);
    }
    private static void merge(int[] arr,int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        
        int[] leftArr=new int[n1];
        int[] rightArr=new int[n2];
        
        //copy the element
        for(int i=0;i<n1;i++){
            leftArr[i]=arr[low+i];
        }
        for(int j=0;j<n2;j++){
            rightArr[j]=arr[mid+1+j];
        }
        
        int i=0;
        int j=0;
        int k=low;
        
        while(i<n1&&j<n2){
        if(leftArr[i]<=rightArr[j]){
            arr[k]=leftArr[i];
            i++;
        }else{
            arr[k]=rightArr[j];
            j++;
        }
        k++;
        }
        while(i<n1){
            arr[k]=leftArr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rightArr[j];
            j++;
            k++;
        }
    }
}