public class TicTacToeTester {
    static TicTacToe t;
    static int x;
    static int y;

    public static void main(String[] args) {
        x = 3;
        y = 3;
        t = new TicTacToe(x, y);
        t.set(0, 0, 1);
        t.set(0, 1, 1);
        t.set(0, 2, 1);
        printBoard();
        System.out.println("Evaluation: " + t.won());
    }

    public static void printBoard() {
        System.out.println("-------------------------");
        for (int i = 0; i < x; i++) {
            System.out.print("|\t");
            for (int j = 0; j < y; j++) {
                System.out.print(t.get(j, i));
                System.out.print("\t|\t");
            }
            System.out.println();
            System.out.println("-------------------------");
        }
    }
}
