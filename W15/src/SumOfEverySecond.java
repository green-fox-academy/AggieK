public class SumOfEverySecond {
  public static void main(String[] args) {

    int[][] matrix = {{2, 4, 5, 7}, {1, 5, 9, 2}, {3, 6, 3, 5}, {8, 2, 1, 7}};

    int everySecondItem = summarizeEverySecondItem(matrix);
    System.out.println(everySecondItem);
  }

  public static int summarizeEverySecondItem(int[][] matrix) {
    int sumOfEverySecondItem = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (j % 2 == 1) {
          sumOfEverySecondItem += matrix[i][j];
        }
      }
    }
    return sumOfEverySecondItem;
  }
}
