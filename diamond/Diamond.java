import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int sizeOfDiamond;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number: ");
    sizeOfDiamond = scan.nextInt();

    if(sizeOfDiamond % 2 == 0){
      System.err.println("Number is even");
    } else{
      System.out.println("Number is odd");
    }

  }
}
