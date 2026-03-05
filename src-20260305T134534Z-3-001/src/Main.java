import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n                                                                     ||     ─────────────────────────────────────────────────────────────────────────────    ||");
        System.out.println("                                                                     ||                        █████╗ ██╗      █████╗   ███████╗██╗ ██╗                      ||");
        System.out.println("                                                                     ||                       ██╔═══╝ ██║      ██╔══██╗ ██╔════╝██║ ██║                      ||");
        System.out.println("                                                                     ||                       ██║     ██║      ███████║ ███████╗██████║                      ||");
        System.out.println("                                                                     ||                       ██║     ██║      ██╔══██║ ╚════██║██╔═██║                      ||");
        System.out.println("                                                                     ||                       ██████╗ ███████╗ ██║  ██║ ███████║██║ ██║                      ||");
        System.out.println("                                                                     ||                       ╚═════╝ ╚══════╝ ╚═╝  ╚═╝ ╚══════╝╚═╝ ╚═╝                      ||");
        System.out.println("                                                                     ||                                  ██████╗    ╔███████╗                                ||");
        System.out.println("                                                                     ||                                 ██╔═══██╗ ║██╔════╝                                  ||");
        System.out.println("                                                                     ||                                 ██║   ██║ ║█████╗                                    ||");
        System.out.println("                                                                     ||                                 ██║   ██║ ║██╔══╝                                    ||");
        System.out.println("                                                                     ||                                 ╚██████╔╝ ║██║                                       ||");
        System.out.println("                                                                     ||                                   ╚════╝   ╚══╝                                      ||");
        System.out.println("                                                                     ||       ██████╗ ██████╗  ██╗      ██╗       ███████╗ ██████╗   ███████╗  ███████╗      ||");
        System.out.println("                                                                     ||       ██╔═══╝██║   ██║ ██║      ██║      ██╔════╝  ██╔═══╝   ██╔════╝ ██╔════╝       ||");
        System.out.println("                                                                     ||       ██║    ██║   ██║ ██║      ██║      █████╗    ██║  ███╗ █████╗    █████╗        ||");
        System.out.println("                                                                     ||       ██║    ██║   ██║ ██║      ██║      ██╔══╝    ██║   ██║ ██╔══╝     ╚══██╗       ||");
        System.out.println("                                                                     ||       ██████╗╚██████╔╝ ███████╗ ███████╗ ███████╗  ╚██████╔╝ ███████╗ ███████║       ||");
        System.out.println("                                                                     ||       ╚═════╝  ╚════╝  ╚══════╝ ╚══════╝ ╚══════╝   ╚═════╝  ╚══════╝ ╚══════╝       ||");
        System.out.println("                                                                     ||     ─────────────────────────────────────────────────────────────────────────────    ||");
        System.out.println("\n\n");

        System.out.println("                                                                                              ╠══════════════════════════════════════╣");
        System.out.println("                                                                                              ║              MAIN MENU               ║");
        System.out.println("                                                                                              ╠══════════════════════════════════════╣");
        System.out.println("                                                                                              ║      [1] SHOWDOWN MODE               ║");
        System.out.println("                                                                                              ║      [2] ADVENTURE MODE (BETA)       ║");
        System.out.println("                                                                                              ║      [3] CHARACTER INFO              ║");
        System.out.println("                                                                                              ║      [4] INSTRUCTIONS                ║");
        System.out.println("                                                                                              ║      [5] EXIT                        ║");
        System.out.println("                                                                                              ╚══════════════════════════════════════╝");

        while (true) {

            System.out.print("\n                                                                                                Select an option: ");

            String select = scan.nextLine().trim();

            switch (select) {
                case "1":
                    BattleSystem.startShowdown();
                    break;

                case "2":
                    AdventureMode adventure = new AdventureMode();
                    adventure.startAdventure();
                    break;

                case "3":
                    CharacterInfo.showInfo();
                    break;

                case "4":
                    System.out.println("\n                                                                                                📘 Opening Instructions...");
                    Instructions.showInstructions();
                    break;

                case "5":
                    System.out.println("\n                                                                                                👋 Thanks for playing!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\n                                                                                             ❌ Invalid input! Please try again.");
                    break;
            }
        }
    }
}