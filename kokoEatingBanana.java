public class kokoEatingBanana{
    public static int minEatingSpeed(int[] piles, int h) {
        int num = maxOfPile(piles);
        int low = 1, high = num;
        while (low <= high) {
            int mid = (low + high) / 2;
            int numHr = 0;
            for (int i = 0; i < piles.length; i++) {
                numHr += Math.ceil((double) piles[i] / mid);
            }
            if (numHr <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int maxOfPile(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] piles = {805306368,805306368,805306368};
        int h = 1000000000;
        System.out.println(minEatingSpeed(piles, h));
    }
}