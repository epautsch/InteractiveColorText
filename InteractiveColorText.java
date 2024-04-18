import java.util.Scanner;

public class InteractiveColorText {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a color (red, green, yellow):");
        String input = scanner.nextLine();

        String colorCode = ANSI_RESET;
        switch (input.toLowerCase()) {
            case "red":
                colorCode = ANSI_RED;
                break;
            case "green":
                colorCode = ANSI_GREEN;
                break;
            case "yellow":
                colorCode = ANSI_YELLOW;
                break;
            default:
                System.out.println("Invalid color");
                System.exit(0);
        }

        System.out.println(colorCode + "This text is " + input + "!" + ANSI_RESET);
        scanner.close();
    }
}

