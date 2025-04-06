import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int sizeOfDiamond;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number: ");
    sizeOfDiamond = scan.nextInt();

    if(sizeOfDiamond % 2 == 0){
      System.err.println("Number is even");
    }

    else {
      System.out.print("Number is odd");
      for(int creationOfDiamond = 1; creationOfDiamond <= sizeOfDiamond; creationOfDiamond++){
        for(int spaces = 1; spaces <= sizeOfDiamond - creationOfDiamond; spaces++){
          System.err.print(" ");
        }

        for(int diamondCharacters = 1; diamondCharacters <= creationOfDiamond - 1 * 2 ; diamondCharacters++){
          System.out.print("*");
        }

        System.out.println();
      }

      for (int creationOfDiamond = sizeOfDiamond - 1; creationOfDiamond > 0; creationOfDiamond--){
        for(int spaces = 1; spaces <= sizeOfDiamond - creationOfDiamond; spaces++){
          System.out.print(" ");
        }

        for(int diamondCharacters = 1; diamondCharacters <= creationOfDiamond - 1 * 2; diamondCharacters++){
          System.out.print("*");
        }

        System.out.println();
      }

    }

  }
}
