class searchIn2Darray{
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length , m = matrix[0].length;
        for(int i=0; i<n; i++){
            int m_low = 0 , m_high = m-1;

            while(m_low <= m_high){
                int m_mid = (m_low + m_high)/2;
                if(matrix[i][m_mid] == target){
                    return true;
                }
                if(matrix[i][m_mid] < target){
                    m_low = m_mid+1;
                }else{
                    m_high = m_mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1},{3}};
        System.out.println(searchMatrix(matrix,3));
    }
}