public class Hufflepuff extends Hogwarts {
    private int industriousness; //Трудолюбие
    private int loyalty; //Верность
    private int honesty; //Честь

    public Hufflepuff(String fullName, int age, String faculty, int spellPower, int transgressionRange, int industriousness, int loyalty, int honesty) {
        super(fullName, age, faculty, spellPower, transgressionRange);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Имя: " + getFullName() +
                "; Возраст = " + getAge() +
                "; Факультет = " + getFaculty() +
                "; Сила магии = " + getSpellPower() +
                "; Расстояние трансгрессии = " + getTransgressionRange() +
                "; Трудолюбие = " + industriousness +
                "; Верность = " + loyalty +
                "; Честь = " + honesty
                ;
    }
}
