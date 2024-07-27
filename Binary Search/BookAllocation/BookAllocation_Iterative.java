class BookAllocation_Iterative{
    public static int numStd(int[] arr, int maxSum){
        int cnt=1, sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(sum+arr[i] <= maxSum){
                sum += arr[i];
            }else{
                cnt++;
                sum = arr[i];
            }
        }
        return cnt;
    }
    public static int maxPage(int[] arr, int std){
        if(std > arr.length){
            return -1;
        }
        int low = 0, high = 0;
        for(int i=0; i<arr.length; i++){
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        for(int maxSum=low; maxSum<=high; maxSum++){
            if(numStd(arr, maxSum) == std){
                return maxSum;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {25, 46, 28, 49, 24};
        System.out.println(maxPage(arr, 4));
    }
}