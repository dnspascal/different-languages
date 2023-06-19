import java.util.*;

public class Jerry {

  public static void gameDisplayer(char[][] ground) {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if (j != 4) System.out.print(
          ground[i][j] + " "
        ); else System.out.println(ground[i][j]);
      }
    }
  }

  //thinking on creating a column check.SUCCESSFUL
  public static boolean columnChecker(char[][] ground, int column) {
    boolean flag = true;
    char container = ' ';
    for (int i = 0; i < 5; i++) {
      if (ground[i][column] != 'e') {
        container = ground[i][column];
        break;
      }
    }
    for (int i = 0; i < 5; i++) {
      if (ground[i][column] != container) {
        flag = false;
        break;
      }
    }
    return flag;
  }

  //thinking on creating a rowCheck.SUCCESSFUL
  public static boolean rowChecker(char[][] ground, int row) {
    boolean flag = true;
    char container = ' ';
    for (int i = 0; i < 5; i++) {
      if (ground[row][i] != 'e') {
        container = ground[row][i];
        break;
      }
    }
    for (int i = 0; i < 5; i++) {
      if (ground[row][i] != container) {
        flag = false;
        break;
      }
    }
    return flag;
  }

  //thinking on inserting a letter.SUCCESSFUL
  public static void insert(int row, int column, char token, char ground[][]) {
    ground[row][column] = token;
  }

  //mixer ya rowChecker na columnChecker na diagonalCheckers. SUCCESSFUL
  public static boolean mixerChecker(char ground[][]) {
    boolean flag1 = false;
    boolean flag2 = false;
    for (int i = 0; i < 5; i++) {
      if (rowChecker(ground, i)) {
        flag1 = true;
      }
    }
    for (int i = 0; i < 5; i++) {
      if (columnChecker(ground, i)) {
        flag2 = true;
      }
    }
    return (
      flag1 || flag2 || diagonalCheckerL(ground) || diagonalCheckerM(ground)
    );
  }

  //creating main diagonal checker
  public static boolean diagonalCheckerM(char[][] ground) {
    boolean flag = true;
    char container = ' ';
    for (int i = 0; i < 5; i++) {
      if (ground[i][i] != 'e') {
        container = ground[i][i];
        break;
      }
    }
    for (int i = 0; i < 5; i++) {
      if (ground[i][i] != container) {
        flag = false;
      }
    }
    return flag;
  }

  //creating leading diagonal checker
  public static boolean diagonalCheckerL(char[][] ground) {
    boolean flag = true;
    char container = ' ';
    for (int i = 0; i < 5; i++) {
      if (ground[i][4 - i] != 'e') {
        container = ground[i][4 - i];
        break;
      }
    }
    for (int i = 0; i < 5; i++) {
      if (ground[i][4 - i] != container) {
        flag = false;
      }
    }
    return flag;
  }

  public static void main(String[] args) {
    char[][] ground = {
      { 'e', 'e', 'e', 'e', 'e' },
      { 'e', 'e', 'e', 'e', 'e' },
      { 'e', 'e', 'e', 'e', 'e' },
      { 'e', 'e', 'e', 'e', 'e' },
      { 'e', 'e', 'e', 'e', 'e' },
    };
    Scanner ohmes = new Scanner(System.in);
    boolean play_bool = false;
    char play_char;
    boolean gatePass = true;
    char token1 = 'a';
    char token2 = 'b';
    System.out.println("Welcome to Tic-Tac-Toe game");
    System.out.println("Enter Y if you want to play or N if you want to quit");

    while (gatePass) {
      play_char = ohmes.next().charAt(0);
      if (play_char == 'Y') {
        play_bool = true;
        gatePass = false;
      } else if (play_char == 'N') {
        play_bool = false;
        gatePass = false;
      } else System.out.println("Enter valid letter");
    }
    if (play_bool == true) {
      System.out.println("Player 1, select a token. Either X or O");
      gatePass = true; //assigning the value of gatePass a false value.
      while (gatePass) {
        token1 = ohmes.next().charAt(0);
        if (token1 == 'X') {
          token2 = 'O';
          gatePass = false;
        } else if (token1 == 'O') {
          token2 = 'X';
          gatePass = false;
        } else System.out.println("Player 1, Select a token. Either X or O");
      }

      System.out.println("Player 2, Your token is " + token2);
      System.out.println("");
      System.out.println(
        "A row number is the position of the row in which your token is to be placed"
      );
      System.out.println(
        "A column number is the position of the column in which your token is to be placed"
      );
      System.out.println("Valid row/column numbers start from 1 ending at 5");
      System.out.println("************Start Playing**************");
      System.out.println("");
      //
      gatePass = true;
      int play = 1;
      int rowNo = 0;
      int columnNo = 0;
      while (gatePass) {
        boolean gatePass2 = true;
        if (play % 2 != 0) {
          System.out.println("");
          System.out.println("PLAYER 1, PLAY");
          while (gatePass2) {
            System.out.println("Enter valid row number");
            rowNo = ohmes.nextInt();
            System.out.println("Enter valid column number");
            columnNo = ohmes.nextInt();
            if (
              rowNo > 0 && rowNo < 6 && columnNo > 0 && columnNo < 6
            ) gatePass2 = false;
          }
          insert(rowNo - 1, columnNo - 1, token1, ground);
          gameDisplayer(ground);
          if (mixerChecker(ground) == true) {
            gatePass = false;
            System.out.println("Winner is player 1");
            System.out.println("************GAME IS OVER************");
          }
        } else {
          System.out.println("");
          System.out.println("PLAYER 2, PLAY");
          while (gatePass2) {
            System.out.println("Enter valid row number");
            rowNo = ohmes.nextInt();
            System.out.println("Enter valid column number");
            columnNo = ohmes.nextInt();
            if (
              rowNo > 0 && rowNo < 6 && columnNo > 0 && columnNo < 6
            ) gatePass2 = false;
          }
          insert(rowNo - 1, columnNo - 1, token2, ground);
          gameDisplayer(ground);
          if (mixerChecker(ground) == true) {
            gatePass = false;
            System.out.println("Winner is player 2");
            System.out.println("GAME IS OVER");
          }
        }
        play += 1;
      }
      //
    } else {
      System.out.println("Bye bye.");
    }
  }
}
