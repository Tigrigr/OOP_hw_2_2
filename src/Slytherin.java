public class Slytherin extends Hogwarts {
    private int trick; //Хитрость
    private int determination; //Решительность
    private int ambition; //Амбициозность
    private int resourcefulness; //Находчивость
    private int lustForPower; //Жажда власти

    public Slytherin(String fullName, int age, String faculty, int spellPower, int transgressionRange, int trick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, age, faculty, spellPower, transgressionRange);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Имя: " + getFullName() +
                "; Возраст = " + getAge() +
                "; Факультет = " + getFaculty() +
                "; Сила магии = " + getSpellPower() +
                "; Расстояние трансгрессии = " + getTransgressionRange() +
                "; Хитрость = " + trick +
                "; Решительность = " + determination +
                "; Амбициозность = " + ambition +
                "; Находчивость = " + resourcefulness +
                "; Жажда власти = " + lustForPower
                ;
    }
}
