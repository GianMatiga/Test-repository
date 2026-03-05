public abstract class AdventureCharacter {
    protected String name;
    protected int hp;
    protected int maxHp;
    protected String area;
    protected String zone;

    public AdventureCharacter(String name, int hp, String area, String zone) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp; // ✅ Store max HP
        this.area = area;
        this.zone = zone;
    }

    public int getHp() {
        return hp;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    // ✅ Reset HP before each battle
    public void resetHp() {
        this.hp = this.maxHp;
    }


    public abstract int  getSkillCount();
    public abstract void takeDamage(int dmg);
    public abstract void displayEnemy();
    public abstract void displayName();
    public abstract void displayStory();
    public abstract void displaySkills();
    public abstract void displaySkillsDescription();
    public abstract int skill1();
    public abstract int skill2();
    public abstract int skill3();
}
