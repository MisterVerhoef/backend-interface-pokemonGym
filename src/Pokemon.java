public abstract class Pokemon {

    private String name;
    private int level;
    private int hp;
    private String food;
    private String sound;

    private Pokemon(String food, int hp, int level, String name, String sound) {
        this.food = food;
        this.hp = hp;
        this.level = level;
        this.name = name;
        this.sound = sound;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
