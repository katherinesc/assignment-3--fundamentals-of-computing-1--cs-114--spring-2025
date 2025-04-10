public class Matrix {
  private int[][] matrix;

  private void swap(int x1, int y1, int x2, int y2){
    int temp = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temp;
  }
  public void printMatrix(){
    final String RESET = "\u001b[0m";
    final String HIGHLIGHT = "\u001b[33m";

    int matrixLength = matrix.length;
    for(int row = 0; row < matrixLength; row++ ){
      for(int column = 0; column < row; column++){
        if(column == matrixLength - 1 - row){
          System.out.println(HIGHLIGHT + matrix[row][column] + RESET);
        }
        else {
          System.out.println(matrix[row][column]);
        }
      }
      System.out.println();
    }
  }
}
