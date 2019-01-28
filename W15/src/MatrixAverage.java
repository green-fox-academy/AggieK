public class MatrixAverage {

  public static void main(String[] args) {
    int[][] matrix = {{1, 2}, {7, 6}};

    int theOddAverage = calculateTheOddAverage(matrix);
    System.out.println(theOddAverage);
  }

  public static int calculateTheOddAverage(int[][] matrix) {
    int sumOfOdd = 0;
    int count = 0;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (matrix[i][j] % 2 == 0) {
          sumOfOdd += matrix[i][j];
          count++;
        }
      }
    }
    int averageOdd = sumOfOdd / count;
    return averageOdd;
  }
}
