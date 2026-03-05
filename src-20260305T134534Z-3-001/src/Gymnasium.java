import java.util.Random;

public class Gymnasium {

    private static final Random rand = new Random();

    public class Coach extends AdventureCharacter {
        private boolean isBuffed = false;

        public Coach() {
            super("Coach", 500, "Physical Education", "BPEd");
        }

        @Override
        public void takeDamage(int damage) {
            hp -= damage;
            if (hp < 0) hp = 0;
        }

        @Override
        public void displayName() { System.out.print("                                                                                Coach"); }

        @Override
        public void displayEnemy() { System.out.println("                                                                                Coach\n" +
                "                                                                                Type: Normal\n" +
                "                                                                                HP: " + getHp()); }

        @Override
        public void displayStory() { System.out.println("                                                                                The ever-energetic Coach who trains students to the brink of exhaustion."); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1️⃣ 📣 Whistle Strike – 110–140 dmg");
            System.out.println("                                                                                2️⃣ 💪 Motivation Shout – Boosts next attack by 25%");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Whistle Strike: Deals moderate damage.");
            System.out.println("                                                                                - Motivation Shout: Buffs next attack by 25%.");
        }

        @Override
        public int getSkillCount() { return 2; }

        @Override
        public int skill1() {
            int damage = rand.nextInt(31) + 110;
            if (isBuffed) {
                damage = (int)(damage * 1.25);
                System.out.println("                                                                                💪 Coach used Whistle Strike with Motivation Buff! Deals " + damage + " damage!");
                isBuffed = false;
            } else {
                System.out.println("                                                                                📣 Coach used Whistle Strike! Deals " + damage + " damage!");
            }
            return damage;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                💪 Coach used Motivation Shout! Next attack will be stronger!");
            isBuffed = true;
            return 0;
        }

        @Override
        public int skill3() { return 0; }
    }

    public class YogaLolo extends AdventureCharacter {
        public YogaLolo() {
            super("Yoga Lolo", 420, "Physical Education", "BPEd");
        }

        @Override
        public void takeDamage(int damage) {
            hp -= damage;
            if (hp < 0) hp = 0;
        }

        @Override
        public void displayName() { System.out.print("                                                                                Yoga Lolo"); }

        @Override
        public void displayEnemy() { System.out.println("                                                                                Yoga Lolo\nType: Spiritual\nHP: " + getHp()); }

        @Override
        public void displayStory() { System.out.println("                                                                                A master of flexibility who finds peace even in battle."); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1️⃣ 🫶 Calm Palm – 90–120 dmg");
            System.out.println("                                                                                2️⃣ 🧘 Inner Heal – Restores HP");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Calm Palm: Deals light damage with precision.");
            System.out.println("                                                                                - Inner Heal: Restores health through deep meditation.");
        }

        @Override
        public int getSkillCount() { return 2; }

        @Override
        public int skill1() {
            int damage = rand.nextInt(31) + 90;
            System.out.println("                                                                                🫶 Yoga Lolo used Calm Palm! Deals " + damage + " damage!");
            return damage;
        }

        @Override
        public int skill2() {
            int heal = 100;
            int actualHeal = Math.min(heal, maxHp - hp);
            hp += actualHeal;
            System.out.println("                                                                                🧘 Yoga Lolo used Inner Heal! Restoring HP.");
            return actualHeal;
        }


        @Override
        public int skill3() { return 0; }
    }

    public class DancingRolly extends AdventureCharacter {
        private boolean isDodging = false;

        public DancingRolly() {
            super("Dancing Rolly", 460, "Physical Education", "BPEd");
        }

        @Override
        public void takeDamage(int damage) {
            if (isDodging) {
                System.out.println("                                                                                💨 Dancing Rolly dodged the attack!");
                isDodging = false;
                return;
            }
            hp -= damage;
            if (hp < 0) hp = 0;
        }

        @Override
        public void displayName() { System.out.print("                                                                                Dancing Rolly"); }

        @Override
        public void displayEnemy() { System.out.println("                                                                                Dancing Rolly\n" +
                "                                                                                Type: Agile\n" +
                "                                                                                HP: " + getHp()); }

