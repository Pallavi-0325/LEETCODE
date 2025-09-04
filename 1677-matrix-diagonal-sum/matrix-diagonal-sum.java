class Solution {
    public int diagonalSum(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int mid=0;
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j || i+j==row-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}