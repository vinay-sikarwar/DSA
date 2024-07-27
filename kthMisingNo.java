public class kthMisingNo {
    
    public static int kthMissing(int[] arr , int k){
        int n = arr.length;
        int low=0, high = n-1;

        while(low<=high){
            int mid = (low + high)/2;
            int missing = arr[mid] - (mid+1);
            if(missing >= k){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return k + high + 1;
    }
    
    public static void main(String[] args) {
        int[] arr = {2};
        System.out.println(kthMissing(arr, 1));
    }
}