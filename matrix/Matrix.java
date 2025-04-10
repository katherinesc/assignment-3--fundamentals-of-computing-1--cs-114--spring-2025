public class Matrix {
  private int[][] matrix;

  public Matrix(int size){
    matrix = new int[size][size];
  }
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
      for(int column = 0; column < matrixLength; column++){
        if(column == matrixLength - 1 - row){
          System.out.print(HIGHLIGHT + matrix[row][column]+ "\t" + RESET);
        }
        else {
          System.out.print(matrix[row][column] + "\t");
        }
      }
      System.out.println();
    }
  }
  public void populateMatrix(){
    int counter = 1;
    int matrixLength = matrix.length;
    for(int row = 0; row < matrixLength; row++){
      for(int column = 0; column < matrixLength; column++){
        matrix[row][column] = counter++;
      }
    }
  }
  public void flipMatrix(){
    int matrixLength = matrix.length;
    for(int row = 0; row < matrixLength; row++){
      for(int column = 0; column < row; column++){
        int targetedRow = matrixLength - 1 - column;
        int targetedColumn = matrixLength - 1 - row;

        if((row + column) < matrixLength - 1){
          swap(row, column, targetedRow, targetedColumn);
        }
      }
    }
  }


}
