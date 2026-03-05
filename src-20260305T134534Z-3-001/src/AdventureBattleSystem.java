import java.util.*;

public class AdventureBattleSystem {
    private static final Scanner scan = new Scanner(System.in);
    private static final Random rand = new Random();

    public void startBattle(Character hero, AdventureCharacter[] enemies) {

        System.out.println("\n");
        System.out.println("                                                                             ╔══════════════════════════════════════════════════════════════════════╗");
        System.out.println("                                                                                                  ⚔️  B A T T L E   S T A R T !  ⚔️                 ");
        System.out.println("                                                                             ╚══════════════════════════════════════════════════════════════════════╝");
        System.out.println("                                                                        ----------------------------------------------------------------------------------");

        int currentEnemyIndex = 0;
        int[] heroCooldown = new int[3]; // skill cooldown tracker

        while (currentEnemyIndex < enemies.length) {

            AdventureCharacter enemy = enemies[currentEnemyIndex];
            resetHealth(hero, enemy);

            System.out.println("                                                                                You encountered:");
            enemy.displayEnemy();
            System.out.println();
            enemy.displaySkills();

            while (hero.isAlive() && enemy.getHp() > 0) {

                displayBattleStatus(hero, enemy);
                int action = getValidSkillChoice(hero);

                int damage = hero.useSkill(action);
                //enemy.takeDamage(damage);

                if (damage > 0) {
                    System.out.println("\n                                                                                ⚔️ " + hero.getName() + " used skill " + action + "! Deals " + damage + " damage!");
                }

                enemy.takeDamage(damage);

                if (enemy.getHp() > 0) {
                    enemyAttack(hero, enemy);
                }

                if (!hero.isAlive()) {
                    System.out.println("\n                                                                                💀 You were defeated... Please try again...");
                    return;
                }

                if (enemy.getHp() <= 0) {
                    System.out.println("                                                                                ☠️ " + enemy.getClass().getSimpleName() + " has been defeated!");
                }

                reduceCooldowns(hero);
            }

            currentEnemyIndex++;

            if (currentEnemyIndex < enemies.length) {
                System.out.println("\n                                                                                ➡️ Moving to the next enemy...\n");
            }
        }

        System.out.println("                                                                                🏆 Congratulations! You cleared the ");

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
    }


    private void displayBattleStatus(Character hero, AdventureCharacter enemy) {
        System.out.println("                                                                        ┌────────────────────────────────────────────────────────────────────────────────┐");
        System.out.println("                                                                                                💚 Your HP: " + hero.getHp() + " | 💢 Enemy HP: " + enemy.getHp());
        System.out.println("                                                                        └────────────────────────────────────────────────────────────────────────────────┘");
    }

    private void enemyAttack(Character hero, AdventureCharacter enemy) {
        System.out.println("                                                                                ⚠️ The enemy prepares to strike back!");

        int maxSkill = enemy.getSkillCount();
        int enemyAction = rand.nextInt(maxSkill) + 1;

        int enemyDamage = switch (enemyAction) {
            case 1 -> enemy.skill1();
            case 2 -> enemy.skill2();
            case 3 -> enemy.skill3();
            default -> 0;
        };

        if (enemyDamage > 0) {
            hero.takeDamage(enemyDamage);
        }
    }

    private void resetHealth(Character hero, AdventureCharacter enemy) {
        hero.resetHp();
        enemy.resetHp();
    }

    private static int getValidSkillChoice(Character player) {
        while (true) {
            player.displaySkills();
            System.out.print("                                                                                Enter choice (1–3): ");

            int choice = getValidSkillInput();

            if (isSkillReady(player, choice)) {
                return choice;
            } else {
                System.out.println("                                                                                ❌ That skill is still on cooldown! Please choose another skill.\n");
            }
        }
    }

    private static int getValidSkillInput() {
        while (true) {
            try {
                int input = Integer.parseInt(scan.nextLine().trim());
                if (input >= 1 && input <= 3) return input;
                System.out.print("                                                                              ❌ Invalid choice. Enter (1–3): ");
            } catch (Exception e) {
                System.out.print("                                                                              ❌ Please enter a number (1–3): ");
            }
        }
    }

    private static boolean isSkillReady(Character c, int skill) {
        return switch (skill) {
            case 1 -> c.cd1 == 0;
            case 2 -> c.cd2 == 0;
            case 3 -> c.cd3 == 0;
            default -> false;
        };
    }

    private static void reduceCooldowns(Character c) {
        if (c.cd1 > 0) c.cd1--;
        if (c.cd2 > 0) c.cd2--;
        if (c.cd3 > 0) c.cd3--;
    }
}