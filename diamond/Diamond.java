import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int sizeOfDiamond;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number: ");
    sizeOfDiamond = scan.nextInt();

    if(sizeOfDiamond == 0){
      System.out.println("A diamond cannot be made with the number 0");
    }

    else if(sizeOfDiamond % 2 == 0){
      for(int spaces = 1; spaces <= sizeOfDiamond; spaces++){
        System.out.print(" ");
      }

      System.out.println("*");

      for(int evenDiamond = 1; evenDiamond <= (sizeOfDiamond /2) ; evenDiamond++){
        for(int spaces = 1; spaces <= (sizeOfDiamond + 1) - (2 * evenDiamond) ; spaces++){
          System.out.print(" ");
        }

        for(int diamondCharacters = 1; diamondCharacters <= 2 * evenDiamond ; diamondCharacters++){
          System.out.print("* ");
        }

        System.out.println();
      }

      for (int evenDiamond = sizeOfDiamond/2 - 1; evenDiamond >= 1; evenDiamond--){
        for(int spaces = 1; spaces <= (sizeOfDiamond+ 1) - (2 * evenDiamond); spaces++){
          System.out.print(" ");
        }

        for(int diamondCharacters = 1; diamondCharacters <= 2 * evenDiamond ; diamondCharacters++){
          System.out.print("* ");
        }

        System.out.println();
      }
      for(int spaces = 1; spaces <= sizeOfDiamond; spaces++){
        System.out.print(" ");
      }
      System.out.println("*");
    }

    else {
      for(int creationOfDiamond = 1; creationOfDiamond <= (sizeOfDiamond + 1) / 2; creationOfDiamond++){
        for(int spaces = 1; spaces <= (sizeOfDiamond + 1) / 2 - creationOfDiamond; spaces++){
          System.out.print(" ");
        }

        for(int diamondCharacters = 1; diamondCharacters <= 2 * creationOfDiamond - 1; diamondCharacters++){
          System.out.print("*");
        }

        System.out.println();
      }

      for (int creationOfDiamond = (sizeOfDiamond +1 ) / 2 - 1; creationOfDiamond >= 1; creationOfDiamond--){
        for(int spaces = 1; spaces <= (sizeOfDiamond + 1) / 2 - creationOfDiamond; spaces++){
          System.out.print(" ");
        }

        for(int diamondCharacters = 1; diamondCharacters <= 2 * creationOfDiamond - 1; diamondCharacters++){
          System.out.print("*");
        }

        System.out.println();
      }

    }

  }
}
