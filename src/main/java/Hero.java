public class Hero {
    private String heroName;
    private int heroAge;
    private String heroStrength;
    private String heroWeakness;
    private int heroId;
    private int squadId;

    public Hero(String heroName, int heroAge, String heroStrength, String heroWeakness, int heroId, int squadId) {
        this.heroName = heroName;
        this.heroAge = heroAge;
        this.heroStrength = heroStrength;
        this.heroWeakness = heroWeakness;
        this.heroId = heroId;
        this.squadId = squadId;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getHeroAge() {
        return heroAge;
    }

    public void setHeroAge(int heroAge) {
        this.heroAge = heroAge;
    }

    public String getHeroStrength() {
        return heroStrength;
    }

    public void setHeroStrength(String heroStrength) {
        this.heroStrength = heroStrength;
    }

    public String getHeroWeakness() {
        return heroWeakness;
    }

    public void setHeroWeakness(String heroWeakness) {
        this.heroWeakness = heroWeakness;
    }

    public int getHeroId() {
        return heroId;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    public int getSquadId() {
        return squadId;
    }

    public void setSquadId(int squadId) {
        this.squadId = squadId;
    }
}
