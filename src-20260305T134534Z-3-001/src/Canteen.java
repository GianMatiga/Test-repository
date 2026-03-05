import java.util.Random;

public class Canteen {

    private static final Random rand = new Random();

    // Greedy Jaede
    public class GreedyJaede extends AdventureCharacter {
        public GreedyJaede() {
            super("Greedy Jaede", 450, "Canteen", "Food Zone");
        }

        @Override
        public void takeDamage(int dmg) {
            hp -= dmg;
            if (hp < 0) hp = 0;
        }

        @Override
        public void displayName() { System.out.print("                                                                                Greedy Jaede"); }

        @Override
        public void displayEnemy() { System.out.println("                                                                                Greedy Jaede\n" +
                "                                                                                Type: Normal\n" +
                "                                                                                HP: " + getHp()); }

        @Override
        public void displayStory() { System.out.println("                                                                                A hungry student who refuses to share even a single bite!"); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1. 🍖 Bite Chomp – 60–90 dmg");
            System.out.println("                                                                                2. 🤤 Hunger Rush – Attacks twice next turn");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Bite Chomp: A savage bite dealing moderate damage.");
            System.out.println("                                                                                - Hunger Rush: Attacks twice next turn.");
        }

        @Override
        public int skill1() {
            int dmg = rand.nextInt(31) + 60;
            System.out.println("                                                                                🍖 Greedy Jaede used Bite Chomp! 💥 Deals " + dmg + " damage!");
            return dmg;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                🤤 Greedy Jaede used Hunger Rush! Will attack twice next turn!");
            return 0;
        }

        @Override
        public int skill3() { return 0; }

        @Override
        public int getSkillCount() { return 2; }
    }

    // Pan-De-Buree Cat
    public class PanDeBureeCat extends AdventureCharacter {
        public PanDeBureeCat() {
            super("Pan-De-Buree Cat", 460, "Canteen", "Food Zone");
        }

        @Override
        public void takeDamage(int dmg) {
            hp -= dmg;
            if (hp < 0) hp = 0;
        }

        @Override
        public void displayName() { System.out.print("                                                                                Pan-De-Buree Cat"); }

        @Override
        public void displayEnemy() { System.out.println("                                                                                Pan-De-Buree Cat\n" +
                "                                                                                Type: Support\n" +
                "                                                                                HP: " + getHp()); }

        @Override
        public void displayStory() { System.out.println("                                                                                A chubby cat mascot who heals allies with bready love."); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1. 🍞 Bread Toss – 100–140 dmg");
            System.out.println("                                                                                2. 💖 Fluffy Heal – Restores 80 HP");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Bread Toss: Throws a hard bread loaf!");
            System.out.println("                                                                                - Fluffy Heal: Restores a bit of HP.");
        }

        @Override
        public int skill1() {
            int dmg = rand.nextInt(41) + 100;
            System.out.println("                                                                                🍞 Pan-De-Buree Cat used Bread Toss! 💥 Deals " + dmg + " damage!");
            return dmg;
        }

        @Override
        public int skill2() {
            int heal = 80;
            int actualHeal = Math.min(heal, maxHp - hp);
            hp += actualHeal;
            System.out.println("                                                                                💖 Pan-De-Buree Cat used Fluffy Heal! Restores " + actualHeal + " HP!");
            return actualHeal;
        }

        @Override
        public int skill3() { return 0; }

        @Override
        public int getSkillCount() { return 2; }
    }

    // Oily Greg
    public class OilyGreg extends AdventureCharacter {
        public OilyGreg() {
            super("Oily Greg", 480, "Canteen", "Food Zone");
        }

        @Override
        public void takeDamage(int dmg) {
            hp -= dmg;
            if (hp < 0) hp = 0;
        }

        @Override
        public void displayName() { System.out.print("                                                                                Oily Greg"); }

        @Override
        public void displayEnemy() { System.out.println("                                                                                Oily Greg\n" +
                "                                                                                Type: Greasy\n" +
                "                                                                                HP: " + getHp()); }

