public class DrawATriangle {

  public static void main(String[] args) {

    int rows = 5;
    int columns = 2 * rows - 1;

    //Ilyet például lehet csinálni? Egyik függvény hasában a másik így rendben van?
    display(drawATriangle(rows, columns));
  }

  public static String[][] drawATriangle(int row, int column) {
    String matrixTriangle[][] = new String[row][column];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        if (row - i - 2 < j && j < row + i) {
          matrixTriangle[i][j] = "*";
        } else matrixTriangle[i][j] = " ";
      }
    }
    return matrixTriangle;
  }

  public static void display(String[][] matrix) {
    for (String[] row : matrix) {
      for (String item : row) {
        System.out.print(item + " ");
      }
      System.out.println();
    }
  }
}
