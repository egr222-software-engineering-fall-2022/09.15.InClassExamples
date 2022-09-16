public class Mirror1_SecB {
    public static final int SIZE = 6    ;

    public static void main(String[] args) {
        border();
        topHalf();
        bottomHalf();
        border();
    }

    public static void border() {
        System.out.print("#");
        for (int equalCount = 1; equalCount <= 4 * SIZE; equalCount++) {
            System.out.print("=");
        }
        System.out.println("#");
    }

    public static void topHalf() {
        for (int line=1; line <= SIZE; line++) {
            printLine(line);
        }
    }

    public static void bottomHalf() {
        for (int line=SIZE; line >= 1; line--) {
            printLine(line);
        }
    }

    private static void printLine(int line) {
        System.out.print("|");
        printString(" ", -2 * line + (2*SIZE));
        System.out.print("<>");
        printString(".", 4 * line - 4);
        System.out.print("<>");
        printString(" ", -2 * line + (2*SIZE));
        System.out.println("|");
    }

    private static void printString(String s, int count) {
        for (int i = 1; i <= count; i ++) {
            System.out.print(s);
        }
    }
}