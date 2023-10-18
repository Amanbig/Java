import java.util.Scanner;

class tic_tac_toe {
    static Scanner in = new Scanner(System.in);
    public static char ar[][] = new char[3][3];
    public static int br[][] = {
            { 8, 3, 4 },
            { 1, 5, 9 },
            { 6, 7, 2 }
    };
    public static int[] v = new int[9];
    public static int[] c = new int[9];
    public static int counts = 0;
    public static int con = 0;

    public static void print_board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j != 2) {
                    System.out.print(ar[i][j] + " | ");
                } else {
                    System.out.print(ar[i][j]);
                }
            }
            System.out.println();
            if (i != 2) {
                System.out.println("---------");
            }
        }
        System.out.println();
    }

    public static void userinput() {
        int a, b;
        System.out.println("Enter row and column");
        a = in.nextInt();
        b = in.nextInt();
        if (a >= 0 && a < 3 && b >= 0 && b < 3 && ar[a][b] == ' ') {
            counts++;
            ar[a][b] = 'O';
            v[counts - 1] = br[a][b];
        } else {
            System.out.println("Invalid input");
            userinput();
        }
    }

    public static int find_r(int a) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (br[i][j] == a) {
                    return i;
                }
            }
        }
        return 0;
    }

    public static int find_c(int a) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (br[i][j] == a) {
                    return j;
                }
            }
        }
        return 0;
    }

    public static void move() {
        int move = 0,move1 = 0;
        for (int i = 0; i < counts; i++) {
            for (int j = i + 1; j < counts; j++) {
                move = 15 - v[i] - v[j];
                move1 = 15 - c[i] - c[j];
                if(move1 > 0 &&  move1 <= 9){
                    if (find_r(move1) != -1 && find_c(move1) != -1 && ar[find_r(move1)][find_c(move1)] == ' ') {
                        ar[find_r(move1)][find_c(move1)] = 'X';
                        return;
                    }
                }
                else if (move > 0 && move <= 9) {
                    if (find_r(move) != -1 && find_c(move) != -1 && ar[find_r(move)][find_c(move)] == ' ') {
                        ar[find_r(move)][find_c(move)] = 'X';
                        c[con] = br[find_r(move)][find_c(move)];
                        con++;
                        return;
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (ar[i][j] == ' ') {
                    ar[i][j] = 'X';
                    c[con] = br[i][j];
                    con++;
                    return;
                }
            }
        }
    }

    public static boolean check_winner(char player) {
        for (int i = 0; i < 3; i++) {
            if (ar[i][0] == player && ar[i][1] == player && ar[i][2] == player)
                return true;
            if (ar[0][i] == player && ar[1][i] == player && ar[2][i] == player)
                return true;
        }
        if (ar[0][0] == player && ar[1][1] == player && ar[2][2] == player)
            return true;
        if (ar[0][2] == player && ar[1][1] == player && ar[2][0] == player)
            return true;
        return false;
    }

    public static boolean checkdraw() {
        int c = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (ar[i][j] == 'X' || ar[i][j] == 'O') {
                    c++;
                }
            }
        }
        if (c == 9) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ar[i][j] = ' ';
            }
        }
        System.out.println("[------Tic-tac-toe Game------]\n");
        print_board();
        while (true) {
            if (checkdraw()) {
                System.out.println("Draw\n");
                break;
            }
            System.out.println("[------User turn------]\n");
            userinput();
            print_board();
            if (check_winner('O')) {
                System.out.println("Player won\n");
                break;
            }
            System.out.println("[------Computer's turn------]\n");
            move();
            print_board();
            if (check_winner('X')) {
                System.out.println("Computer won\n");
                break;
            }
        }
    }
}