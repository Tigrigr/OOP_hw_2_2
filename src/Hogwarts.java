public class Hogwarts {
    private String fullName;
    private int age;
    private int spellPower;
    private int transgressionRange;


    public Hogwarts(String fullName, int age, int spellPower, int transgressionRange) {
        this.fullName = fullName;
        this.age = age;
        this.spellPower = spellPower;
        this.transgressionRange = transgressionRange;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getTransgressionRange() {
        return transgressionRange;
    }

    public void setTransgressionRange(int transgressionRange) {
        this.transgressionRange = transgressionRange;
    }
}