        @Override
        public void displayStory() { System.out.println("                                                                                A deep-fryer spirit that leaves oil wherever he goes!"); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1. 💦 Grease Splash – 110–150 dmg");
            System.out.println("                                                                                2. 🌀 Slip Trap – Reduces enemy accuracy");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Grease Splash: Deals slippery damage!");
            System.out.println("                                                                                - Slip Trap: Lowers the enemy's accuracy.");
        }

        @Override
        public int skill1() {
            int dmg = rand.nextInt(41) + 110;
            System.out.println("                                                                                💦 Oily Greg used Grease Splash! 💥 Deals " + dmg + " damage!");
            return dmg;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                🌀 Oily Greg used Slip Trap! Enemy accuracy reduced!");
            return 0;
        }

        @Override
        public int skill3() { return 0; }

        @Override
        public int getSkillCount() { return 2; }
    }

    // Sir Eatallat
    public class SirEatallat extends AdventureCharacter {
        public SirEatallat() {
            super("Sir Eatallat", 520, "Canteen", "Food Zone");
        }

        @Override
        public void takeDamage(int dmg) {
            hp -= dmg;
            if (hp < 0) hp = 0;
        }

        @Override
        public void displayName() { System.out.print("                                                                                Sir Eatallat"); }

        @Override
        public void displayEnemy() { System.out.println("                                                                                Sir Eatallat\n" +
                "                                                                                Type: Glutton\n" +
                "                                                                                HP: " + getHp()); }

        @Override
        public void displayStory() { System.out.println("                                                                                A mighty eater whose strength grows with every meal."); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1. 🍽️ Buffet Bash – 120–160 dmg");
            System.out.println("                                                                                2. 😋 Full Stomach – Restores 50 HP for 2 turns");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Buffet Bash: Deals heavy melee damage.");
            System.out.println("                                                                                - Full Stomach: Slowly regenerates health.");
        }

        @Override
        public int skill1() {
            int dmg = rand.nextInt(41) + 120;
            System.out.println("                                                                                🍽️ Sir Eatallat used Buffet Bash! 💥 Deals " + dmg + " damage!");
            return dmg;
        }

        @Override
        public int skill2() {
            int heal = 50;
            int actualHeal = Math.min(heal, maxHp - hp);
            hp += actualHeal;
            System.out.println("                                                                                😋 Sir Eatallat used Full Stomach! Restores " + actualHeal + " HP!");
            return actualHeal;
        }

        @Override
        public int skill3() { return 0; }

        @Override
        public int getSkillCount() { return 2; }
    }

    // Chef Mamasitas (Boss)
    public class ChefMamasitas extends AdventureCharacter {
        public ChefMamasitas() {
            super("Chef Mamasitas", 1100, "Canteen", "Food Zone");
        }

        @Override
        public void takeDamage(int dmg) {
            hp -= dmg;
            if (hp < 0) hp = 0;
        }

        @Override
        public void displayName() { System.out.print("                                                                                Chef Mamasitas"); }

        @Override
        public void displayEnemy() { System.out.println("                                                                                Chef Mamasitas\nType: Final Boss\nHP: " + getHp()); }

        @Override
        public void displayStory() { System.out.println("                                                                                The legendary master chef who rules the canteen kitchen with fiery passion!"); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1. 🔥 Sizzling Strike – 180–230 dmg");
            System.out.println("                                                                                2. 🍲 Boiling Rage – Adds 60 burn dmg for 2 turns");
            System.out.println("                                                                                3. 🍖 Feast of Fury – 300 dmg ultimate");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Sizzling Strike: Strong melee attack.");
            System.out.println("                                                                                - Boiling Rage: Burns the enemy for 2 turns.");
            System.out.println("                                                                                - Feast of Fury: A massive finishing blow!");
        }

        @Override
        public int skill1() {
            int dmg = rand.nextInt(51) + 180;
            System.out.println("                                                                                🔥 Chef Mamasitas used Sizzling Strike! 💥 Deals " + dmg + " damage!");
            return dmg;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                🍲 Chef Mamasitas used Boiling Rage! Adds 60 burn damage for 2 turns!");
            return 60;
        }

        @Override
        public int skill3() {
            System.out.println("                                                                                🍖 Chef Mamasitas used Feast of Fury! 💥 Deals 300 damage!");
            return 300;
        }

        @Override
        public int getSkillCount() { return 3; }
    }
}
