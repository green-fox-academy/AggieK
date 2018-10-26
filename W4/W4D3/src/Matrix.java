public class Matrix {

    public static void main(String[] args) {
        int x = 4;
        int y = 4;
        int[][] matrix =new int[x][y];
        initMatrix(matrix);
    }

    public static void initMatrix (int[][] matrix){
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y <matrix[x].length ; y++) {
                if (x ==y ){
                    matrix[x][y] = 1;
                }
                else matrix[x][y] = 0;
                System.out.print(matrix[x][y]);
            }
            System.out.println();
        }
     }
}
