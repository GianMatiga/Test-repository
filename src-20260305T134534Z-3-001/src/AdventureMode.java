import java.util.Random;
import java.util.Scanner;

public class AdventureMode {
    private static final Scanner scan = new Scanner(System.in);

    public void startAdventure() {

        Random rand = new Random();
        int option = 0;

        System.out.println("\n\n                                                                     ╔═════════════════════════════════════════════════════════════════════════════════════════╗ ");
        System.out.println("                                                                     ║                                                                                         ║");
        System.out.println("                                                                     ║                                                                                         ║");
        System.out.println("                                                                     ║                                                                                         ║");
        System.out.println("                                                                     ║   █████╗  ██████╗  ██╗   ██╗ ███████╗ ███╗   ██╗ ████████╗ ██╗   ██╗ ██████╗  ███████╗  ║");
        System.out.println("                                                                     ║  ██╔══██╗ ██╔══██╗ ██║   ██║ ██╔════╝ ████╗  ██║ ╚══██╔══╝ ██║   ██║ ██╔══██╗ ██╔════╝  ║");
        System.out.println("                                                                     ║  ███████║ ██║  ██║ ██║   ██║ ███████╗ ██║██╗ ██║    ██║    ██║   ██║ █████╔═╝ ███████╗  ║");
        System.out.println("                                                                     ║  ██╔══██║ ██║  ██╝ ██║   ██║ ██╔════╝ ██║╚██╗██║    ██║    ██║   ██║ ██╔══██╗ ██╔════╝  ║");
        System.out.println("                                                                     ║  ██║  ██║ █████╔╝   ██████╔╝ ███████╗ ██║ ╚████║    ██║    ╚██████╔╝ ██║  ██║ ███████╗  ║");
        System.out.println("                                                                     ║  ╚═╝  ╚═╝ ╚════╝    ╚═════╝  ╚══════╝ ╚═╝  ╚═══╝    ╚═╝     ╚═════╝  ╚═╝  ╚═╝ ╚══════╝  ║");
        System.out.println("                                                                     ║                         ███╗   ███╗  ██████╗  ██████╗  ███████╗                         ║");
        System.out.println("                                                                     ║                         ████╗ ████║ ██╔═══██╗ ██╔══██╗ ██╔════╝                         ║");
        System.out.println("                                                                     ║                         ██╔████╔██║ ██║   ██║ ██║  ██║ ███████╗                         ║");
        System.out.println("                                                                     ║                         ██║╚██╔╝██║ ██║   ██║ ██║  ██║ ██╔════╝                         ║");
        System.out.println("                                                                     ║                         ██║ ╚═╝ ██║  ╚█████╔╝ ██████╔╝ ███████╗                         ║");
        System.out.println("                                                                     ║                         ╚═╝     ╚═╝   ╚════╝  ╚═════╝  ╚══════╝                         ║");
        System.out.println("                                                                     ║                                                                                         ║");
        System.out.println("                                                                     ║                                                                                         ║");
        System.out.println("                                                                     ║                                                                                         ║");
        System.out.println("                                                                     ╚═════════════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println("\n\n");

        System.out.println("                                                                                              ╠══════════════════════════════════════╣");
        System.out.println("                                                                                              ║              MAIN MENU               ║");
        System.out.println("                                                                                              ╠══════════════════════════════════════╣");
        System.out.println("                                                                                              ║              [1] START               ║");
        System.out.println("                                                                                              ║              [2] EXIT                ║");
        System.out.println("                                                                                              ╚══════════════════════════════════════╝");

        while (true) {
            try {

                System.out.print("\n                                                                                                Select an option: ");
                option = scan.nextInt();
                scan.nextLine(); // clear newline
            } catch (Exception e) {
                System.out.println("\n                                                                                              ❌ Invalid input! Please choose from (1-2)!");
                scan.nextLine();
                continue;
            }

            switch (option) {
                case 1 -> {
                    Character chosenHero = null;

                    System.out.println("\n\n");
                    System.out.println("                                                                            ╔══════════════════════════════════════════════════════════════════════════╗");
                    System.out.println("                                                                            ║                           CHOOSE YOUR CHARACTER                          ║");
                    System.out.println("                                                                            ╚══════════════════════════════════════════════════════════════════════════╝");

                    System.out.println("                                                                            ┌──────────────────────────────────────────────────────────────────────────┐");
                    System.out.println("                                                                            │  COLLEGE      │ AVAILABLE CHARACTERS                                     │");
                    System.out.println("                                                                            ├──────────────────────────────────────────────────────────────────────────┤");
                    System.out.println("                                                                            │  CCS          │  1. Ton         2. Jay                                   │");
                    System.out.println("                                                                            │  CMBA         │  3. Josh        4. Patricia                              │");
                    System.out.println("                                                                            │  CCJ          │  5. Kal-Khent                                            │");
                    System.out.println("                                                                            │  CNAHS        │  6. Lanz        7. Ashley                                │");
                    System.out.println("                                                                            │  CEA          │  8. Sir G       9. Ian                                   │");
                    System.out.println("                                                                            │  CASE         │ 10. Jon        11. Coleen                                │");
                    System.out.println("                                                                            └──────────────────────────────────────────────────────────────────────────┘");

                    System.out.print("                                                                                Select Character (1–11): ");

                    // FIXED HERO SELECTION LOOP
                    while (chosenHero == null) {
                        try {
                            int heroChoice = scan.nextInt();
                            //scan.nextLine();

                            switch (heroChoice) {
                                case 1 -> chosenHero = new Ton();
                                case 2 -> chosenHero = new Jay();
                                case 3 -> chosenHero = new Josh();
                                case 4 -> chosenHero = new Patricia();
                                case 5 -> chosenHero = new KalKhent();
                                case 6 -> chosenHero = new Lanz();
                                case 7 -> chosenHero = new Ashley();
                                case 8 -> chosenHero = new SirG();
                                case 9 -> chosenHero = new Ian();
                                case 10 -> chosenHero = new Jon();
                                case 11 -> chosenHero = new Coleen();
                                default -> System.out.print("\n                                                                                ❌ Invalid choice! Please enter a number (1-11): ");
                            }
                        } catch (Exception e) {
                            System.out.print("\n                                                                                Please enter a number (1–11): ");
                            scan.nextLine();
                        }
                    }

                    int worldChoice = -1;

                    System.out.println("\n\n");
                    System.out.println("                                                                                 ┌──────────────────────────────────────────────────────────────┐");
                    System.out.println("                                                                                 │                        CHOOSE WORLD                          │");
                    System.out.println("                                                                                 ├──────────────────────────────────────────────────────────────┤");
                    System.out.println("                                                                                 │                         [1] RTL                              │");
                    System.out.println("                                                                                 │                         [2] GLE                              │");
                    System.out.println("                                                                                 │                         [3] Gymnasium                        │");
                    System.out.println("                                                                                 │                         [4] Basketball Court                 │");
                    System.out.println("                                                                                 │                         [5] Canteen                          │");
                    System.out.println("                                                                                 │                         [6] Exit                             │");
                    System.out.println("                                                                                 └──────────────────────────────────────────────────────────────┘");
                    System.out.print("                                                                                     Select a world (1–6): ");


                    while (true) {
                        try {
                            worldChoice = scan.nextInt();
                            scan.nextLine();
                        } catch (Exception e) {
                            System.out.print("\n                                                                                   ❌ Invalid input! Please choose from (1-6): ");
                            scan.nextLine();
                            continue;
                        }

                        if (worldChoice < 1 || worldChoice > 6) {
                            System.out.print("\n                                                                                   ❌ Invalid choice! Please choose from (1-6): ");
                            continue;
                        }

                        AdventureBattleSystem bs = new AdventureBattleSystem();

                        switch (worldChoice) {
                            case 1 -> {
                                RTL rtl = new RTL();
                                AdventureCharacter[] rtlEnemies = {
                                        rtl.new PaperHogger(),
                                        rtl.new ChalkBoy(),
                                        rtl.new Wierdo(),
                                        rtl.new RTLPhantom(),
                                        rtl.new BossPrincipal(),
                                };
                                System.out.println("\n\n");
                                System.out.println("                                                                               ╔══════════════════════════════════════════════════════════════════╗");
                                System.out.println("                                                                               ║                          WELCOME TO RTL                          ║");
                                System.out.println("                                                                               ╚══════════════════════════════════════════════════════════════════╝");
                                bs.startBattle(chosenHero, rtlEnemies);
                            }
                            case 2 -> {
                                GLE gle = new GLE();
                                AdventureCharacter[] gleEnemies = {
                                        gle.new Arkiiteks(),
                                        gle.new McCuePal(),
                                        gle.new DrNarrSingh(),
                                        gle.new SeerEnjeeniir(),
                                        gle.new BossG(),
                                };
                                System.out.println("\n\n");
                                System.out.println("                                                                               ╔══════════════════════════════════════════════════════════════════╗");
                                System.out.println("                                                                               ║                          WELCOME TO GLE                          ║");
                                System.out.println("                                                                               ╚══════════════════════════════════════════════════════════════════╝");
                                bs.startBattle(chosenHero, gleEnemies);
                            }
                            case 3 -> {
                                Gymnasium gym = new Gymnasium();
                                AdventureCharacter[] gymEnemies = {
                                        gym.new Coach(),
                                        gym.new YogaLolo(),
                                        gym.new DancingRolly(),
                                        gym.new SweatyJon(),
                                        gym.new ArnisDiablo(),
                                };
                                System.out.println("\n\n");
                                System.out.println("                                                                               ╔══════════════════════════════════════════════════════════════════╗");
                                System.out.println("                                                                               ║                       WELCOME TO GYMNASIUM                       ║");
                                System.out.println("                                                                               ╚══════════════════════════════════════════════════════════════════╝");
                                bs.startBattle(chosenHero, gymEnemies);
                            }
                            case 4 -> {
                                BasketballCourt bc = new BasketballCourt();
                                AdventureCharacter[] bcEnemies = {
                                        bc.new DribbleGableen(),
                                        bc.new SpikeJupeta(),
                                        bc.new BouncyAmpol(),
                                        bc.new Referee(),
                                        bc.new AuraMaster(),
                                };
                                System.out.println("\n\n");
                                System.out.println("                                                                               ╔══════════════════════════════════════════════════════════════════╗");
                                System.out.println("                                                                               ║                    WELCOME TO BASKETBALL COURT                   ║");
                                System.out.println("                                                                               ╚══════════════════════════════════════════════════════════════════╝");
                                bs.startBattle(chosenHero, bcEnemies);
                            }
                            case 5 -> {
                                Canteen ct = new Canteen();
                                AdventureCharacter[] ctEnemies = {
                                        ct.new GreedyJaede(),
                                        ct.new PanDeBureeCat(),
                                        ct.new OilyGreg(),
                                        ct.new SirEatallat(),
                                        ct.new ChefMamasitas(),
                                };
                                System.out.println("\n\n");
                                System.out.println("                                                                               ╔══════════════════════════════════════════════════════════════════╗");
                                System.out.println("                                                                               ║                        WELCOME TO CANTEEN                        ║");
                                System.out.println("                                                                               ╚══════════════════════════════════════════════════════════════════╝");
                                bs.startBattle(chosenHero, ctEnemies);
                            }
                            case 6 -> {
                                System.out.println("Returning to main menu...");
                                Main.main(null);
                            }
                        }

                    }
                }

                case 2 -> {
                    System.out.println("Exiting game...");
                    Main.main(null);
                }

                default -> System.out.println("\n                                                                                              ❌ Invalid choice!");
            }
        }
    }
}


/*import java.util.Random;
import java.util.Scanner;

public class AdventureMode {
    private static final Scanner scan = new Scanner(System.in);
    public void startAdventure() {

        Random rand = new Random();

        int option = 0;

        while (true) {
            try {
                System.out.println("==============================");
                System.out.println("       ADVENTURE MODE");
                System.out.println("==============================");
                System.out.println("1. Start");
                System.out.println("2. How To Play?");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                option = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please choose from (1-3)!");
                scan.nextLine();
                continue;
            }

            switch (option) {
                case 1 -> {
                    Character chosenHero = null;
                    int heroChoice = -1;

                    while (true) {
                        System.out.println("================================================================================");
                        System.out.println("                             CHOOSE YOUR HERO!                                   ");
                        System.out.println("================================================================================\n");
                        System.out.println("CCS:\t\tCMBA:\t\t\tCCJ:\t\t\tCNAHS:\t\tCEA:\t\tCASE:");
                        System.out.println("1. Ton\t\t3. Josh\t\t\t5. Kal-Khent\t6. Lanz\t\t8. Sir G\t10. Jon");
                        System.out.println("2. Jay\t\t4. Patricia\t\t\t\t\t\t7. Ashley\t9. Ian\t\t11. Coleen");
                        System.out.println("\n================================================================================");
                        System.out.print("Choose your character: ");

                        try {
                            heroChoice = scan.nextInt();
                            switch (heroChoice) {
                                case 1 -> chosenHero = new Ton();
                                case 2 -> chosenHero = new Jay();
                                case 3 -> chosenHero = new Josh();
                                case 4 -> chosenHero = new Patricia();
                                case 5 -> chosenHero = new KalKhent();
                                case 6 -> chosenHero = new Lanz();
                                case 7 -> chosenHero = new Ashley();
                                case 8 -> chosenHero = new SirG();
                                case 9 -> chosenHero = new Ian();
                                case 10 -> chosenHero = new Jon();
                                case 11 -> chosenHero = new Coleen();
                                default -> System.out.println("Please try again. Enter (1-11)!");
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid Choice! Please choose from (1-11)!");
                            scan.next();
                        }
                        if (chosenHero == null) break;
                    }



                    int worldChoice = -1;

                    do {
                        System.out.println("==============================");
                        System.out.println("         CHOOSE WORLD");
                        System.out.println("==============================");
                        System.out.println("1. RTL");
                        System.out.println("2. GLE");
                        System.out.println("3. Gymnasium");
                        System.out.println("4. Basketball Court");
                        System.out.println("5. Canteen");
                        System.out.println("6. Exit");
                        System.out.print("Choose an option (1-6): ");

                        String input = scan.nextLine();
                        try {
                            worldChoice = scan.nextInt();
                            if (worldChoice < 1 || worldChoice > 6) {
                                System.out.println("Invalid choice! Please choose from (1-6)!");
                                continue;
                            }

                        } catch (Exception e) {
                            System.out.println("Invalid input! Please choose from (1-6)!");
                            scan.next();
                            continue;
                        }

                        AdventureBattleSystem bs = new AdventureBattleSystem();

                        switch (worldChoice) {
                            case 1 -> {
                                RTL rtl = new RTL();
                                AdventureCharacter[] rtlEnemies = {
                                        rtl.new PaperHogger(),
                                        rtl.new ChalkBoy(),
                                        rtl.new Wierdo(),
                                        rtl.new RTLPhantom(),
                                        rtl.new BossPrincipal(),
                                };
                                System.out.println("Welcome to RTL!");
                                bs.startBattle(chosenHero, rtlEnemies);
                            }
                            case 2 -> {
                                GLE gle = new GLE();
                                AdventureCharacter[] gleEnemies = {
                                        gle.new Arkiiteks(),
                                        gle.new McCuePal(),
                                        gle.new DrNarrSingh(),
                                        gle.new SeerEnjeeniir(),
                                        gle.new BossG(),
                                };
                                System.out.println("Welcome to GLE!");
                                bs.startBattle(chosenHero, gleEnemies);
                            }
                            case 3 -> {
                                Gymnasium gym = new Gymnasium();
                                AdventureCharacter[] gymEnemies = {
                                        gym.new Coach(),
                                        gym.new YogaLolo(),
                                        gym.new DancingRolly(),
                                        gym.new SweatyJon(),
                                        gym.new ArnisDiablo(),
                                };
                                System.out.println("Welcome to Gymnasium!");
                                bs.startBattle(chosenHero, gymEnemies);
                            }
                            case 4 -> {
                                BasketballCourt bc = new BasketballCourt();
                                AdventureCharacter[] bcEnemies = {
                                        bc.new DribbleGableen(),
                                        bc.new SpikeJupeta(),
                                        bc.new BouncyAmpol(),
                                        bc.new Referee(),
                                        bc.new AuraMaster(),
                                };
                                System.out.println("Welcome to Basketball Court!");
                                bs.startBattle(chosenHero, bcEnemies);
                            }
                            case 5 -> {
                                Canteen ct = new Canteen();
                                AdventureCharacter[] ctEnemies = {
                                        ct.new GreedyJaede(),
                                        ct.new PanDeBureeCat(),
                                        ct.new OilyGreg(),
                                        ct.new SirEatallat(),
                                        ct.new ChefMamasitas(),
                                };
                                System.out.println("Welcome to Canteen!");
                                bs.startBattle(chosenHero, ctEnemies);
                            }
                            case 6 -> System.out.println("Returning to main menu...");
                        }

                    } while (worldChoice != 6);
                }

                case 2 -> {
                    System.out.println("====================================================================================================");
                    System.out.println("                                        HOW TO PLAY                                                   ");
                    System.out.println("====================================================================================================\n");

                    System.out.println("In Adventure Mode, you will begin by choosing your hero from the available characters, each with");
                    System.out.println("their own unique abilities. After selecting your hero, you can enter a world of your choice, such");
                    System.out.println("as the RTL, GLE, Gymnasium, Basketball Court, or Canteen.");
                    System.out.println();
                    System.out.println("Each world contains a series of battles where you must defeat enemies across multiple rounds. Expect");
                    System.out.println("to face mini-bosses and powerful bosses as you progress, with each fight becoming more challenging. ");
                    System.out.println("Survive all five rounds in a world by using your hero’s skills wisely, and you will claim victory.");
                    System.out.println();
                    System.out.println("====================================================================================================");

                    System.out.print("[Press Enter To Go Back]");
                        scan.nextLine();
                        scan.nextLine(); // waits for Enter
                }

                case 3 -> {
                    System.out.println("Exiting game...");
                    Main.main(null);
                }

                default -> System.out.println("Invalid choice!");
            }

        }
    }
}

 */
