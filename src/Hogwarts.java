public class Hogwarts {
    private String fullName;
    private int age;
    private String faculty;
    private int spellPower;
    private int transgressionRange;


    public Hogwarts(String fullName, int age, String faculty, int spellPower, int transgressionRange) {
        this.fullName = fullName;
        this.age = age;
        this.faculty = faculty;
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
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

    @Override
    public String toString() {
        return "Имя: " + fullName +
                "; Возраст = " + age +
                "; Факультет = " + faculty +
                "; Сила магии = " + spellPower +
                "; Расстояние трансгрессии = " + transgressionRange
                ;
    }
}
