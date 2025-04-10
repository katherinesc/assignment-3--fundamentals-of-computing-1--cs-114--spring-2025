import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    final String RESET = "\u001b[0m";
    final String HIGHLIGHT = "\u001b[33m";

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a positive number for the size of your matrix: ");
    size = scan.nextInt();

    Matrix matrix = new Matrix(size);
  }
}
