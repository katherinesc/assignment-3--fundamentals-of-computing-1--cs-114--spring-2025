import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    final String RESET = "\u001b[0m";
    final String HIGHLIGHT = "\u001b[33m";

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a positive number for the size of your matrix: ");
    size = scan.nextInt();

    Matrix matrix = new Matrix(size);

    System.out.println("Your matrix is: " + size + " x " + size);
    System.out.println();
    System.out.println("Here is the matrix with deafult values: ");

    for(int row = 0; row < size; row++){
      for(int column = 0; column < size; column++){
        if(row + column == size - 1){
          System.out.print(HIGHLIGHT + "0\t" + RESET);
        }
        System.out.print("0\t");
      }
      System.out.println();
    }

  }
}