        @Override
        public void displayStory() { System.out.println("                                                                                An energetic performer whose dance moves double as deadly attacks."); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1️⃣ 💃 Twirl Kick – 100–140 dmg");
            System.out.println("                                                                                2️⃣ 🌀 Dance Dodge – Evades next attack");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Twirl Kick: Spins into the opponent for a strong hit.");
            System.out.println("                                                                                - Dance Dodge: Evades the next incoming attack.");
        }

        @Override
        public int getSkillCount() { return 2; }

        @Override
        public int skill1() {
            int damage = rand.nextInt(41) + 100;
            System.out.println("                                                                                💃 Dancing Rolly used Twirl Kick! Deals " + damage + " damage!");
            return damage;
        }

        @Override
        public int skill2() {
            isDodging = true;
            System.out.println("                                                                                🌀 Dancing Rolly used Dance Dodge! Will evade next attack!");
            return 0;
        }

        @Override
        public int skill3() { return 0; }
    }

    public class SweatyJon extends AdventureCharacter {
        public SweatyJon() {
            super("Sweaty Jon", 480, "Physical Education", "BPEd");
        }

        @Override
        public void takeDamage(int damage) {
            hp -= damage;
            if (hp < 0) hp = 0;
        }

        @Override
        public void displayName() { System.out.print("                                                                                Sweaty Jon"); }

        @Override
        public void displayEnemy() { System.out.println("                                                                                Sweaty Jon\nType: Normal\nHP: " + getHp()); }

        @Override
        public void displayStory() { System.out.println("                                                                                A gym rat whose sweat is deadlier than most weapons."); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1️⃣ 💦 Sweat Slam – 110–150 dmg");
            System.out.println("                                                                                2️⃣ 🧴 Sticky Drip – Slows enemy");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Sweat Slam: Heavy body slam attack.");
            System.out.println("                                                                                - Sticky Drip: Slows down opponent’s movement.");
        }

        @Override
        public int getSkillCount() { return 2; }

        @Override
        public int skill1() {
            int damage = rand.nextInt(41) + 110;
            System.out.println("                                                                                💦 Sweaty Jon used Sweat Slam! Deals " + damage + " damage!");
            return damage;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                🧴 Sweaty Jon used Sticky Drip! Enemy slowed!");
            return 0;
        }

        @Override
        public int skill3() { return 0; }
    }

    public class ArnisDiablo extends AdventureCharacter {
        private boolean isEmpowered = false;

        public ArnisDiablo() {
            super("Arnis Diablo", 1000, "Physical Education", "BPEd");
        }

        @Override
        public void takeDamage(int damage) {
            hp -= damage;
            if (hp < 0) hp = 0;
        }

        @Override
        public void displayName() { System.out.print("                                                                                Arnis Diablo"); }

        @Override
        public void displayEnemy() { System.out.println("                                                                                Arnis Diablo\n" +
                "                                                                                Type: Boss\n" +
                "                                                                                HP: " + getHp()); }

        @Override
        public void displayStory() { System.out.println("                                                                                A legendary martial artist who mastered the fiery arts of Arnis."); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1️⃣ 🥋 Stick Barrage – 160–200 dmg");
            System.out.println("                                                                                2️⃣ 🔥 Flame Kata – Burns for 50 dmg over 2 turns");
            System.out.println("                                                                                3️⃣ 😈 Infernal Form – Boosts damage by 50%");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Stick Barrage: A flurry of strikes with Arnis sticks.");
            System.out.println("                                                                                - Flame Kata: Adds a burning effect to the opponent.");
            System.out.println("                                                                                - Infernal Form: Increases damage output by 50%.");
        }

        @Override
        public int getSkillCount() { return 3; }

        @Override
        public int skill1() {
            int damage = rand.nextInt(41) + 160;
            if(isEmpowered) damage = (int)(damage * 1.5);
            System.out.println("                                                                                🥋 Arnis Diablo used Stick Barrage! Deals " + damage + " damage!");
            return damage;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                🔥 Arnis Diablo used Flame Kata! Burns for 50 damage over 2 turns!");
            return 50;
        }

        @Override
        public int skill3() {
            isEmpowered = true;
            System.out.println("                                                                                😈 Arnis Diablo used Infernal Form! Damage increased by 50% for next attacks!");
            return 0;
        }
    }
}
