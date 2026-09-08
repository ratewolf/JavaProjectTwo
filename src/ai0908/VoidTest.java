package ai0908;

public class VoidTest {
    public static void printLine(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void printLine(String c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] printCounts = {10, 20, 30, 40, 50, 60, 70};
        char[] specialChars = {'☞', '★', '♧', '☆', '○', '♣', '■'};
        String[] imojis = {"❤️", "👍", "😁", "🐒", "🐾", "🐽", "🐲"};

        for (int i = 0; i < specialChars.length; i++) {
            printLine(specialChars[i], printCounts[i]);
        }

        for (int i = 0; i < imojis.length; i++) {
            printLine(imojis[i], printCounts[i]);
        }
    }
}
