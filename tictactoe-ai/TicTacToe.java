public class TicTacToe {
    private int board[][];
    private int x;
    private int y;

    public TicTacToe(int x, int y) {
        this.x = x;
        this.y = y;
        board = new int[x][y];
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                board[i][j] = 0;
            }
        }
    }

    public void set(int xPos, int yPos, int val) {
        board[xPos][yPos] = val;
    }

    public int get(int xPos, int yPos) {
        return board[xPos][yPos];
    }

    public int won() {
        // check rows
        for (int i = 0; i < y; i++) {
            if (board[0][i] == 1 && board[1][i] == 1 && board[2][i] == 1) {
                return 1;
            } else if (board[0][i] == -1 && board[1][i] == -1 && board[2][i] == -1) {
                return -1;
            }
        }
        // check columns
        for (int i = 0; i < x; i++) {
            if (board[i][0] == 1 && board[i][1] == 1 && board[i][2] == 1) {
                return 1;
            } else if (board[i][0] == -1 && board[i][1] == -1 && board[i][2] == -1) {
                return 1;
            }
        }
        // check diagonals
        if (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) {
            return 1;
        } else if (board[0][0] == -1 && board[1][1] == -1 && board[2][2] == -1) {
            return -1;
        }

        if (board[2][0] == 1 && board[1][1] == 1 && board[0][2] == 1) {
            return 1;
        } else if (board[2][0] == -1 && board[1][1] == -1 && board[0][2] == -1) {
            return -1;
        }

        // no correct
        return 0;
    }

    public void play(Individual p1, Individual p2) {

    }
}
