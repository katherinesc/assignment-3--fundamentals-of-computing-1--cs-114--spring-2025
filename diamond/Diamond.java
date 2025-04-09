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
      for(int oddDiamond = 1; oddDiamond <= (sizeOfDiamond + 1) / 2; oddDiamond++){
        for(int spaces = 1; spaces <= (sizeOfDiamond + 1) / 2 - oddDiamond; spaces++){
          System.out.print(" ");
        }

        for(int diamondCharacters = 1; diamondCharacters <= 2 * oddDiamond - 1; diamondCharacters++){
          System.out.print("*");
        }

        System.out.println();
      }

      for (int oddDiamond = (sizeOfDiamond +1 ) / 2 - 1; oddDiamond >= 1; oddDiamond--){
        for(int spaces = 1; spaces <= (sizeOfDiamond + 1) / 2 - oddDiamond; spaces++){
          System.out.print(" ");
        }

        for(int diamondCharacters = 1; diamondCharacters <= 2 * oddDiamond - 1; diamondCharacters++){
          System.out.print("*");
        }

        System.out.println();
      }

    }
    scan.close();
  }
}
