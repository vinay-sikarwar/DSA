public class largestOddNum {
    public static String largestOdd(String num){
        int n = num.length() -1;
        for(int i = n ; i >= 0; i--){
            if((num.charAt(i) - '0') % 2 != 0){
                return num.substring(0, i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(largestOdd("420306"));
        System.out.println(largestOdd("4284"));
        System.out.println(largestOdd("6724"));
        System.out.println(largestOdd("26385"));
    }
}
