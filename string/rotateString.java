class rotateString {
    public static boolean rotateStrings(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String newS = s+s;
        return newS.contains(goal);
    }
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        System.out.println(rotateStrings(s, goal));
    }
}