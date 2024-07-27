// leetcode 410

public class splitArray {
    public static int numSplit(int[] arr, int maxSum){
        int sum = 0, cnt=1;
        for (int i = 0; i < arr.length; i++) {
            if(sum + arr[i] <= maxSum){
                sum += arr[i];
            }else{
                cnt++;
                sum = arr[i];
            }
        }
        return cnt;
    }
    public static int largestSum(int[] arr, int k){
        if(k > arr.length){
            return -1;
        }
        int low=0, high=0;
        for (int i = 0; i < arr.length; i++) {
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        while (low <= high) {
            int mid = (low + high)/2;
            int l = numSplit(arr, mid);
            if(l > k){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.err.println(largestSum(arr, 2));
    }
}
